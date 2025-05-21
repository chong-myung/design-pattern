package com.design.pattern.create.abstractfactory;

import com.design.pattern.create.abstractfactory.factory.CloudServiceFactory;
import com.design.pattern.create.abstractfactory.product.MessageQueueService;
import com.design.pattern.create.abstractfactory.product.StorageService;

public class CloudApp {
    private final StorageService storageService;
    private final MessageQueueService messageQueueService;

    public CloudApp(CloudServiceFactory factory) {
        this.storageService = factory.createStorageService();
        this.messageQueueService = factory.createMessageQueueService();
    }

    public void cloudFileUpload(String filePath) {
        storageService.uploadFile(filePath);
    }

    public void cloudMessageSend(String message) {
        messageQueueService.sendMessage(message);
    }


}
