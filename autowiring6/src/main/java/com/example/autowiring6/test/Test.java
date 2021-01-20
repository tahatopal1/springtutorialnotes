package com.example.autowiring6.test;

import com.example.autowiring6.config.JavaConfig;
import com.example.autowiring6.model.Employee;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        // Xml config example
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Employee employee = configurableApplicationContext.getBean("employee", Employee.class);
        System.out.println(employee);

        System.out.println("********************");

        // Java config example
        configurableApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        employee = configurableApplicationContext.getBean(Employee.class);
        System.out.println(employee);

    }
}
