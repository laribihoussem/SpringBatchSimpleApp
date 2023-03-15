package com.dev.testSncfProject.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import lombok.extern.slf4j.Slf4j;

// @Service
@Slf4j
public class KafkaConsumer {

  @KafkaListener(topics = "${spring.kafka.topic.name}",
      groupId = "${spring.kafka.consumer.group-id}")
  public void consume(String message) {
    log.info(String.format("Message received -> %s", message));
  }
}
