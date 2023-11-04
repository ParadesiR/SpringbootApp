package com.paradesi.springboot.myapp.controller;

import com.paradesi.springboot.myapp.service.DemoServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoServiceA demoServiceA;

    // @Autowired is optional if only one constructor is present
    DemoController(DemoServiceA demoServiceA) {
        this.demoServiceA = demoServiceA;
    }

    @GetMapping("/getWorkout")
    public String getTodayWorkout() {
        return demoServiceA.getWorkout();
    }
}
