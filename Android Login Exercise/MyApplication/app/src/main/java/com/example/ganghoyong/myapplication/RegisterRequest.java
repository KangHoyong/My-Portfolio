package com.example.ganghoyong.myapplication;

import com.android.volley.toolbox.StringRequest;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ganghoyong on 2016. 4. 16..
 */
public class RegisterRequest extends StringRequest {

    public static final String REGISTER_REQUEST_URL = "http://localhost_ip_number/register.php";
    private Map<String, String > params;

    public RegisterRequest(String name, String email, String password, Response.Listener<String> listener) {

        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("email",email);
        params.put("password",password);
    }

    @Override
    public Map<String, String> getParams(){
        return params;
    }
}
