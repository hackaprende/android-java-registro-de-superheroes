package com.hackaprende.registrodesuperheroes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hackaprende.registrodesuperheroes.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    public static final String SUPERHERO_NAME = "superhero_name";
    public static final String ALTER_EGO = "alter_ego";
    public static final String BIO = "bio";
    public static final String RATING = "rating";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailBinding binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        String superheroName = extras.getString(SUPERHERO_NAME);
        String alterEgo = extras.getString(ALTER_EGO);
        String bio = extras.getString(BIO);
        float rating = extras.getFloat(RATING);
        binding.heroName.setText(superheroName);
        binding.alterEgoText.setText(alterEgo);
        binding.bioText.setText(bio);
        binding.ratingBar.setRating(rating);
    }
}