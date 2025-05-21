package com.design.pattern.create.abstractfactory.factory;

import com.design.pattern.create.abstractfactory.product.GcpMessageQueueService;
import com.design.pattern.create.abstractfactory.product.GcpStorageService;
import com.design.pattern.create.abstractfactory.product.MessageQueueService;
import com.design.pattern.create.abstractfactory.product.StorageService;

public class GcpCloudServiceFactory implements CloudServiceFactory {

    @Override
    public StorageService createStorageService() {
        return new GcpStorageService();
    }

    @Override
    public MessageQueueService createMessageQueueService() {
        return new GcpMessageQueueService();
    }
}
