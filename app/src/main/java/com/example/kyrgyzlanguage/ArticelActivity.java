package com.example.kyrgyzlanguage;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ArticelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articel);

        // Получение данных из Intent
        int imageResourceId = getIntent().getIntExtra("imageResourceId", 0);
        String title = getIntent().getStringExtra("title");
        int starImageResourceId = getIntent().getIntExtra("starImageResourceId", 0);
        String description = getIntent().getStringExtra("description");


    }
}
