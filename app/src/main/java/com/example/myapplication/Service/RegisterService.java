package com.example.myapplication.Service;


import com.example.myapplication.Request.RegisterRequest;
import com.example.myapplication.Response.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RegisterService {

    @POST("/auth/login")
    Call<RegisterResponse> RegisterUser (@Body RegisterRequest registerRequest);


}
