package com.example.kyrgyzlanguage;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.kyrgyzlanguage.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    BottomNavigationView bottomNavigationView;
    private int currentSelectedItemId = R.id.home_navigation; // По умолчанию выбрана страница "Home"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        bottomNavigationView = findViewById(R.id.bottom_navigation_view); // Переместить здесь

        replaceFragment(new HomeFragment());

        binding.bottomNavigationView.setBackground(null);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getTitle().toString()) {
                case "Home":
                    replaceFragment(new HomeFragment());
                    bottomNavigationView.getMenu().findItem(R.id.home_navigation)
                            .setIcon(R.drawable.bottom_nav_item_selected_home);
                    break;

                case "People":
                    replaceFragment(new PeopleFragment());
                    bottomNavigationView.getMenu().findItem(R.id.people_navigation)
                            .setIcon(R.drawable.bottom_nav_item_selected_people);
                    break;

                case "Profile":
                    replaceFragment(new ProfileFragment());
                    bottomNavigationView.getMenu().findItem(R.id.profile_navigation)
                            .setIcon(R.drawable.bottom_nav_item_selected_profile);
                    break;

                case "Teach":
                    replaceFragment(new TeachFragment());
                    bottomNavigationView.getMenu().findItem(R.id.teach_navigation)
                            .setIcon(R.drawable.bottom_nav_item_selected_teach);
                    break;

                default:
                    replaceFragment(new HomeFragment());
                    bottomNavigationView.getMenu().findItem(R.id.home_navigation)
                            .setIcon(R.drawable.bottom_nav_item_selected_home);
                    break;
            }
            return true;
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_l, fragment);
        fragmentTransaction.commit();
    }
}
