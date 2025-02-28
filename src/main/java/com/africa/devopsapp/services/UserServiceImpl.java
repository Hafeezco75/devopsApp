package com.africa.devopsapp.services;

import com.africa.devopsapp.data.models.UserModel;
import com.africa.devopsapp.data.repositories.UserRepository;
import com.africa.devopsapp.dtos.requests.LoginUserRequest;
import com.africa.devopsapp.dtos.response.LoginUserResponse;
import com.africa.devopsapp.dtos.response.RegisterUserResponse;
import com.africa.devopsapp.dtos.requests.RegisterUserRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserServices{

    private UserRepository userRepository;

    @Override
    public RegisterUserResponse getUser(RegisterUserRequest registerUser){
        UserModel user = new UserModel();
        user.setUsername(registerUser.getUsername().trim());
        user.setPassword(registerUser.getPassword().trim());
        userRepository.save(user);

        RegisterUserResponse response = new RegisterUserResponse();
        response.setMessage("User registered successfully");
        return response;
    }

    @Override
    public LoginUserResponse userResponse(LoginUserRequest user){
        UserModel loguser = userRepository.findByUsername(user.getUsername().trim());
        userRepository.save(loguser);
        LoginUserResponse response = new LoginUserResponse();
        response.setMessage("User logged in successfully");
        return response;
    }
}
