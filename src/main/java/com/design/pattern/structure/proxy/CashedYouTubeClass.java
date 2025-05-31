package com.design.pattern.structure.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CashedYouTubeClass implements ThirdPartyYouTubeLib{

    protected ThirdPartyYouTubeLib service;
    private List<Video> cachedList;
    private Map<String, Video> cachedInfo = new HashMap<>();

    public CashedYouTubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    @Override
    public List<Video> listVideos() {

        if(cachedList == null){
            cachedList = service.listVideos();
        }else {
            System.out.println("[Cache] Returning cached video list.");
        }
        return cachedList;
    }

    @Override
    public Video getVideoInfo(String id) {
        if (!cachedInfo.containsKey(id)) {
            Video video = service.getVideoInfo(id);
            cachedInfo.put(id, video);
        } else {
            System.out.println("[Cache] Returning cached video info for ID: " + id);
        }
        return cachedInfo.get(id);
    }

    @Override
    public void downloadVideo(String id) {
        service.downloadVideo(id);
    }
}
