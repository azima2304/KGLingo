package com.example.kyrgyzlanguage;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kyrgyzlanguage.adapter.PodcastAdapter;
import com.example.kyrgyzlanguage.databinding.ActivityPodcastBinding;
import com.example.kyrgyzlanguage.models.PodcastModel;

import java.util.Arrays;
import java.util.List;

public class PodcastActivity extends AppCompatActivity {
    private ActivityPodcastBinding binding; // Corrected here

    private RecyclerView recyclerView;
    private PodcastAdapter podcastAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPodcastBinding.inflate(getLayoutInflater()); // Corrected here
        setContentView(binding.getRoot());

        recyclerView = findViewById(R.id.rv_podcast);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<PodcastModel> podcastList = Arrays.asList(
                new PodcastModel("Podcast 1", "Description 1"),
                new PodcastModel("Podcast 2", "Description 2"),
                new PodcastModel("Podcast 3", "Description 3")
                // Add more PodcastModel objects as needed
        );

        podcastAdapter = new PodcastAdapter(podcastList);
        recyclerView.setAdapter(podcastAdapter);

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
