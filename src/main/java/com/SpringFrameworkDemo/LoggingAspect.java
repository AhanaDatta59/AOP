package com.SpringFrameworkDemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout())")
    public void logger(){
        System.out.println("Loggers");
    }
}
