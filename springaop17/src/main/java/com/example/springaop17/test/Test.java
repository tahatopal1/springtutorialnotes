package com.example.springaop17.test;

import com.example.springaop17.model.SampleModel;
import com.example.springaop17.model.SampleModel2;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        SampleModel sampleModel = applicationContext.getBean("sampleModel", SampleModel.class);
        SampleModel2 sampleModel2 = applicationContext.getBean("sampleModel2", SampleModel2.class);

        sampleModel.method1();
        sampleModel.method2();
        sampleModel.method3(5);
        sampleModel.method4(1);
        sampleModel.method5();

        try {
            sampleModel2.method1();
            sampleModel2.annoMethod();
            sampleModel2.method();
        } catch (Exception e) {
            e.printStackTrace();
        }


        applicationContext.close();
    }
}
