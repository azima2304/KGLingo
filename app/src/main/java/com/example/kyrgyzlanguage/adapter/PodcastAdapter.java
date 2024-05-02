package com.example.kyrgyzlanguage.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kyrgyzlanguage.R;
import com.example.kyrgyzlanguage.models.PodcastModel;

import java.util.List;

public class PodcastAdapter extends RecyclerView.Adapter<PodcastAdapter.PodcastViewHolder> {

    private final List<PodcastModel> podcastList;

    public PodcastAdapter(List<PodcastModel> podcastList) {
        this.podcastList = podcastList;
    }

    @NonNull
    @Override
    public PodcastViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_podcast, parent, false);
        return new PodcastViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PodcastViewHolder holder, int position) {
        PodcastModel podcast = podcastList.get(position);
        holder.titleTextView.setText(podcast.getTitle());
        holder.descriptionTextView.setText(podcast.getDescription());

        // Обработчик клика на элементе (опционально)
        holder.itemView.setOnClickListener(v -> {
            // Обработка клика элемента (например, открытие подробной информации)
        });
    }

    @Override
    public int getItemCount() {
        return podcastList.size();
    }

    public static class PodcastViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView descriptionTextView;
        ImageView playButton;
        ImageView stopButton;

        public PodcastViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.text_podcast_title);
            descriptionTextView = itemView.findViewById(R.id.text_podcast_description);
            playButton = itemView.findViewById(R.id.button_play);
            stopButton = itemView.findViewById(R.id.button_stop);
        }
    }
}
