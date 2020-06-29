package com.learning.springwithgradle.di.constructor.xmlBased.factory.differentClass;

public class ReferenceFactory {

    public static Reference getInstance() {
            return new Student();
    }
}
