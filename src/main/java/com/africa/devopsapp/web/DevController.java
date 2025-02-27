package com.africa.devopsapp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DevController {

    @GetMapping("/app")
    public String getName(){
        return "DevopsApp";
    }

}
