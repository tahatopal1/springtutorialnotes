package com.example.messagesource15;

import com.example.messagesource15.config.JavaConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class Test {
    public static void main(String[] args) {

        // XML config test
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        String message = applicationContext.getMessage("failure.login.message", null, Locale.US);
        System.out.println("XML Config test: " + message);

        message = applicationContext.getMessage("failure.login.message", null, new Locale("tr", "TR"));
        System.out.println("Java config test: " + message);

        applicationContext.close();

        // Java config test
        applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        message = applicationContext.getMessage("failure.login.message", null, Locale.US);
        System.out.println("XML Config test: " + message);

        message = applicationContext.getMessage("failure.login.message", null, new Locale("tr", "TR"));
        System.out.println("Java config test: " + message);
    }
}
