package com.kashif.springbootkafkademo.controller;

import com.kashif.springbootkafkademo.kafka.JsonKafkaProducer;
import com.kashif.springbootkafkademo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    @Autowired
    private JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/publish")
    public String publish(@RequestBody User user) {
        jsonKafkaProducer.sendMessage(user);
        return "JSON Message sent to kafka topic";
    }
}
