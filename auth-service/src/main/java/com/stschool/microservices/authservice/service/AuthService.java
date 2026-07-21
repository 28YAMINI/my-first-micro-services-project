package com.stschool.microservices.authservice.service;

import com.stschool.microservices.authservice.config.RabbitConfig;
import com.stschool.microservices.authservice.dto.RegisterRequest;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final RabbitTemplate rabbitTemplate;

    public AuthService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public String register(RegisterRequest request) {

        // Later you can save the user to a database

        rabbitTemplate.convertAndSend(
                RabbitConfig.EXCHANGE,
                RabbitConfig.ROUTING_KEY,
                "New User Registered: " + request.getUsername()
        );

        return "User Registered Successfully";
    }
}