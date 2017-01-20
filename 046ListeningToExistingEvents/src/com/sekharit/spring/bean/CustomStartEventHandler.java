package com.sekharit.spring.bean;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CustomStartEventHandler implements
		ApplicationListener<ContextStartedEvent> {

	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("ContextStartedEvent Received");
	}

}
