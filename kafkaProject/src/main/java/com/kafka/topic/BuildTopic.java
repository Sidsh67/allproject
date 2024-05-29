package com.kafka.topic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaAdmin.NewTopics;

@Configuration
public class BuildTopic {

	@Bean
	public KafkaAdmin.NewTopics createTopic(){
		return new NewTopics(
				TopicBuilder.name("Data").build(),
				TopicBuilder.name("Data1").build());
	}
}
