package org.javaboy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/9 22:20
 */
@Component
@Aspect
public class LogComponent {

    @Pointcut("execution(* org.javaboy.aop.service.*.*(..))")
    public void pointcut(){}

    //五种通知方法

    //前置通知
    @Before(value = "pointcut()")
    public void before(JoinPoint jp){
        String name = jp.getSignature().getName();
        System.out.println("before>>>>>"+name);
    }

    //后置通知
    @After(value = "pointcut()")
    public void after(JoinPoint jp){
        String name = jp.getSignature().getName();
        System.out.println("after>>>>>"+name);
    }

    //返回通知
    @AfterReturning(value = "pointcut()", returning = "result")
    public void afterReturning(JoinPoint jp, Object result){
        String name = jp.getSignature().getName();
        System.out.println("afterReturning>>>>>"+name+">>>>>"+result);
    }

    //异常通知
    @AfterThrowing(value = "pointcut()", throwing = "e")
    public void afterThrowing(JoinPoint jp, Exception e){
        String name = jp.getSignature().getName();
        System.out.println("afterThrowing>>>>>"+name+">>>>>"+e.getMessage());
    }

    //环绕通知
    @Around(value = "pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object proceed = pjp.proceed();
//        return proceed;
        return "www.javaboy.org";
    }

}
