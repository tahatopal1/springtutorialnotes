package com.example.beanpostprocessor9.config;

import com.example.beanpostprocessor9.model.CustomBeanFactoryProcessor;
import com.example.beanpostprocessor9.model.Member;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean(name = "member3")
    public Member getMemberBean1(){
        return new Member("Name3", "Surname3", 20);
    }

    @Bean(name = "member4")
    public Member getMemberBean2(){
        return new Member("Name4", "Surname4", 25);
    }

    @Bean(name = "beanPostProcessor")
    public CustomBeanFactoryProcessor getProcessorBean(){
        return new CustomBeanFactoryProcessor();
    }

}
