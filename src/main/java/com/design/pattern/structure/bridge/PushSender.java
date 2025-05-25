package com.design.pattern.structure.bridge;

public class PushSender implements MessageSender{
    @Override
    public void send(String message) {
        System.out.println("📲 푸시 전송: " + message);
    }
}
