package com.example.sprintbootstarterapp.service;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public void add(int x, int y){
         System.out.println(x+y);
    }
}
