package com.africa.devopsapp.services;

import com.africa.devopsapp.dtos.requests.RegisterUserRequest;
import com.africa.devopsapp.dtos.response.RegisterUserResponse;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@AllArgsConstructor
public class UserServicesTest {

    private UserServices userServices;

    @Test
    public void testThatUserCanBeVerified(){
        RegisterUserRequest registerUser = new RegisterUserRequest();
        registerUser.setUsername("walex5347");
        registerUser.setPassword("12345");
        RegisterUserResponse userResponse = userServices.getUser(registerUser);
        assertThat(userResponse).isNotNull();
        assertThat(userResponse).isEqualTo("User Registered Sucessfully");
    }

}
