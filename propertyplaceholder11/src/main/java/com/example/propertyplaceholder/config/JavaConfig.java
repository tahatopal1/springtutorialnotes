package com.example.propertyplaceholder.config;

import com.example.propertyplaceholder.model.Member;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class JavaConfig {

    @Value("${name}")
    private String name;

    @Value("${surname}")
    private String surname;

    @Value("${age}")
    private int age;

    @Bean
    public Member getMemberBean(){
        return new Member(name, surname, age);
    }

}
