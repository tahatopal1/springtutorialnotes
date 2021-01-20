package com.example.beanpostprocessor9.test;

import com.example.beanpostprocessor9.config.JavaConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        // Xml config example
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        applicationContext.close();

        // Java config exaple
        applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        applicationContext.close();
    }
}
