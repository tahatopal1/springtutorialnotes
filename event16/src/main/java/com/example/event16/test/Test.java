package com.example.event16.test;

import com.example.event16.publisher.CarPublisher;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        CarPublisher carPublisher = applicationContext.getBean("carPublisher", CarPublisher.class);

        carPublisher.publishMainEvent();
        applicationContext.close();
    }
}
