package com.kashif.springbootkafkademo.controller;

import com.kashif.springbootkafkademo.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/publish")
    public String publish(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);
        return "Message sent to the topic";

    }


}
