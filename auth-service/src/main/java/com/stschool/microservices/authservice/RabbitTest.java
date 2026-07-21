//package com.stschool.microservices.authservice;
//
//import com.stschool.microservices.authservice.config.RabbitConfig;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class RabbitTest implements CommandLineRunner {
//
//    private final RabbitTemplate rabbitTemplate;
//
//    public RabbitTest(RabbitTemplate rabbitTemplate) {
//        this.rabbitTemplate = rabbitTemplate;
//    }
//
//    @Override
//    public void run(String... args) {
//        System.out.println("RabbitTemplate created successfully");
//
//        rabbitTemplate.convertAndSend(
//                RabbitConfig.EXCHANGE,
//                RabbitConfig.ROUTING_KEY,
//                "Hello RabbitMQ!"
//        );
//
//        System.out.println("Message sent successfully");
//    }
//}