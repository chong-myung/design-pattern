package com.design.pattern.structure.proxy;

public class Video {
    private String id;
    private String title;
    private String data;

    public Video(String id, String title, String data) {
        this.id = id;
        this.title = title;
        this.data = data;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getData() { return data; }

    @Override
    public String toString() {
        return "Video{id='" + id + "', title='" + title + "', data='" + data + "'}";
    }
}
