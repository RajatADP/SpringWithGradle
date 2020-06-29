package com.learning.springwithgradle.di.constructor.annotation.configuration.NoBeanTag.Primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SectionAImpl implements Section {
    @Override
    public void printSection() {
        System.out.println("Section is A");
    }
}
