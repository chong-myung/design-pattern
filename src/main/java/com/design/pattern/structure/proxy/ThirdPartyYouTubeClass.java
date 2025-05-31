package com.design.pattern.structure.proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{

    private final Map<String, Video> videoDB = new HashMap<>();

    public ThirdPartyYouTubeClass() {
        videoDB.put("a1", new Video("a1", "Intro to Java", "Java basics video..."));
        videoDB.put("b2", new Video("b2", "Spring Boot", "Spring Boot overview..."));
        videoDB.put("c3", new Video("c3", "Design Patterns", "Proxy pattern explained..."));
    }

    @Override
    public List<Video> listVideos() {
        System.out.println("[RealService] Fetching video list from YouTube...");
        return new ArrayList<>(videoDB.values());
    }

    @Override
    public Video getVideoInfo(String id) {
        System.out.println("[RealService] Fetching video info for ID: " + id);
        return videoDB.get(id);
    }

    @Override
    public void downloadVideo(String id) {
        System.out.println("[RealService] Downloading video with ID: " + id);
    }
}
