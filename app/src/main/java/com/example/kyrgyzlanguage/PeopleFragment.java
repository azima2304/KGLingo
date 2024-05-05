package com.example.kyrgyzlanguage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kyrgyzlanguage.adapter.CategoryAdapter;
import com.example.kyrgyzlanguage.databinding.FragmentPeopleBinding;
import com.example.kyrgyzlanguage.models.CategoryModel;

import java.util.ArrayList;
import java.util.List;

public class PeopleFragment extends Fragment {

    private FragmentPeopleBinding binding;
    private RecyclerView recyclerView;
    private CategoryAdapter adapter;
    private List<CategoryModel> categoryList;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPeopleBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = binding.rvCategory;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        categoryList = new ArrayList<>();
        categoryList.add(new CategoryModel(R.drawable.podcast, "Podcast"));
        categoryList.add(new CategoryModel(R.drawable.words, "Words"));
        categoryList.add(new CategoryModel(R.drawable.articel, "Article"));
        categoryList.add(new CategoryModel(R.drawable.test, "Test"));

        adapter = new CategoryAdapter(categoryList, requireContext());
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null; // Release the binding when the view is destroyed to avoid memory leaks
    }
}
