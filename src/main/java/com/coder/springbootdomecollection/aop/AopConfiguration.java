package com.coder.springbootdomecollection.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

@Aspect
/**
 * 定义切面
 * */
@Configuration
/**
 * 注册组件
 */
public class AopConfiguration {

    @Pointcut("execution(* com.coder..*.*.*(..))")
    public void executeService(){ }

    @Before("executeService()")
    public void before(JoinPoint jp){
        System.out.println("执行方法之前执行");
    }

    @AfterReturning("executeService()")
    public void after(JoinPoint jp){
        System.out.println("执行方法之后执行");
    }

    @AfterThrowing("executeService()")
    public void afterthrowing(){
        System.out.println("方法抛出异常执行");
    }

    @AfterReturning("executeService()")
    public void afterReturning(){
        System.out.println("方法正常返回之后执行");
    }

    @Around("execution(* com.coder.*.*.*.*(..))")
    public Object around(ProceedingJoinPoint pjp){
        System.out.println("环绕通知");
        System.out.println(pjp);
        System.out.println("环绕通知的目标方法名："+pjp.getSignature().getName());
        try {
            Object obj = pjp.proceed();
            return obj;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
