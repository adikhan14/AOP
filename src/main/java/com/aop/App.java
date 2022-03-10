package com.aop;

import com.aop.service.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        PaymentService paymentServiceObject = context.getBean("payment", PaymentService.class);
        paymentServiceObject.makePayment(123);

    }
}
