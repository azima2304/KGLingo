package com.example.kyrgyzlanguage;

import android.app.Activity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class WelcomeActivity extends Activity {
    private LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        lottieAnimationView = findViewById(R.id.lottie_animation);
        lottieAnimationView.setAnimation(R.raw.mainlottie);
        lottieAnimationView.playAnimation();


    }
}
