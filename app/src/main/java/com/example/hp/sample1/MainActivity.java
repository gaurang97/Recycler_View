package com.example.hp.sample1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");
        initImageBitmaps();
    }
public  void initImageBitmaps(){
    Log.d(TAG, "initImageBitmaps: preparing bitmaps");

    mImageUrls.add("https://res.cloudinary.com/mytoons/image/upload/v1530525811/cartoons/highcompress-The_flintstones_cover_1.jpg");
    mNames.add("The Flintstones");
    mImageUrls.add("https://res.cloudinary.com/mytoons/image/upload/v1530531329/51WUR5v5XNL._SY445_.jpg");
    mNames.add("Noddy");
    mImageUrls.add("https://res.cloudinary.com/mytoons/image/upload/v1530531329/MQ8HdVt.jpg");
    mNames.add("Daffy duck");
    mImageUrls.add("https://res.cloudinary.com/mytoons/image/upload/v1530525810/cartoons/highcompress-thmb_kochikame_1.jpg");
    mNames.add("Kochikame");
    mImageUrls.add("https://res.cloudinary.com/mytoons/image/upload/v1530525810/cartoons/highcompress-Samurai_jack.jpg");
    mNames.add("Samurai Jack");
    mImageUrls.add("https://res.cloudinary.com/mytoons/image/upload/v1530525809/cartoons/highcompress-Jhonny_bravo.jpg");
    mNames.add("Jhonny Bravo");
    mImageUrls.add("https://res.cloudinary.com/mytoons/image/upload/v1530525809/cartoons/highcompress-Dexter_s_Laboratory_Poster_large.jpg");
    mNames.add("Dexter laboratory");
    mImageUrls.add("https://res.cloudinary.com/mytoons/image/upload/v1530525809/cartoons/highcompress-detectiveConan.jpg");
    mNames.add("Detective Conan");
    mImageUrls.add("https://res.cloudinary.com/mytoons/image/upload/v1530525808/cartoons/highcompress-AdventureOfTintinS1.jpg");
    mNames.add("Adventures of Tintin");

initRecyclerView();

}

public void initRecyclerView(){
    Log.d(TAG, "initRecyclerView: init recycler view");

    RecyclerView recyclerView = findViewById((R.id.recycler_view));
    RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,mNames,mImageUrls);
    recyclerView.setAdapter(adapter);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
}

}
