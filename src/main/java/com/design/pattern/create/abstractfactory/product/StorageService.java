package com.design.pattern.create.abstractfactory.product;

public interface StorageService {
    void uploadFile(String filePath);

    void downloadFile(String fileName);
}
