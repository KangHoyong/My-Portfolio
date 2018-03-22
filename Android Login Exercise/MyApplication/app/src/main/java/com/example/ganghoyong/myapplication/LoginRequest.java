package com.example.ganghoyong.myapplication;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ganghoyong on 2016. 4. 16..
 */
public class LoginRequest extends StringRequest{


    public static final String LOGIN_REQUEST_URL = "http://localhost_ip_number/Login.php";
    private Map<String, String > params;

    public LoginRequest(String email, String password, Response.Listener<String> listener) {

        super(Request.Method.POST, LOGIN_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("email",email);
        params.put("password",password);
    }

    @Override
    public Map<String, String> getParams(){
        return params;
    }
}

