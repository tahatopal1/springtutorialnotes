package com.example.initdestroy8.config;

import com.example.initdestroy8.model.Member;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean(initMethod = "introduce", destroyMethod = "farewell")
    public Member getMemberBean(){
        return new Member("Name", "Surname", 0);
    }

}
