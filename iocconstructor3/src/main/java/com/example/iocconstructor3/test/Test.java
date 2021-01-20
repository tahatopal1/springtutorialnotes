package com.example.iocconstructor3.test;

import com.example.iocconstructor3.config.JavaConfig;
import com.example.iocconstructor3.model.Member;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        // Xml config example
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Member member = applicationContext.getBean("beanWithProp", Member.class);
        System.out.println(member);

        member = applicationContext.getBean("beanWithIndex", Member.class);
        System.out.println(member);

        // Java config example
        applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        member = applicationContext.getBean(Member.class);
        System.out.println(member);

        applicationContext.close();

    }
}
