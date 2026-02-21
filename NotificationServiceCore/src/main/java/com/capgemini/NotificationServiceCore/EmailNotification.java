package com.capgemini.NotificationServiceCore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component("emailBean")
@Scope("singleton")
public class EmailNotification implements Notification {
	

	/**
	 * 
	 */
	public EmailNotification() {
		super();
		System.out.println("EmailNotification Bean Created");

		
	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println("Email Notification sent: "+message);
		
	}
	@PostConstruct
	void init() {
		System.out.println("EmailNotification Bean Initialized");
	}
	
	@PostConstruct
	void destroy() {
		System.out.println("EmailNotification Bean Destroyed");
	}

}
