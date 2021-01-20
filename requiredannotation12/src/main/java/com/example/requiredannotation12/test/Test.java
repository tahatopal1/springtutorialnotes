package com.example.requiredannotation12.test;

import com.example.requiredannotation12.model.Member;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        try {
            ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
            Member member = new Member();



        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
