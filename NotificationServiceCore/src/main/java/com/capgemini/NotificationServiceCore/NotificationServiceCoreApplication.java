package com.capgemini.NotificationServiceCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NotificationServiceCoreApplication {

	public static void main(String[] args) {
		
		System.out.println("--- Starting Spring Container ---");
		ApplicationContext context = SpringApplication.run(NotificationServiceCoreApplication.class, args);
        
        System.out.println("\n--- Container Started Successfully ---");
        System.out.println("(Notice how only the EmailNotification bean was created so far)");

        System.out.println("\n--- Testing Email Notification ---");
        Notification emailNotification = (Notification) context.getBean("emailBean");
        emailNotification.send("Welcome to our platform!");

        System.out.println("\n--- Testing SMS Notification ---");
        Notification smsNotification = (Notification) context.getBean("smsBean");
        smsNotification.send("Your OTP is 123456.");

	}

}
