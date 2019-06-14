package com.example.youtubevideoapp;

public class YouTubeVideos {

    String videourl;

    public  YouTubeVideos (){

    }
    public YouTubeVideos(String videourl)
    {
        this.videourl=videourl;
    }

    public String getVideourl()
    {
        return videourl;
    }

    public void setVideourl(String videourl)
    {
        this.videourl=videourl;
    }
}
