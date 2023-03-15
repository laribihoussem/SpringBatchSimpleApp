package com.dev.testSncfProject.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import com.dev.testSncfProject.domain.User;
import lombok.extern.slf4j.Slf4j;

// @Service
@Slf4j
public class JsonKafkaConsumer {
  // private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

  @KafkaListener(topics = "${spring.kafka.topic-json.name}",
      groupId = "${spring.kafka.consumer.group-id}")
  public void consume(User user) {
    log.info(String.format("Json message recieved -> %s", user.toString()));
  }
}
