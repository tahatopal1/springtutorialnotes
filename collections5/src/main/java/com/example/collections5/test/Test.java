package com.example.collections5.test;

import com.example.collections5.model.BasketballPlayers;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        BasketballPlayers basketballPlayers = configurableApplicationContext.getBean("bean", BasketballPlayers.class);

        System.out.println("Printing list elements...");
        for (String s : basketballPlayers.getList()) {
            System.out.println(s);
        }

        System.out.println("***********************");
        System.out.println("Printing map elements...");

        for (String s : basketballPlayers.getMap().keySet())
            System.out.println(s.concat("-").concat(basketballPlayers.getMap().get(s)));

        System.out.println("***********************");
        System.out.println("Printing properties elements...");

        for (String s : basketballPlayers.getProperties().stringPropertyNames())
            System.out.println(s.concat("-").concat(basketballPlayers.getProperties().get(s).toString()));
    }
}
