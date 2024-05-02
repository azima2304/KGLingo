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

import com.example.kyrgyzlanguage.adapter.TeachAdapter;
import com.example.kyrgyzlanguage.databinding.FragmentTeachBinding;
import com.example.kyrgyzlanguage.models.TeachModel;

import java.util.ArrayList;
import java.util.List;

public class TeachFragment extends Fragment {
    FragmentTeachBinding binding;

    private RecyclerView recyclerView;
    private TeachAdapter teachAdapter;
    private List<TeachModel> teachList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_teach, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.rv_teachers);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        teachList = new ArrayList<>();

        // Добавьте данные преподавателей
        teachList.add(new TeachModel("John Doe", "Tutor", "English", "B2", 12d, 20.00, "4.5", R.drawable.teacher));
        teachList.add(new TeachModel("Jane Smith", "Instructor", "French", "C1", 12d, 25.00, "4.8", R.drawable.teache));

        teachAdapter = new TeachAdapter(getContext(), getParentFragmentManager(), teachList);
        recyclerView.setAdapter(teachAdapter);
    }
}
