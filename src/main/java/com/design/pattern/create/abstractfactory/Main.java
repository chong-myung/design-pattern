package com.design.pattern.create.abstractfactory;

import com.design.pattern.create.abstractfactory.factory.CloudServiceFactory;
import com.design.pattern.create.abstractfactory.factory.GcpCloudServiceFactory;

public class Main {

    public static void main(String[] args) {
        // Create a factory for AWS services
        CloudServiceFactory awsFactory = new GcpCloudServiceFactory();
        CloudApp cloudApp = new CloudApp(awsFactory);
        cloudApp.cloudFileUpload("file.txt");
        cloudApp.cloudMessageSend("Hello from Cloud!");
    }
}
