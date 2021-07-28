package com.salemnabeel.kafka.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaConsumerApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaConsumerApplication.class, args);
	}

	@Bean
    public ObjectMapper objectMapper() {

		return new ObjectMapper();
    }
}