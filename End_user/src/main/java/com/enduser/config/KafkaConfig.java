package com.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

	@KafkaListener(topics = AppConstraint.LOCATION_UPDATE_TOPIC,id = AppConstraint.GROUP_ID)
	public void consumeMessage(String message) {
		System.out.println(message);
	}
}
