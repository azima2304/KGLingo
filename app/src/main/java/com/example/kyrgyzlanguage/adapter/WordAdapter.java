package com.example.kyrgyzlanguage.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kyrgyzlanguage.R;
import com.example.kyrgyzlanguage.models.WordModel;

import java.util.List;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordViewHolder> {

    private final List<WordModel> wordList;

    public WordAdapter(List<WordModel> wordList) {
        this.wordList = wordList;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the item layout for each word
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_words, parent, false);
        return new WordViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        // Get the WordModel object at the current position
        WordModel word = wordList.get(position);

        // Bind data from WordModel to the views in the holder
        holder.wordTitle.setText(word.getTitle());
        holder.wordDescription.setText(word.getDescription());

        // Set click listener for the item (optional)
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle item click here (e.g., open detail activity)
            }
        });
    }

    @Override
    public int getItemCount() {
        return wordList.size();
    }

    // This class holds references to the views in each item layout
    public static class WordViewHolder extends RecyclerView.ViewHolder {

        private final TextView wordTitle;
        private final TextView wordDescription;

        public WordViewHolder(View itemView) {
            super(itemView);
            wordTitle = itemView.findViewById(R.id.text_word_title); // Assuming these IDs exist in item_words.xml
            wordDescription = itemView.findViewById(R.id.text_word_description);
        }
    }
}
