package com.learning.springwithgradle.di.constructor.annotation.configuration.NoBeanTag.Qualifier;

import org.springframework.stereotype.Service;

@Service
public class SectionAImpl implements Section {
    @Override
    public void printSection() {
        System.out.println("Section is A");
    }
}
