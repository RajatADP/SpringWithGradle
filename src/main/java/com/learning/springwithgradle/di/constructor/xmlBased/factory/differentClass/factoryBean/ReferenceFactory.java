package com.learning.springwithgradle.di.constructor.xmlBased.factory.differentClass.factoryBean;

public class ReferenceFactory {

    public Reference getInstance() {
            return new Student();
    }
}
