package com.example.springaop17.model;

import org.springframework.stereotype.Component;

@Component
public class SampleModel {

    public void method1(){
        System.out.println("This is method 1");
    }

    public void method2(){
        System.out.println("This is method 2");
    }

    public void method3(int t){
        System.out.println("This is method 3");
    }

    public void method4(int j){
        System.out.println("This is method 4");
    }

    public SampleModel2 method5(){
        SampleModel2 sampleModel2 = new SampleModel2();
        sampleModel2.s = "sample";
        return sampleModel2;
    }


}
