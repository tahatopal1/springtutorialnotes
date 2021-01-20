package com.example.componentannotation14.test;

import com.example.componentannotation14.config.JavaConfig;
import com.example.componentannotation14.model.Employee;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        // XML config example
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Employee employee = applicationContext.getBean("employee", Employee.class);
        System.out.println(employee);

        // Java config example
        applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        employee = applicationContext.getBean(Employee.class);
        System.out.println(employee);

        applicationContext.close();
    }
}
