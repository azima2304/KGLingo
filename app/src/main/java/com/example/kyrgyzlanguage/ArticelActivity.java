package com.example.kyrgyzlanguage;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kyrgyzlanguage.adapter.ArticleAdapter;
import com.example.kyrgyzlanguage.databinding.ActivityArticelBinding;
import com.example.kyrgyzlanguage.models.ArticleModel;

import java.util.ArrayList;
import java.util.List;

public class ArticelActivity extends AppCompatActivity {
    ActivityArticelBinding binding;
    private RecyclerView recyclerView;
    private ArticleAdapter adapter;
    private List<ArticleModel> articleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityArticelBinding.inflate(getLayoutInflater()); // Initialize the binding
        setContentView(binding.getRoot()); // Set the root view of the binding

        // Инициализация RecyclerView
        recyclerView = findViewById(R.id.rv_articles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Создание списка статей (замените на ваш реальный список данных)
        articleList = new ArrayList<>();
        articleList.add(new ArticleModel(R.drawable.bish, "Title 1", R.drawable.star, "Description 1"));
        articleList.add(new ArticleModel(R.drawable.bishkek, "Title 2", R.drawable.star, "Description 2"));
// Добавьте остальные элементы списка по аналогии

        // Добавьте остальные элементы списка по аналогии

        // Создание и установка адаптера для RecyclerView
        adapter = new ArticleAdapter(this, articleList);
        recyclerView.setAdapter(adapter);

        // Установка слушателя кликов на элементы списка
        adapter.setOnItemClickListener(position -> {
            // Обработка клика на элементе списка
            // Можно добавить код для открытия детальной информации о статье и т. д.
        });

        binding.back.setOnClickListener(v -> finish());
    }
}
