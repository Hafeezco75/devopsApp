package com.africa.devopsapp.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginUserRequest {
    private String username;
    private String password;
}
