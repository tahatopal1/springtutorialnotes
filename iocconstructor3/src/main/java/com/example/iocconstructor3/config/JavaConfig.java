package com.example.iocconstructor3.config;

import com.example.iocconstructor3.model.Member;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Member getMemberBean() {
        return new Member("Orlando", "Bloom", 39);
    }

}
