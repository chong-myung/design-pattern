package com.design.pattern.structure.bridge;

//추상화
public abstract class Alert {

    protected MessageSender sender;

    public Alert(MessageSender sender) {
        this.sender = sender;
    }

    public void setSender(MessageSender sender){
        this.sender =sender;
    }

    public abstract void notify(String message);
    
}
