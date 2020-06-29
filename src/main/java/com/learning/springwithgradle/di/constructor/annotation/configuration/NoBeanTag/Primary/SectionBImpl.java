package com.learning.springwithgradle.di.constructor.annotation.configuration.NoBeanTag.Primary;

import org.springframework.stereotype.Service;

@Service
public class SectionBImpl implements Section {
    @Override
    public void printSection() {
        System.out.println("Section is B");
    }
}
