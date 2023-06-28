package com.example.KafkaDemo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
  @KafkaListener(topics = "Topic", groupId = "")
  public void listenToTopic(String receivedMessage){
    System.out.println("The message received is " + receivedMessage);
  }
}
