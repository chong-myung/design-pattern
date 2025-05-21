package com.design.pattern.create.abstractfactory.factory;

import com.design.pattern.create.abstractfactory.product.MessageQueueService;
import com.design.pattern.create.abstractfactory.product.StorageService;

public interface CloudServiceFactory {
    StorageService createStorageService();

    MessageQueueService createMessageQueueService();
}
