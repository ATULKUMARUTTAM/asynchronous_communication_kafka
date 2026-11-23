package com.atuluttam.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer
{
    @KafkaListener(topics="my-topic", groupId = "my-new-group")
    public void lesten(String message)
    {
        System.out.println("MEssage Received  !!!"+message);
    }

    @KafkaListener(topics="my-topic", groupId = "my-new-group_1")
    public void lesten1(String message)
    {
        System.out.println("MEssage Received  !!!"+message);
    }
}
