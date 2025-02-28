package com.africa.devopsapp.services;

import com.africa.devopsapp.dtos.requests.LoginUserRequest;
import com.africa.devopsapp.dtos.requests.RegisterUserRequest;
import com.africa.devopsapp.dtos.response.LoginUserResponse;
import com.africa.devopsapp.dtos.response.RegisterUserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserServices {

    RegisterUserResponse getUser(RegisterUserRequest registerUser);

    LoginUserResponse userResponse(LoginUserRequest user);
}
