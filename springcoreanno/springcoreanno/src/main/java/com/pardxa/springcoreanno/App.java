package com.pardxa.springcoreanno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "com.pardxa.springcoreanno");
        Consumer con = context.getBean(com.pardxa.springcoreanno.Consumer.class);
        con.consume();
        context.close();
    }
}
