/* getenv.c - retrieve EFI variables.  */
/*
 *  GRUB  --  GRand Unified Bootloader
 *  Copyright (C) 2009  Free Software Foundation, Inc.
 *  Copyright (C) 2014  CoreOS, Inc.
 *
 *  GRUB is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  GRUB is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with GRUB.  If not, see <http://www.gnu.org/licenses/>.
 */

#include <grub/efi/efi.h>
#include <grub/dl.h>
#include <grub/env.h>
#include <grub/err.h>
#include <grub/extcmd.h>
#include <grub/i18n.h>
#include <grub/misc.h>
#include <grub/mm.h>

GRUB_MOD_LICENSE ("GPLv3+");

static const struct grub_arg_option options_getenv[] = {
  {"var-name", 'e', 0,
   N_("Environment variable to query"),
   N_("VARNAME"), ARG_TYPE_STRING},
  {"var-guid", 'g', 0,
   N_("GUID of environment variable to query"),
   N_("GUID"), ARG_TYPE_STRING},
  {"binary", 'b', 0,
   N_("Read binary data and represent it as hex"),
   0, ARG_TYPE_NONE},
  {0, 0, 0, 0, 0, 0}
};

enum options_getenv
{
  GETENV_VAR_NAME,
  GETENV_VAR_GUID,
  GETENV_BINARY,
};

static grub_err_t
grub_cmd_getenv (grub_extcmd_context_t ctxt, int argc, char **args)
{
  struct grub_arg_list *state = ctxt->state;
  char *envvar = NULL, *guid = NULL, *bindata = NULL, *data = NULL;
  grub_size_t datasize;
  grub_efi_guid_t efi_var_guid;
  grub_efi_boolean_t binary = state[GETENV_BINARY].set;
  unsigned int i;

  if (!state[GETENV_VAR_NAME].set || !state[GETENV_VAR_GUID].set)
    {
      grub_error (GRUB_ERR_INVALID_COMMAND, N_("-e and -g are required"));
      goto done;
    }

  if (argc != 1)
    {
      grub_error (GRUB_ERR_BAD_ARGUMENT, N_("unexpected arguments"));
      goto done;
    }

  envvar = state[GETENV_VAR_NAME].arg;
  guid = state[GETENV_VAR_GUID].arg;

  if (grub_strlen(guid) != 36 ||
      guid[8] != '-' ||
      guid[13] != '-' ||
      guid[18] != '-' ||
      guid[23] != '-')
    {
      grub_error (GRUB_ERR_BAD_ARGUMENT, N_("invalid GUID"));
      goto done;
    }

  /* Forgive me father for I have sinned */
  guid[8] = 0;
  efi_var_guid.data1 = grub_strtoul(guid, NULL, 16);
  guid[13] = 0;
  efi_var_guid.data2 = grub_strtoul(guid + 9, NULL, 16);
  guid[18] = 0;
  efi_var_guid.data3 = grub_strtoul(guid + 14, NULL, 16);
  efi_var_guid.data4[7] = grub_strtoul(guid + 34, NULL, 16);
  guid[34] = 0;
  efi_var_guid.data4[6] = grub_strtoul(guid + 32, NULL, 16);
  guid[32] = 0;
  efi_var_guid.data4[5] = grub_strtoul(guid + 30, NULL, 16);
  guid[30] = 0;
  efi_var_guid.data4[4] = grub_strtoul(guid + 28, NULL, 16);
  guid[28] = 0;
  efi_var_guid.data4[3] = grub_strtoul(guid + 26, NULL, 16);
  guid[26] = 0;
  efi_var_guid.data4[2] = grub_strtoul(guid + 24, NULL, 16);
  guid[23] = 0;
  efi_var_guid.data4[1] = grub_strtoul(guid + 21, NULL, 16);
  guid[21] = 0;
  efi_var_guid.data4[0] = grub_strtoul(guid + 19, NULL, 16);

  data = grub_efi_get_variable(envvar, &efi_var_guid, &datasize);

  if (!data || !datasize)
    {
      grub_error (GRUB_ERR_FILE_NOT_FOUND, N_("No such variable"));
      goto done;
    }

  if (binary)
    {
      bindata = grub_zalloc(datasize * 2 + 1);
      for (i=0; i<datasize; i++)
	  grub_snprintf(bindata + i*2, 3, "%02x", data[i]);

      if (grub_env_set (args[0], bindata))
	goto done;
    }
  else if (grub_env_set (args[0], data))
    {
      goto done;
    }

  grub_errno = GRUB_ERR_NONE;

done:
  grub_free(bindata);
  grub_free(data);
  return grub_errno;
}

static grub_extcmd_t cmd_getenv;

GRUB_MOD_INIT(getenv)
{
  cmd_getenv = grub_register_extcmd ("getenv", grub_cmd_getenv, 0,
				   N_("-e envvar -g guidenv setvar"),
				   N_("Read a firmware environment variable"),
				   options_getenv);
}

GRUB_MOD_FINI(getenv)
{
  grub_unregister_extcmd (cmd_getenv);
}
