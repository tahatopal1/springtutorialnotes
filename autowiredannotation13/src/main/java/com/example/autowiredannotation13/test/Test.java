package com.example.autowiredannotation13.test;

import com.example.autowiredannotation13.model.Employee;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Employee employee = applicationContext.getBean("employee", Employee.class);

        System.out.println(employee);
        applicationContext.close();
    }
}
