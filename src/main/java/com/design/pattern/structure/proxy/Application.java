package com.design.pattern.structure.proxy;

public class Application {

    public static void main(String[] args) {
        ThirdPartyYouTubeLib thirdPartyYouTubeClass = new ThirdPartyYouTubeClass();
        ThirdPartyYouTubeLib cashedYouTubeClass = new CashedYouTubeClass(thirdPartyYouTubeClass);

        YouTubeManager youTubeManager = new YouTubeManager(cashedYouTubeClass);
        youTubeManager.reactOnUserInput();

        System.out.println("###################################");
        youTubeManager.reactOnUserInput();
    }

}
