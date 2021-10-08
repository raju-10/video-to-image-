package com.example.videotoimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Dashboard extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        VideoView videoview=findViewById(R.id.videoView);
        videoview.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.android);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoview);
        videoview.setMediaController(mediaController);


    }
}