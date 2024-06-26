package com.example.kyrgyzlanguage.description_teacher;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;

import com.example.kyrgyzlanguage.databinding.FragmentTeachBinding;
import com.example.kyrgyzlanguage.models.ModelTeacher;

import java.util.ArrayList;

public class DescriptionFragment extends Fragment {
    FragmentTeachBinding binding;

    ArrayList<ModelTeacher> d_list = new ArrayList<>();
    DescAdapter adapter;
    NavController navController;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        adapter = new DescAdapter();


    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = FragmentTeachBinding.inflate(inflater,
                container, false);
        View root = binding.getRoot();
        return root;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        if(d_list!=null){
            adapter.setListD(d_list);
        }else {
            Toast.makeText(requireActivity(), "Вы не выбрали товар", Toast.LENGTH_SHORT).show();
        }
        binding.rvTeachers.setAdapter(adapter);

    }



}