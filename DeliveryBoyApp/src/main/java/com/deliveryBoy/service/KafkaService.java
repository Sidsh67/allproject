package com.deliveryBoy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryBoy.config.AppConstant;

@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private Logger logger=LoggerFactory.getLogger(KafkaService.class);
	
	public boolean locationUpdate(String location){
		
		 this.kafkaTemplate.send(AppConstant.LOCATION_TOPIC_NAME,location);
		 System.out.println(location);
		 logger.info("location producedS");
		 return true;
	}
	
}
