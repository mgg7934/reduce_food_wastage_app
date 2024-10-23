package com.example.reduce_food_wastage_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class GrocRestraurantList extends AppCompatActivity {

    private CardView cardViewRestaurantA, cardViewStoreB, cardViewCafeC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groc_restraurant_list);

        // Initialize the CardViews
        cardViewRestaurantA = findViewById(R.id.cardViewRestaurantA);
        cardViewStoreB = findViewById(R.id.cardViewStoreB);
        cardViewCafeC = findViewById(R.id.cardViewCafeC);

        ImageButton backButton = findViewById(R.id.backButton);

        // Set click listener to go back when clicked
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Go back to previous activity
            }
        });


        // Set click listener for Restaurant A CardView
        cardViewRestaurantA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GrocRestraurantList.this, SurplusFoodActivity.class);
                startActivity(intent);
            }
        });

        // Set click listener for Store B CardView
        cardViewStoreB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GrocRestraurantList.this, SurplusFoodActivity.class);
                startActivity(intent);

            }
        });

        // Set click listener for Cafe C CardView
        cardViewCafeC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GrocRestraurantList.this, SurplusFoodActivity.class);
                startActivity(intent);
            }
        });
    }
}

