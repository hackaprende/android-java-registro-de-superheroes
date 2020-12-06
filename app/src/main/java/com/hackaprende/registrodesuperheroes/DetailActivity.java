package com.hackaprende.registrodesuperheroes;

import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hackaprende.registrodesuperheroes.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    public static final String SUPERHERO_KEY = "superhero";
    public static final String BITMAP_KEY = "bitmap";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailBinding binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        Superhero superhero = extras.getParcelable(SUPERHERO_KEY);
        Bitmap bitmap = extras.getParcelable(BITMAP_KEY);

        if (bitmap != null) {
            binding.imageView5.setImageBitmap(bitmap);
        }
        binding.setSuperhero(superhero);
    }
}