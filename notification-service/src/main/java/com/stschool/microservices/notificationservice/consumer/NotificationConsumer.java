package com.stschool.microservices.notificationservice.consumer;

import com.stschool.microservices.notificationservice.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {
    @RabbitListener(queues = RabbitConfig.QUEUE)
    public void receiveMessage(String message){
        System.out.println("============================");
        System.out.println("Notification Received");
        System.out.println(message);
        System.out.println("=============================");
    }

}
