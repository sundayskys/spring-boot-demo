package com.demo.listener;

import com.demo.config.RabbitMqConstant;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 监听队列B
 */
@Component
@RabbitListener(queuesToDeclare = @Queue(RabbitMqConstant.FANOUT_EXCHANGE_QUEUE_TOPIC_B))
public class FanoutExchangeConsumerB {

    @RabbitHandler
    public void process(Map<String, Object> map) {
        System.out.println("队列B收到消息：" + map.toString());
    }
}
