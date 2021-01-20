package com.example.beaninheritance7.test;

import com.example.beaninheritance7.model.Member;
import com.example.beaninheritance7.model.MemberList;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Member member = applicationContext.getBean("member", Member.class);

        MemberList memberList = applicationContext.getBean("listBean", MemberList.class);
        memberList.getMemberList().forEach(elm -> System.out.println(elm));

        System.out.println(member);
        applicationContext.close();
    }
}
