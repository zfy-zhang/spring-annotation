package com.pat.test;

import com.pat.annotation.PersonConfig;
import com.pat.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project Name: spring-annotation
 * File Name: MainTest
 * Package Name: com.pat.bean.test
 * Author: elisha
 * Date: 2020/2/17 19:04
 * Copyright (c) 2020,All Rights Reserved.
 */
public class MainTest {

    public static void main(String[] args) {
//        // 配置文件测试方式
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");
//        Person person = applicationContext.getBean(Person.class);
        // @Configuration配置类测试方式
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(PersonConfig.class);
        Person person = annotationConfigApplicationContext.getBean(Person.class);
        System.out.println(person);
    }
}
