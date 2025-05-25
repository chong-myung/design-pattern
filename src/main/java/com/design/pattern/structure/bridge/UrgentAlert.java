package com.design.pattern.structure.bridge;

public class UrgentAlert extends Alert{

    public UrgentAlert(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notify(String message) {
        sender.send("[! 긴급알림 ]" + message.toUpperCase());
    }
}
