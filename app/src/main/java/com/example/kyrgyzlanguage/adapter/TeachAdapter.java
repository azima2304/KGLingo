package com.example.kyrgyzlanguage.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kyrgyzlanguage.R;
import com.example.kyrgyzlanguage.description_teacher.DescriptionFragment;
import com.example.kyrgyzlanguage.models.TeachModel;

import java.util.List;

public class TeachAdapter extends RecyclerView.Adapter<TeachAdapter.TeachViewHolder> {

    private Context context;
    private List<TeachModel> teachList;
    private FragmentManager fragmentManager;

    public TeachAdapter(Context context, FragmentManager fragmentManager, List<TeachModel> teachList) {
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.teachList = teachList;
    }

    @NonNull
    @Override
    public TeachViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_teach, parent, false);
        return new TeachViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeachViewHolder holder, int position) {
        TeachModel teachModel = teachList.get(position);

        holder.userName.setText(teachModel.getUserName());
        holder.status.setText(teachModel.getStatus());
        holder.language.setText(teachModel.getLanguage());
        holder.level.setText(teachModel.getLevel());
        holder.lessonType.setText(String.valueOf(teachModel.getLessonDuration()));
        holder.price.setText(String.valueOf(teachModel.getPrice()));
        holder.estimation.setText(String.valueOf(teachModel.getRating()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход в DescriptionFragment по нажатию на элемент списка
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, new DescriptionFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

    }

    @Override
    public int getItemCount() {
        return teachList.size();
    }

    public static class TeachViewHolder extends RecyclerView.ViewHolder {

        private TextView userName;
        private TextView status;
        private TextView language;
        private TextView level;
        private TextView lessonType;
        private TextView price;
        private TextView estimation;
        private ImageView teacherImage;

        public TeachViewHolder(@NonNull View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.user_name);
            status = itemView.findViewById(R.id.status_teacher);
            language = itemView.findViewById(R.id.language_layer);
            level = itemView.findViewById(R.id.language);
            lessonType = itemView.findViewById(R.id.duration);
            price = itemView.findViewById(R.id.price);
            estimation = itemView.findViewById(R.id.estimation);
            teacherImage = itemView.findViewById(R.id.image_teacher);
        }
    }
}
