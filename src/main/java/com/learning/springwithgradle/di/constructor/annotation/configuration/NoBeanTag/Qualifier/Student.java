package com.learning.springwithgradle.di.constructor.annotation.configuration.NoBeanTag.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Student {

    private Section section;

    public Section getSection() {
        return section;
    }

    @Autowired
    @Qualifier("sectionBImpl")
    public void setSection(Section section) {
        this.section = section;
    }

    public void getStudentName() {
        System.out.println("Student Name is: Rajat");
        section.printSection();
    }
}
