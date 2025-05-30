package com.example.demo.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class QuoteProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public QuoteProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendQuote(String quote) {
        kafkaTemplate.send("quote-topic", quote);
    }
}

