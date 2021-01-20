package com.example.springaop17.model;

import com.example.springaop17.annotation.CustomAnnotation;
import org.springframework.stereotype.Component;

@Component
public class SampleModel2 {

    String s;

    public void method1(){
        System.out.println("This is method1 for around advice");
    }

    public void method() throws Exception{
        throw new Exception("Sample Exception for After Throwing advice");
    }

    @CustomAnnotation
    public void annoMethod(){
        System.out.println("This is annoMethod for after advice");
    }
}
