package com.capgemini.PaymentGatewayCore;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("singleton")
@Primary
public class CreditCardPayment implements Payment {
	
	
	public CreditCardPayment() {
        System.out.println("CreditCard Payment Bean Created");
    }

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Credit Card payment of Rs. "+amount+" successful");
	}
	
	@PostConstruct
	public void init() {
        System.out.println("CreditCard Payment Bean Initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("CreditCard Payment Bean Destroyed");
    }

}
