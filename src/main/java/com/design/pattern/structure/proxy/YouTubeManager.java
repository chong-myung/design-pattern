package com.design.pattern.structure.proxy;

import java.util.List;

public class YouTubeManager {
    private final ThirdPartyYouTubeLib service;

    public YouTubeManager(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(String id) {
        Video info = service.getVideoInfo(id);
    }

    public void renderListPanel(){
        List<Video> list = service.listVideos();
    }

    public void reactOnUserInput(){
        renderVideoPage("a1");
        renderListPanel();
    }

}
