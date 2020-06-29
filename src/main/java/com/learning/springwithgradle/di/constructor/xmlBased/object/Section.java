package com.learning.springwithgradle.di.constructor.xmlBased.object;

public class Section {

    private String section;

    public Section(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return section;
    }

}
