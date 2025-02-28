package com.africa.devopsapp.data.repositories;


import com.africa.devopsapp.data.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

    UserModel findByUsername(String username);

}
