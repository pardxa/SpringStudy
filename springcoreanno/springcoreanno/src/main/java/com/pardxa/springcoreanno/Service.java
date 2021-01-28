package com.pardxa.springcoreanno;

import org.springframework.stereotype.Component;

@Component
public class Service {
    public void doIt(){
        System.out.println("Now in Service class!");
    }
}