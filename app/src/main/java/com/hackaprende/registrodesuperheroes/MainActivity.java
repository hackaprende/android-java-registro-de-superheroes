package com.hackaprende.registrodesuperheroes;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hackaprende.registrodesuperheroes.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.saveButton.setOnClickListener(v -> {
            openDetailActivity();
        });
    }

    private void openDetailActivity() {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }
}