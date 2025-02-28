package com.africa.devopsapp.dtos.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegisterUserResponse {
    private String userName;
    private String message;

}
