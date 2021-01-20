package com.example.propertyplaceholder.config;

import com.example.propertyplaceholder.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
        @PropertySource("classpath:application.properties")
})
public class EnvironmentConfig {

    @Autowired
    private Environment environment;

    @Bean
    public Member getMemberBean(){
        String name     = this.environment.getProperty("name");
        String surname  = this.environment.getProperty("surname");
        int age         = Integer.parseInt(this.environment.getProperty("age"));

        return new Member(name, surname, age);
    }

}
