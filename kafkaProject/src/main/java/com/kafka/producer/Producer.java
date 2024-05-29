package com.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {
	private static final Logger LOGGER=LoggerFactory.getLogger(Producer.class);
	@Autowired
	private KafkaTemplate kafkaTemplate;

//	@GetMapping("/send")
//	public String sendMessage(@RequestParam String message) {
//		kafkaTemplate.send("fruits",message);
//		return message;
//	}
	@GetMapping("/send")
	public String sendMessage(String message) {
		LOGGER.info(String.format("MESSAGE sent %s ", message));
		kafkaTemplate.send("Data1",message);
		return message;
	}
}
