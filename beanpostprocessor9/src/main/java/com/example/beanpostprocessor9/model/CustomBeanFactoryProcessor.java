package com.example.beanpostprocessor9.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Arrays;

public class CustomBeanFactoryProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("Total Bean count: " + configurableListableBeanFactory.getBeanDefinitionCount());

        Arrays.asList(configurableListableBeanFactory
                                        .getBeanDefinitionNames())
                                        .forEach(elm -> System.out.println(elm));
    }
}
