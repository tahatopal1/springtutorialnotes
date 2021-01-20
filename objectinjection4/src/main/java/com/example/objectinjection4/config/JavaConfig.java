package com.example.objectinjection4.config;

import com.example.objectinjection4.model.Employee;
import com.example.objectinjection4.model.Member;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    public Member getMemberBean() {
        return new Member("Name", "Surname", 0);
    }

    @Bean
    public Employee getEmployeeBean() {
        return new Employee("Role", getMemberBean());
    }

}
