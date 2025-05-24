package com.design.pattern.create.singleton;

public class Singleton {

    // Lazy initialization
    // Thread-safe Singleton
    // Double-checked locking
    // volatile keyword ensures that multiple threads handle the instance variable correctly
    private static volatile Singleton instance;


    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private Singleton() {
    }

}
