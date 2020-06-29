package com.learning.springwithgradle.di.constructor.xmlBased.collection.object;

public class Section {

    private String section;

    public Section(String section) {
        this.section = section;
    }

    public String getSections() {
        return section;
    }

    @Override
    public String toString() {
        return "Section{" +
                "section=" + section +
                '}';
    }
}
