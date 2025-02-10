package com.example.messageconsumer;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MessageConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageConsumerApplication.class, args);
    }

    @Bean
    public Queue queue() {
        return new Queue("demo_queue", true, false, false);
    }
}