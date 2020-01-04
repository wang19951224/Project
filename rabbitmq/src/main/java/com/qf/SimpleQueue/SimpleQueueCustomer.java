package com.qf.SimpleQueue;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues="simple")

public class SimpleQueueCustomer {
    @RabbitHandler
   public  void receive (String content){
        System.out.println("来自生产者的消息");
       System.out.println("SimpleQueueCustomer"+content);
   }
}
