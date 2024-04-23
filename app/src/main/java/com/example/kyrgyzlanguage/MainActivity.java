package com.example.kyrgyzlanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonGoToRegistration).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход на активность регистрации
                startActivity(new Intent(MainActivity.this, RegistrationActivity.class));
            }
        });
    }
}
