package com.example.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

  @KafkaListener(topics = "volkanscode", groupId = "fool")
  void listener(String data) {
    System.out.println("Received: " + data);
  }
}
