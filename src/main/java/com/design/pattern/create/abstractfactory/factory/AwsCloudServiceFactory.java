package com.design.pattern.create.abstractfactory.factory;

import com.design.pattern.create.abstractfactory.product.AwsMessageQueueService;
import com.design.pattern.create.abstractfactory.product.AwsStorageService;
import com.design.pattern.create.abstractfactory.product.MessageQueueService;
import com.design.pattern.create.abstractfactory.product.StorageService;

public class AwsCloudServiceFactory implements CloudServiceFactory{
    @Override
    public StorageService createStorageService() {
        return new AwsStorageService();
    }

    @Override
    public MessageQueueService createMessageQueueService() {
        return new AwsMessageQueueService();
    }
}
