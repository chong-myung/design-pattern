package com.design.pattern.create.abstractfactory.product;

public class AwsStorageService implements StorageService{
    @Override
    public void uploadFile(String filePath) {
        System.out.println("Upload file to AWS: " +  filePath);
    }

    @Override
    public void downloadFile(String fileName) {
        System.out.println("Download file to AWS: " + fileName);

    }
}
