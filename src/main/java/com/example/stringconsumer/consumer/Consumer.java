package com.example.stringconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class Consumer {
    @KafkaListener(topics = "data")
    public void consume(String record) {
        System.out.println(record + "\n");
    }

}
