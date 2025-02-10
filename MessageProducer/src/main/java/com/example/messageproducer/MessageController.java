package com.example.messageproducer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final RabbitTemplate rabbitTemplate;

    public MessageController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @RequestMapping(path = "/send", method = RequestMethod.POST)
    public void sendMessage(@RequestBody String message) {
        System.out.println("Sending message: " + message);
        rabbitTemplate.convertAndSend("demo_queue", message);
        System.out.println("Message sent.");
    }
}