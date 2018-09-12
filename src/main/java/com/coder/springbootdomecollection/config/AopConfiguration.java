package com.coder.springbootdomecollection.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;


/**
 * 定义切面
 * */
@Aspect
/**
 * 注册组件
 */
@Configuration
public class AopConfiguration {

    /**
     * 切入点
     */
    @Pointcut("execution(* com.coder..serviceimpl.*.*(..))")
    public void executeService(){ }

    /**
     * 在切入点之前
     * @param jp
     */
    @Before("executeService()")
    public void before(JoinPoint jp){
        System.out.println("执行方法之前执行");
    }

    /**
     * 在切入点之后
     * @param jp
     */
    @AfterReturning("executeService()")
    public void after(JoinPoint jp){
        System.out.println("执行方法之后执行");
    }

    /**
     * 在切入点抛出异常之后
     */
    @AfterThrowing("executeService()")
    public void afterthrowing(){
        System.out.println("方法抛出异常执行");
    }

    /**
     * 在切入点正常返回之后
     */
    @AfterReturning("executeService()")
    public void afterReturning(){
        System.out.println("方法正常返回之后执行");
    }

    /**
     * 环绕通知
     * @param pjp
     * @return
     */
    @Around("execution(* com.coder.*.serviceimpl.*.*(..))")
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
