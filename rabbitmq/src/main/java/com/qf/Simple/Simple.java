package com.qf.Simple;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Simple {
    public Queue Simple(){
        return new  Queue("simple");
    }
}
