package com.example.sungansungan12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class HomeActivity extends AppCompatActivity {
    AppCompatButton navi;
    AppCompatButton upload;
    AppCompatButton profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // 물품 탐색 버튼
        navi = findViewById(R.id.homeNaviButton);
        // 물품 등록 버튼
        upload = findViewById(R.id.homeUploadButton);
        // 개인 정보 수정 버튼
        profile = findViewById(R.id.homeProfileButton);

        navi.setOnClickListener(v -> {
            Intent intent = new Intent(this, NaviActivity.class);
            startActivity(intent);
        });
        upload.setOnClickListener(v -> {
            Intent intent = new Intent(this, UploadActivity.class);
            startActivity(intent);
        });
        profile.setOnClickListener(v -> {
            Intent intent = new Intent(this, profileActivity.class);
            startActivity(intent);
        });

    }
}