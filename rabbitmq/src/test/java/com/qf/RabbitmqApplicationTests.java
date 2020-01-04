package com.qf;

import com.qf.SimpleQueue.SimpleQueueProduer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private SimpleQueueProduer simpleQueueProduer;
    @Test
    public void test1(){
        simpleQueueProduer.send();
    }
}
