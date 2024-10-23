package com.example.reduce_food_wastage_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DonationActivity extends AppCompatActivity {


    private Button buttonDonate1, buttonDonate2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation);  // Link to your XML layout


        buttonDonate1 = findViewById(R.id.buttonDonate);
        buttonDonate2 = findViewById(R.id.buttonDonate2);

        ImageButton backButton = findViewById(R.id.backButton);

        // Set click listener to go back when clicked
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Go back to previous activity
            }
        });

        // Set onClickListener for "Donate" button for Card 1
        buttonDonate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DonationActivity.this, "Donated", Toast.LENGTH_SHORT).show();
            }
        });

        // Set onClickListener for "Donate" button for Card 2
        buttonDonate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DonationActivity.this, "Donated", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

