package com.capgemini.PaymentGatewayCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PaymentGatewayCoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PaymentGatewayCoreApplication.class, args);

        System.out.println("\n--- Testing Default Payment Method ---");
        Payment defaultPayment = context.getBean(Payment.class); 
        defaultPayment.pay(1500.0);

        System.out.println("\n--- Testing Prototype Scope ---");
        Payment upi1 = context.getBean(UpiPayment.class);
        Payment upi2 = context.getBean(UpiPayment.class);
        
        System.out.println("\nAre upi1 and upi2 the exact same instance in memory? " + (upi1 == upi2));

        System.out.println("\n--- Closing Context ---");
        context.close(); 
    }
}
