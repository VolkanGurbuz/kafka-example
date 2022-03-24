package com.example.kafkaexample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

  // topic collection of events
  @Bean
  public NewTopic volkanscodeTopic() {
    return TopicBuilder.name("volkanscode").build();
  }
}
