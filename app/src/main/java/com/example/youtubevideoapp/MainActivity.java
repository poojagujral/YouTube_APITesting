package com.example.youtubevideoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Vector<YouTubeVideos> youTubeVideos= new Vector<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/IUKYRC7GcEo\" frameborder=\"0\" allowfullscreen></iframe>") );
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/k0y8XzmfEPY\" frameborder=\"0\" allowfullscreen></iframe>") );
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/1wtiNwmYzbU\" frameborder=\"0\" allowfullscreen></iframe>") );
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/YdB1HMCldJY\" frameborder=\"0\" allowfullscreen></iframe>") );
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/dJlFmxiL11s\" frameborder=\"0\" allowfullscreen></iframe>") );
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/JbSl281e65s\" frameborder=\"0\" allowfullscreen></iframe>") );
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ICcYm49SsMk\" frameborder=\"0\" allowfullscreen></iframe>") );
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/4zBnM_uozXM\" frameborder=\"0\" allowfullscreen></iframe>") );
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/6RKU72oY0C4\" frameborder=\"0\" allowfullscreen></iframe>") );
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Kuv0xThzxrU\" frameborder=\"0\" allowfullscreen></iframe>") );
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/JVwH-JsiwNI\" frameborder=\"0\" allowfullscreen></iframe>") );

        VideoAdapter videoAdapter= new VideoAdapter(youTubeVideos);
        recyclerView.setAdapter(videoAdapter);
    }
}
