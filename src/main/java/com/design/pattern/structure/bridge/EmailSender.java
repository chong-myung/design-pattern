package com.design.pattern.structure.bridge;

public class EmailSender implements MessageSender{

    @Override
    public void send(String message) {
        System.out.println("📧 이메일 전송: " + message);
    }
}
