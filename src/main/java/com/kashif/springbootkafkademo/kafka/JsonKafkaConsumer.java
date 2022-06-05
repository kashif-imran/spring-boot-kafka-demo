package com.kashif.springbootkafkademo.kafka;

import com.kashif.springbootkafkademo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "kashif_json", groupId = "myGroup")
    public void consume(User user) {
        LOGGER.info(String.format("Json Message recieved -> %s", user));
    }
}
