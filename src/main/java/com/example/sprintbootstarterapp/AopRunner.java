package com.example.sprintbootstarterapp;

import com.example.sprintbootstarterapp.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AopRunner implements CommandLineRunner {

    @Autowired
    Calculator calculator;

    @Override
    public void run(String... args) throws Exception {
        calculator.divide(60,20);
    }
}
