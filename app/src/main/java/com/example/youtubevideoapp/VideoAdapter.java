package com.example.youtubevideoapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder>{

    List<YouTubeVideos> youtubeVideolist;

    public  VideoAdapter(){
    }
    public VideoAdapter(List<YouTubeVideos>youtubeVideolist){
        this.youtubeVideolist= youtubeVideolist;
    }

    @Override
    public VideoAdapter.VideoViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.video_view, viewGroup, false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position) {

        holder.videoWeb.loadData( youtubeVideolist.get(position).getVideourl(),"text/html","utf-8");
    }

    @Override
    public int getItemCount() {
        return youtubeVideolist.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder{

        WebView videoWeb;

        public VideoViewHolder (View itemView){
            super(itemView);

            videoWeb = (WebView) itemView.findViewById(R.id.webvideoview);

            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient(){

            });
        }
    }
}
