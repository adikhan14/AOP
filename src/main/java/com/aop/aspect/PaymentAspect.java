package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PaymentAspect {

    @Before("execution(* com.aop.service.PaymentServiceImpl.makePayment(..))")
    public void auth(){
        System.out.println("Auth");
    }

    @After("execution(* com.aop.service.PaymentServiceImpl.makePayment(..))")
    public void complete(){
        System.out.println("Payment transferred");
    }
}
