package com.example.beanpostprocessor10.test;

import com.example.beanpostprocessor10.config.JavaConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        // XML config example
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        applicationContext.close();

        // Java config example
        applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        applicationContext.close();
    }
}
