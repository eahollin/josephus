package com.edwardhollingsworth.msa.josephus;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class JosephusApplication {

	Logger log = LogManager.getLogger(com.edwardhollingsworth.msa.josephus.JosephusApplication.class);
	
    public static void main(String[] args) {
        SpringApplication.run(JosephusApplication.class, args);
    }
    
    @KafkaListener(id = "josephus", topics = "test")  //, clientIdPrefix = "josephus-app"
    public void listen(String data) {
        log.info("Kafka message received: " + data);
    }
}
