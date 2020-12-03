package com.hackaprende.registrodesuperheroes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hackaprende.registrodesuperheroes.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    public static final String SUPERHERO_KEY = "superhero";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailBinding binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        Superhero superhero = extras.getParcelable(SUPERHERO_KEY);
        binding.setSuperhero(superhero);
    }
}