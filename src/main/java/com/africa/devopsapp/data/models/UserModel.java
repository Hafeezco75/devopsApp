package com.africa.devopsapp.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String username;
    private String password;

}
