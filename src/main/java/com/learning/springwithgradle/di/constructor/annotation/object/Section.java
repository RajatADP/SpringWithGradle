package com.learning.springwithgradle.di.constructor.annotation.object;

import org.springframework.stereotype.Service;

@Service
public class Section {

    public void printSection() {
        System.out.println("Section is A");
    }

}
