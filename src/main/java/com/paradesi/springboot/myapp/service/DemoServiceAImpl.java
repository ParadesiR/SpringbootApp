package com.paradesi.springboot.myapp.service;

import org.springframework.stereotype.Component;

@Component
public class DemoServiceAImpl implements DemoServiceA {

    @Override
    public String getWorkout() {
        return "Run hard for 10K";
    }
}
