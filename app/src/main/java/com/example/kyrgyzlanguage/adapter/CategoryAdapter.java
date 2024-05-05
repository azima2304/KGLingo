package com.example.kyrgyzlanguage.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kyrgyzlanguage.R;
import com.example.kyrgyzlanguage.models.CategoryModel;
import com.example.kyrgyzlanguage.PodcastActivity;
import com.example.kyrgyzlanguage.WordsActivity;
import com.example.kyrgyzlanguage.ArticelActivity;
import com.example.kyrgyzlanguage.TestActivity;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    private List<CategoryModel> categoryList;
    private Context context;

    public CategoryAdapter(List<CategoryModel> categoryList, Context context) {
        this.categoryList = categoryList;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        CategoryModel category = categoryList.get(holder.getAdapterPosition());
        holder.nameTextView.setText(category.getName());
        holder.imageView.setImageResource(category.getImage());

        // Применение фонового ресурса к itemView при нажатии
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Обработка нажатия на элемент
                holder.itemView.setBackgroundResource(R.drawable.round_back_stroke_white);

                // Другие действия при нажатии, например, открытие активности
                switch (holder.getAdapterPosition()) {
                    case 0:
                        Intent intentPodcast = new Intent(context, PodcastActivity.class);
                        context.startActivity(intentPodcast);
                        break;
                    case 1:
                        Intent intentWords = new Intent(context, WordsActivity.class);
                        context.startActivity(intentWords);
                        break;
                    case 2:
                        Intent intentArticle = new Intent(context, ArticelActivity.class);
                        context.startActivity(intentArticle);
                        break;
                    case 3:
                        Intent intentTest = new Intent(context, TestActivity.class);
                        context.startActivity(intentTest);
                        break;
                    // Добавьте обработку других позиций по мере необходимости
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameTextView;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.categoryImage);
            nameTextView = itemView.findViewById(R.id.categoryName);
        }
    }
}
