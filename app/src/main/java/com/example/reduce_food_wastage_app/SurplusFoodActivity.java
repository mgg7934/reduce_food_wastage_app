package com.example.reduce_food_wastage_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class SurplusFoodActivity extends AppCompatActivity {

    // Declare views for each card

    private Button buttonAddToCart1, buttonAddToCart2, buttonAddToCart3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surplus_food);  // Link to your XML layout

        buttonAddToCart1 = findViewById(R.id.buttonAddToCart);
        buttonAddToCart2 = findViewById(R.id.buttonAddToCart2);
        buttonAddToCart3 = findViewById(R.id.buttonAddToCart3);

        // Set onClickListener for "Add to Cart" button for Card 1
        buttonAddToCart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(SurplusFoodActivity.this, " Added to cart", Toast.LENGTH_SHORT).show();
            }
        });

        // Set onClickListener for "Add to Cart" button for Card 2
        buttonAddToCart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SurplusFoodActivity.this, " Added to cart", Toast.LENGTH_SHORT).show();
            }
        });

        // Set onClickListener for "Add to Cart" button for Card 3
        buttonAddToCart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SurplusFoodActivity.this, " Added to cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
