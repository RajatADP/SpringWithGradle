package com.learning.springwithgradle.aop.joinPoint;

import org.aspectj.lang.JoinPoint;
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

    @Pointcut("execution(* com.learning.springwithgradle.aop.joinPoint.Student.getStudentName(..))")
    public void log() {
    }

    // joinPoint.toString() returns method on which advice was called
    @Before("log()")
    public void setSectionAdviceWithArg(JoinPoint joinPoint) {
        System.out.println("Before getSection method by setSectionAdviceWithArg " + joinPoint.toString());
    }

    // joinPoint.getTarget() returns object of class on which advice was called
    @Before("log()")
    public void setSectionAdviceWithOrWithoutArg(JoinPoint joinPoint) {
        Student student = (Student)joinPoint.getTarget();

        System.out.println("Before getSection method by setSectionAdviceWithOrWithoutArg " + student.getName());
    }
}
