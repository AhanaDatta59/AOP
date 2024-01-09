package com.SpringFrameworkDemo;
import org.springframework.stereotype.Component;

@Component//making iit a bean
public class ShoppingCart {
    public void checkout() {
        //Logging
        //Authentication & Authorization
        //Sanitization of data

        System.out.println("Checkout method from shopping cart has been called Ahana");
    }
}
