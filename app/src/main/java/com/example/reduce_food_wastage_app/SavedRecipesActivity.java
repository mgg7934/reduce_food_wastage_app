package com.example.reduce_food_wastage_app;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class SavedRecipesActivity extends AppCompatActivity {

    private CardView cardview1, cardview2;
    private Button btnRemove, btnRemove2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_recipes);

        cardview1 = findViewById(R.id.cardview1);
        cardview2 = findViewById(R.id.cardview2);
        btnRemove = findViewById(R.id.btnRemove);
        btnRemove2 = findViewById(R.id.btnRemove2);

        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Salad
                setContentView(R.layout.activity_salad);

            }
        });

        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SavedRecipesActivity.this, "Profile Clicked", Toast.LENGTH_SHORT).show();
                // Navigate to Chicken Teriyaki
                setContentView(R.layout.activity_chicken_teriyaki);

            }
        });

        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SavedRecipesActivity.this, "Removed", Toast.LENGTH_SHORT).show();

            }
        });


        btnRemove2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SavedRecipesActivity.this, "Removed", Toast.LENGTH_SHORT).show();

            }
        });


    }

}
