package com.dev.testSncfProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dev.testSncfProject.kafka.KafkaProducer;

// @RestController
// @RequestMapping("/api/v1/kafka")
public class MessageController {

  @Autowired
  private KafkaProducer kafkaProducer;

  // public MessageController(KafkaProducer kafkaProducer) {
  // this.kafkaProducer = kafkaProducer;
  // }

  // http:localhost:8080/api/v1/kafka/publish?message=hello world
  @GetMapping("/publish")
  public ResponseEntity<String> publish(@RequestParam("message") String message) {
    kafkaProducer.sendMessage(message);
    return ResponseEntity.ok("Message sent to the topic");
  }
}
