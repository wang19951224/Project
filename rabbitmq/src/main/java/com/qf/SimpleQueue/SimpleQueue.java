package com.qf.SimpleQueue;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SimpleQueue {
    @Bean
    public Queue simple(){
        return new Queue("simple");
    }
}
