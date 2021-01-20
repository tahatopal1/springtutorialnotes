package com.example.beanpostprocessor10.config;

import com.example.beanpostprocessor10.model.CustomBeanPostProcessor;
import com.example.beanpostprocessor10.model.Member;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean(name = "PostProcessorJavaConfig")
    public CustomBeanPostProcessor getPostProcessor(){
        return new CustomBeanPostProcessor();
    }

    @Bean(name = "member3")
    public Member getMemberBean1(){
        return new Member("Name3", "Surname3", 23);
    }

    @Bean(name = "member4")
    public Member getMemberBean2(){
        return new Member("Name4", "Surname4", 25);
    }
}
