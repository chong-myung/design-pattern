package com.design.pattern.structure.bridge;

//구현 추상화
public class NormalAlert extends Alert{

    public NormalAlert(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notify(String message) {
        sender.send("[일반 알림] "+ message);
    }

}
