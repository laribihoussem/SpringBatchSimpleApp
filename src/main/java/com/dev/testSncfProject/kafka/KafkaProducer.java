package com.dev.testSncfProject.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import lombok.extern.slf4j.Slf4j;

// @Service
@Slf4j
public class KafkaProducer {

  // @Value("${spring.kafka.topic.name}")
  // private String topicName;

  // private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

  private KafkaTemplate<String, String> kafkaTemplate;

  public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  public void sendMessage(String message) {
    log.info(String.format("Message sent %s", message));
    kafkaTemplate.send("myFirstTopic", message);
  }
}
