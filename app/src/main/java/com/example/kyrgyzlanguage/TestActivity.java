package com.example.kyrgyzlanguage;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kyrgyzlanguage.adapter.TestAdapter;
import com.example.kyrgyzlanguage.models.TestQuestion;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {
    private RecyclerView rvChoose;
    private TestAdapter adapter;
    private List<TestQuestion> testQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        rvChoose = findViewById(R.id.rv_choose);
        ImageView back = findViewById(R.id.back);

        // Set up RecyclerView
        testQuestions = new ArrayList<>();
        // Add test questions (you need to implement this part)
        // For example:
        testQuestions.add(new TestQuestion("Question 1", "Option 1", "Option 2", "Option 3", "Option 1"));
        testQuestions.add(new TestQuestion("Question 2", "Option 1", "Option 2", "Option 3", "Option 2"));
        // Add more questions as needed

        adapter = new TestAdapter(testQuestions, this);
        rvChoose.setLayoutManager(new LinearLayoutManager(this));
        rvChoose.setAdapter(adapter);

        // Handle back button click
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
