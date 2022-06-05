package com.kashif.springbootkafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic kashifTopic() {
        return TopicBuilder.name("kashif")
                .build();
    }

    @Bean
    public NewTopic kashifTopicJson() {
        return TopicBuilder.name("kashif_json")
                .build();
    }
}
