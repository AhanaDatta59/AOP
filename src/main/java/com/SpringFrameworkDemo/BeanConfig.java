package com.SpringFrameworkDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.SpringFrameworkDemo")
@EnableAspectJAutoProxy
public class BeanConfig {
}
