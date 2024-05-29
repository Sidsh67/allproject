package com.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = {"fruits"} ,groupId = "0")
	public void consumeFruits(String message) {
		System.out.println(message);
	}
}
