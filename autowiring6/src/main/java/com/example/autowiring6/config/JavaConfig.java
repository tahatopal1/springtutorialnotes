package com.example.autowiring6.config;

import com.example.autowiring6.model.Employee;
import com.example.autowiring6.model.Member;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean(name = "member")
    public Member getMemberBean() {
        return new Member("Name", "Surname", 0);
    }

    @Bean(autowire = Autowire.BY_NAME)
    public Employee getEmployeeBean() {
        return new Employee();
    }

}
