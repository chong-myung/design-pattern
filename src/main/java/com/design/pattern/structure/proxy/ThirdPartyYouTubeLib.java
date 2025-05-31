package com.design.pattern.structure.proxy;

import java.util.List;

public interface ThirdPartyYouTubeLib {
    public List<Video> listVideos();
    public Video getVideoInfo(String id);
    public void downloadVideo(String id);
}
