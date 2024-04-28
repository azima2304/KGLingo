package com.example.kyrgyzlanguage.adapter;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kyrgyzlanguage.R;
import com.example.kyrgyzlanguage.models.ArticleModel;

import java.util.List;

public class ArticleAdapter {

    private Context context;
    private List<ArticleModel> articleList;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public ArticleAdapter(Context context, List<ArticleModel> articleList) {
        this.context = context;
        this.articleList = articleList;
    }

    public class ArticleViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView titleTextView;
        ImageView starImageView;
        TextView descriptionTextView;
        Button moreButton;

        public ArticleViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_user);
            titleTextView = itemView.findViewById(R.id.articel_name);
            starImageView = itemView.findViewById(R.id.image_star);
            descriptionTextView = itemView.findViewById(R.id.articel_description);
            moreButton = itemView.findViewById(R.id.more_articel);

            moreButton.setOnClickListener(v -> {
                if (listener != null) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        listener.onItemClick(position);
                    }
                }
            });
        }
    }
}
