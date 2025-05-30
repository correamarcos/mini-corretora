package com.example.demo.config.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class NotificationTopicCreator {
    @Bean
    public CommandLineRunner createTopics(KafkaAdmin kafkaAdmin) {
        return args -> {
            kafkaAdmin.createOrModifyTopics(new NewTopic(KafkaTopics.NOTIFICATION, 1, (short) 1));
            System.out.println("✅ Tópicos Kafka criados (ou já existentes).");
        };
    }
}
