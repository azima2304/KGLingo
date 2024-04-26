package com.example.kyrgyzlanguage.description_teacher;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.kyrgyzlanguage.databinding.ItemTeacherDescCardBinding;
import com.example.kyrgyzlanguage.models.ModelTeacher;

import java.util.ArrayList;
import java.util.List;

public class DescAdapter extends RecyclerView.Adapter<DescAdapter.ViewHolder> {
    ItemTeacherDescCardBinding binding;
    List<ModelTeacher> listD = new ArrayList<>();
    public void setListD(List<ModelTeacher> listD) {
        this.listD = listD;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemTeacherDescCardBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(listD.get(position));

    }





    @Override
    public int getItemCount() {
        return listD.size();
    }



    public  class ViewHolder extends  RecyclerView.ViewHolder{
        public  ViewHolder(@NonNull ItemTeacherDescCardBinding itemView){
            super(itemView.getRoot());
        }

        public void onBind(ModelTeacher modelTeacher) {
            binding.teacherName.setText(modelTeacher.getName());
            binding.status.setText(modelTeacher.getStatus());
            binding.description.setText(modelTeacher.getDesc());
        }
    }
}
