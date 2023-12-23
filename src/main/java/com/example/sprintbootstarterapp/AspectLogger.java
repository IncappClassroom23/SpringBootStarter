package com.example.sprintbootstarterapp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLogger {
    @Before("execution(* com.example.sprintbootstarterapp.service.Calculator.divide(..))")
    public void logBefore() {
        System.out.println("Logging before the method is called");
    }

    @After("execution(* com.example.sprintbootstarterapp.service.Calculator.divide(..))")
    public void logAfter() {
        System.out.println("Logging after the method is called");
    }

    @AfterReturning("execution(* com.example.sprintbootstarterapp.service.Calculator.divide(..))")
    public void logAfterReturning() {
        System.out.println("Logging after returning the method is called");
    }

    @AfterThrowing("execution(* com.example.sprintbootstarterapp.service.Calculator.divide(..))")
    public void logAfterThrowing() {
        System.out.println("Logging after throwing the method is called");
    }

    @Around("execution(* com.example.sprintbootstarterapp.service.Calculator.divide(int, int)) && args(a,b)")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint, int a, int b) throws Throwable {
        System.out.println("Around advice - Before");

        Object[] modifiedArgs = joinPoint.getArgs();
        int modifiedA = a + 10;
        int modifiedB = b - 10;

        // You can control whether to proceed or not
        // Commenting out the next line will prevent the actual method from being called
        // Proceed with the modified arguments
        Object result = joinPoint.proceed(new Object[]{modifiedA, modifiedB});

        System.out.println("Around advice - After");
        // Modify the result if needed
        int modifiedResult = (int) result * 4;
        return modifiedResult;
    }
}
