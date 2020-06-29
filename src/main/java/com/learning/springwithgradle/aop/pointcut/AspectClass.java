package com.learning.springwithgradle.aop.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Class contains logic for logs/transactions also called as
 * CROSS CUTTING CONCERN
 * <p>
 * ADVICE - @Before, @After, @AfterReturning, @Around, @AfterThrowing
 *
 * @Pointcut -  Where ADVICE should work
 */
@Component
@Aspect
@EnableAspectJAutoProxy
public class AspectClass {

    @Pointcut("execution(* com.learning.springwithgradle.aop.pointcut.Student.setName(..))")
    public void log() {
    }

    // execute before all setName where number of arguments are there
    @Before("log()")
    public void setSectionAdviceWithArg() {
        System.out.println("Before setSection method by setSectionAdviceWithArg");
    }

    // execute before all setName where number of arguments are there or not
    @Before("log()")
    public void setSectionAdviceWithOrWithoutArg() {
        System.out.println("Before setSection method by setSectionAdviceWithOrWithoutArg");
    }
}
