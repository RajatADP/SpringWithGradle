package com.learning.springwithgradle.di.constructor.annotation.configuration.NoBeanTag;

import org.springframework.stereotype.Service;

@Service
public class Section {

    public Section() {}

    public void printSection() {
        System.out.println("Section is B");
    }

}
