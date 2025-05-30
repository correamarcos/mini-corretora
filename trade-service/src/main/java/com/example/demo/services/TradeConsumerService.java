package com.example.demo.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TradeConsumerService {

    @KafkaListener(topics = "quote-topic", groupId = "trade-group")
    public void listen(String message) {
        System.out.println("Mensagem recebida no trade-service: " + message);
        // Aqui você pode realizar lógica de negócio com o conteúdo recebido
    }
}

