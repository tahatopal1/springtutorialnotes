package com.example.iocsetter2.test;

import com.example.iocsetter2.config.JavaConfig;
import com.example.iocsetter2.model.Member;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        // Xml config test
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Member member = configurableApplicationContext.getBean("member", Member.class);

        System.out.println("Member; Name: ".concat(member.getName())
                .concat(" , Surname: ")
                .concat(member.getSurname())
                .concat(" , Age: ")
                .concat(member.getAge()));

        // Java config test

        configurableApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        member = configurableApplicationContext.getBean(Member.class);
        System.out.println("Member; Name: ".concat(member.getName())
                .concat(" , Surname: ")
                .concat(member.getSurname())
                .concat(" , Age: ")
                .concat(member.getAge()));

        configurableApplicationContext.close();
    }
}
