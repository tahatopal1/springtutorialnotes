package com.example.objectinjection4.test;

import com.example.objectinjection4.config.JavaConfig;
import com.example.objectinjection4.model.Employee;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        // Xml config example
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Employee employee = configurableApplicationContext.getBean("employee", Employee.class);
        System.out.println(employee);

        // Inner bean example
        employee = configurableApplicationContext.getBean("innerBean", Employee.class);
        System.out.println(employee);

        // Java config example
        configurableApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        employee = configurableApplicationContext.getBean(Employee.class);
        System.out.println(employee);

        configurableApplicationContext.close();

    }
}
