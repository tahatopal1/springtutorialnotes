package com.example.propertyplaceholder.test;

import com.example.propertyplaceholder.config.EnvironmentConfig;
import com.example.propertyplaceholder.config.JavaConfig;
import com.example.propertyplaceholder.model.Member;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        // XML config example
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Member member = applicationContext.getBean("member1", Member.class);
        System.out.println(member);

        // Java config example
        applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        member = applicationContext.getBean(Member.class);
        System.out.println(member);

        // Environment config example
        applicationContext = new AnnotationConfigApplicationContext(EnvironmentConfig.class);
        member = applicationContext.getBean(Member.class);
        System.out.println(member);

    }
}
