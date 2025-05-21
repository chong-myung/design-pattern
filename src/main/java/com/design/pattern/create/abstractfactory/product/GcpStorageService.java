package com.design.pattern.create.abstractfactory.product;

public class GcpStorageService implements StorageService {

    @Override
    public void uploadFile(String filePath) {
        System.out.println("Upload file to Gcp: " +  filePath);
    }

    @Override
    public void downloadFile(String fileName) {
        System.out.println("Download file to Gcp: " + fileName);

    }
}
