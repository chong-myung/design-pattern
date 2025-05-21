package com.design.pattern.create.abstractfactory.product;

public class AwsMessageQueueService implements MessageQueueService {

    @Override
    public void sendMessage(String message) {
        // Implementation for sending a message using AWS SQS
        System.out.println("Sending message to AWS SQS: " + message);
    }
}
