package com.example.rabbitmq.demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: Allen
 * @Date: 2018/8/7 14:50
 * @Description:
 */
@Component
@RabbitListener(queues = {"fanout.A","fanout.B","fanout.C"})
public class FanoutReceiver {


    @RabbitHandler
    public void process(String content) {
        System.out.println("Receiver  : " + content);
    }

}
