package com.design.pattern.structure.bridge;

public class SmsSender implements MessageSender {

    @Override
    public void send(String message) {
        System.out.println("📄 SMS 전송: " + message);
    }
}
