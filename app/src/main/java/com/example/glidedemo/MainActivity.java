package com.example.glidedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url = "https://media.comicbook.com/2017/10/iron-man-movie-poster-marvel-cinematic-universe-1038878.jpg";
        imageView = findViewById(R.id.imageView);

        /*
        * Simple Glide usage to start with
        * Please check the Glide dependency in Gradle file
        * Check the 3 permission in Manifest file
        * */

        Glide.with(this)
                .load(url)
                .into(imageView);

        
    }
}
