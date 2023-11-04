package com.paradesi.springboot.myapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @Value("${project.actualName}")
    private String projectName;

    @Value("${project.developer}")
    private String developerName;

    @GetMapping("/person/{name}")
    public String sayHi(@PathVariable("name") String name) {
        return "Hello " + name + ". This is " + this.projectName + ". \ndeveloped by " + this.developerName;
    }

    @GetMapping("/GetId")
    public int getId() {
        return 1010102;
    }

    @GetMapping("/getPhone")
    public String getPhone() {
        return "9603291219";
    }

}
