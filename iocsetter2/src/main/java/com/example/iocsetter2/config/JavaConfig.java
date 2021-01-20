package com.example.iocsetter2.config;

import com.example.iocsetter2.model.Member;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Member getMemberBean() {
        Member member = new Member();
        member.setName("Margot");
        member.setSurname("Robbie");
        member.setAge("32");
        return member;
    }
}
