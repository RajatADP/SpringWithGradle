package com.learning.springwithgradle.aop.basic;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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

    @Before("execution(public void getStudentName())")
    public void log() {
        System.out.println("Before getStudentName method");
    }

    // execute after all setName where number of arguments are there. only if there is no exception
    @AfterReturning("execution(* com.learning.springwithgradle.aop.basic.Student.setName(*))")
    public void setSectionAdviceWithArg() {
        System.out.println("After setSection method");
    }

    // execute after all setName where number of arguments are there. only if there is an exception
    @AfterThrowing("execution(* com.learning.springwithgradle.aop.basic.Student.setName(*))")
    public void setSectionAdviceWithArg1() {
        System.out.println("After setSection method exception is present");
    }

    // execute after all setName where number of arguments are there or not
    @After("execution(* com.learning.springwithgradle.aop.basic.Student.setName(..))")
    public void setSectionAdviceWithOrWithoutArg() {
        System.out.println("After setSection method");
    }

    @Around("execution(public void getStudentName())")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {

        try {
            System.out.println("Before getStudentName method try block");
            proceedingJoinPoint.proceed();
            System.out.println("After getStudentName method try block");
        } catch (Throwable throwable) {
            System.out.println("After getStudentName method catch block");
            throwable.printStackTrace();
        }
        System.out.println("After getStudentName method finally block");
    }

}
