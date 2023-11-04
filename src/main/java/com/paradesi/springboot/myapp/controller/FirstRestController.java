package com.paradesi.springboot.myapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @Value("${project.actualName}")
    private String projectName;

    @Value("${project.developer}")
    private String developerName;

    @GetMapping("/")
    public String sayHi() {
        return "This is " + this.projectName + ". \ndeveloped by a well-known person named " + this.developerName;
    }


}
