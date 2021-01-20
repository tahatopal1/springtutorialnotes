package com.example.initdestroy8.test;

import com.example.initdestroy8.config.JavaConfig;
import com.example.initdestroy8.model.Member;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        // Xml config example
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Member member = applicationContext.getBean("member", Member.class);
        applicationContext.close();

        // Java config example
        applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        member = applicationContext.getBean(Member.class);
        applicationContext.close();

    }
}
