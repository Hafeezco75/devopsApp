package com.africa.devopsapp.web;

import com.africa.devopsapp.dtos.requests.RegisterUserRequest;
import com.africa.devopsapp.dtos.response.RegisterUserResponse;
import com.africa.devopsapp.services.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@AllArgsConstructor
public class DevController {

    private UserServices userServices;

    @GetMapping("/app")
    public String getName(){
        return "DevopsApp";
    }


    @PostMapping("/register")
    public HttpEntity<?>RegisterUserResponse(RegisterUserRequest userRequest){
        try {
            RegisterUserResponse userResponse = userServices.getUser(userRequest);
            return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_GATEWAY);
        }
    }



}
