package com.github.hieuvo.springbootprofiles.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiResource {

    @Autowired
    private Environment environment;

    @GetMapping("/test-profile")
    public String getDemoProfile(){
        return environment.getProperty("spring.application.name");
    }


}
