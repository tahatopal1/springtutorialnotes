package com.example.componentannotation14.config;

import com.example.componentannotation14.model.Employee;
import com.example.componentannotation14.model.Member;
import com.example.componentannotation14.model.Role;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/*@ComponentScans({
        @ComponentScan( value = "com.example.componentannotation14.model")
})*/
@Configuration
public class JavaConfig {

    @Bean
    public Member getMemberBean(){
        return new Member("Bill", "Gates", 67);
    }

    @Bean
    public Role getRoleBean(){
        return new Role("CEO");
    }

    @Bean
    public Employee getEmployeeBean(){
        return new Employee();
    }

}
