package com.example.messageconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

    @RabbitListener(queues = "demo_queue")
    public void consume(String message) {
        System.out.println("Received Message: " + message);
    }
}