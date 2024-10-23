package com.example.reduce_food_wastage_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class RecipesSuggestionActivity extends AppCompatActivity {
    private CardView toCardview1, toCardview2, toCardview3;
    private Button btnAdd, btnAdd2, btnAdd3, getBtnRemove2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes_suggestion);

        toCardview1 = findViewById(R.id.salad1);
        toCardview2 = findViewById(R.id.ck1);
        toCardview3 = findViewById(R.id.ck2);
        btnAdd = findViewById(R.id.btnAdd);
        btnAdd2 = findViewById(R.id.btnAdd2);
        btnAdd3 = findViewById(R.id.btnAdd3);

        ImageButton backButton = findViewById(R.id.backButton);

        // Set click listener to go back when clicked
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Go back to previous activity
            }
        });

        toCardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Salad
                setContentView(R.layout.activity_salad);

            }
        });

        toCardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Chicken Teriyaki
                setContentView(R.layout.activity_chicken_teriyaki);

            }
        });

        toCardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Chicken Teriyaki
                setContentView(R.layout.activity_chicken_teriyaki);

            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RecipesSuggestionActivity.this, "Removed from saved list", Toast.LENGTH_SHORT).show();

            }
        });


        btnAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RecipesSuggestionActivity.this, "Removed from saved list", Toast.LENGTH_SHORT).show();

            }
        });

        btnAdd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RecipesSuggestionActivity.this, "Added to Saved list", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
