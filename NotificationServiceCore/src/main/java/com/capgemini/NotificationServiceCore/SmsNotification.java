package com.capgemini.NotificationServiceCore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("smsBean")
@Scope("prototype")
public class SmsNotification implements Notification {
	

	/**
	 * 
	 */
	public SmsNotification() {
		super();
		System.out.println("SmsNotification Bean Created");
		

		
	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println("Email Notification sent: "+message);
		
	}

}
