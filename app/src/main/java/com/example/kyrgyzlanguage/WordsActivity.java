package com.example.kyrgyzlanguage;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kyrgyzlanguage.adapter.WordAdapter;
import com.example.kyrgyzlanguage.databinding.ActivityWordsBinding;
import com.example.kyrgyzlanguage.models.WordModel;

import java.util.Arrays;

public class WordsActivity extends AppCompatActivity {

    private ActivityWordsBinding binding;
    private RecyclerView recyclerView;
    private WordAdapter wordAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWordsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        recyclerView = binding.rvWords;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        WordModel[] wordList = new WordModel[]{
                new WordModel("Word 1", "Description 1"),
                new WordModel("Word 2", "Description 2"),
                new WordModel("Word 3", "Description 3"),
                // Add more WordModel objects as needed
        };

        wordAdapter = new WordAdapter(Arrays.asList(wordList));
        recyclerView.setAdapter(wordAdapter);

        binding.back.setOnClickListener(v -> finish());
    }
}
