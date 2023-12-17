package com.example.sprintbootstarterapp;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Before;

//@Component
@Aspect
public class AspectLogger {
    @Before("execution(* com.example.sprintbootstarterapp.service.Calculator.add(..))")
    public void logBefore() {
        System.out.println("Logging before the method is called");
    }

    @After("execution(* com.example.sprintbootstarterapp.service.Calculator.add(..))")
    public void logAfter() {
        System.out.println("Logging after the method is called");
    }
}
