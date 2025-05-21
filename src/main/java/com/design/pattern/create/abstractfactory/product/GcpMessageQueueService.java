package com.design.pattern.create.abstractfactory.product;

public class GcpMessageQueueService implements MessageQueueService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message to Gcp SQS: " + message);
    }
}
