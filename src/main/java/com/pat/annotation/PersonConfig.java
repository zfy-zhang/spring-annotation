package com.pat.annotation;

import com.pat.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Project Name: spring-annotation
 * File Name: PersonConfig
 * Package Name: com.pat.annotation
 * Author: elisha
 * Date: 2020/2/17 19:11
 * Copyright (c) 2020,All Rights Reserved.
 */
@Configuration
public class PersonConfig {
    @Bean
    public Person person(){
        return new Person(2, "浪随客", 27);
    }
}
