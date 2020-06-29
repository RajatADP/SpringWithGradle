package com.learning.springwithgradle.di.constructor.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Student getInstance() {
        return new Student(getInstanceOfSection());
    }

    @Bean
    public Section getInstanceOfSection() {
        return new Section();
    }

}
