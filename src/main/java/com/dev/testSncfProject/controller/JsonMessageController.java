package com.dev.testSncfProject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.dev.testSncfProject.domain.User;
import com.dev.testSncfProject.kafka.JsonKafkaProducer;

// @RestController
// @RequestMapping("/api/v1/kafka")
public class JsonMessageController {

  private JsonKafkaProducer kafkaProducer;

  public JsonMessageController(JsonKafkaProducer kafkaProducer) {
    this.kafkaProducer = kafkaProducer;
  }

  @PostMapping("/publish")
  public ResponseEntity<String> publish(@RequestBody User user) {
    kafkaProducer.sendMessage(user);
    return ResponseEntity.ok("Json message sent to kafka topic");
  }
}
