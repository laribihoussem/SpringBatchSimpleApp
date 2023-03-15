package com.dev.testSncfProject.kafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import com.dev.testSncfProject.domain.User;
import lombok.extern.slf4j.Slf4j;

// @Service
@Slf4j
public class JsonKafkaProducer {

  @Value("${spring.kafka.topic-json.name}")
  private String topicJsonName;

  // private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

  private KafkaTemplate<String, User> kafkaTemplate;

  public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  public void sendMessage(User data) {

    log.info(String.format("Message sent -> %s", data.toString()));

    Message<User> message =
        MessageBuilder.withPayload(data).setHeader(KafkaHeaders.TOPIC, topicJsonName).build();

    kafkaTemplate.send(message);
  }
}
