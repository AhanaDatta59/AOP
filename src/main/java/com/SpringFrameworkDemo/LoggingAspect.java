package com.SpringFrameworkDemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.SpringFrameworkDemo.ShoppingCart.checkout(..))")
    public void beforelogger(JoinPoint jp){
        System.out.println(jp.getArgs()[0].toString());
        System.out.println(" Before Loggers");
    }

    @After("execution(* com.SpringFrameworkDemo.ShoppingCart.checkout(..))")
    public void afterlogger(){
        System.out.println(" After Loggers");
    }

//    @Pointcut("execution(* com.SpringFrameworkDemo.ShoppingCart.quantity(..))")
//    public void afterReturningPointCut(){
//
//    }
//    @AfterReturning(pointcut = "afterReturningPointCut",returning = "retVal")
//    public void afterReturning(String retVal){
//        System.out.println("After returning: "+retVal);
//    }
}
