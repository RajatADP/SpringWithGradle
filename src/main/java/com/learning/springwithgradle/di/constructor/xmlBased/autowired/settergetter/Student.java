package com.learning.springwithgradle.di.constructor.xmlBased.autowired.settergetter;


public class Student {

    private Section section;

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public void getStudentName() {
        section.printSection();
    }
}
