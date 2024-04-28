package com.example.kyrgyzlanguage.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kyrgyzlanguage.R;
import com.example.kyrgyzlanguage.models.TestQuestion;

import java.util.List;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {
    private List<TestQuestion> testQuestions;
    private Context context;

    public TestAdapter(List<TestQuestion> testQuestions, Context context) {
        this.testQuestions = testQuestions;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_test, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TestQuestion question = testQuestions.get(position);
        holder.questionText.setText(question.getQuestion());
        holder.option1.setText(question.getOption1());
        holder.option2.setText(question.getOption2());
        holder.option3.setText(question.getOption3());

        holder.option1.setOnClickListener(view -> checkAnswer(holder.option1, question));
        holder.option2.setOnClickListener(view -> checkAnswer(holder.option2, question));
        holder.option3.setOnClickListener(view -> checkAnswer(holder.option3, question));
    }

    @Override
    public int getItemCount() {
        return testQuestions.size();
    }

    private void checkAnswer(AppCompatButton selectedOption, TestQuestion question) {
        if (selectedOption.getText().toString().equals(question.getCorrectAnswer())) {
            selectedOption.setBackground(ContextCompat.getDrawable(context, R.drawable.round_true_answer));
        } else {
            selectedOption.setBackground(ContextCompat.getDrawable(context, R.drawable.round_falsch_answer));
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView questionText;
        AppCompatButton option1, option2, option3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            questionText = itemView.findViewById(R.id.question);
            option1 = itemView.findViewById(R.id.option1);
            option2 = itemView.findViewById(R.id.option2);
            option3 = itemView.findViewById(R.id.option3);
        }
    }
}
