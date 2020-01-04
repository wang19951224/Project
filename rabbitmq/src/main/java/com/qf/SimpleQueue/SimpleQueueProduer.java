package com.qf.SimpleQueue;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleQueueProduer {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    public  void send(){
        System.out.println("生产者");
        rabbitTemplate.convertAndSend("simple","简单模式");
    }
}
