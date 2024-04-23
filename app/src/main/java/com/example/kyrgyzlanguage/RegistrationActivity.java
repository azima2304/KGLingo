package com.example.kyrgyzlanguage;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kyrgyzlanguage.R;

public class RegistrationActivity extends AppCompatActivity {

    private EditText editTextEmail, editTextPassword;
    private ImageView imageViewShowPassword;

    private boolean isPasswordVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        imageViewShowPassword = findViewById(R.id.imageViewShowPassword);

        imageViewShowPassword.setOnClickListener(v -> togglePasswordVisibility());

        findViewById(R.id.register_button).setOnClickListener(v -> {
            String email = editTextEmail.getText().toString();
            String password = editTextPassword.getText().toString();

            Toast.makeText(this, "Регистрация: Email - " + email + ", Password - " + password, Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.textViewForgotPassword).setOnClickListener(v -> {
            // Создаем Intent для перехода на новую активность
            Intent intent = new Intent(this, ForgotPasswordActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.textViewRegister).setOnClickListener(v -> {
            // Создаем Intent для перехода на новую активность
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        });


    }

    private void togglePasswordVisibility() {
        isPasswordVisible = !isPasswordVisible;
        int drawable = isPasswordVisible ? R.drawable.hidden : R.drawable.hidden;
        imageViewShowPassword.setImageResource(drawable);
        editTextPassword.setTransformationMethod(isPasswordVisible ? HideReturnsTransformationMethod.getInstance() : PasswordTransformationMethod.getInstance());
        editTextPassword.setSelection(editTextPassword.getText().length());
    }





}
