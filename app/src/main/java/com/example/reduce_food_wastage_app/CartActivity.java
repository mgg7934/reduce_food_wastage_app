package com.example.reduce_food_wastage_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CartActivity extends AppCompatActivity {

    private Button cancelButton, proceedButton, buttonRemove, buttonRemove2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        buttonRemove = findViewById(R.id.buttonRemove);
        buttonRemove2 = findViewById(R.id.buttonRemove2);
        cancelButton = findViewById(R.id.buttonCancel);  // Cancel button
        proceedButton = findViewById(R.id.buttonProceed);  // Proceed to Payment button

        ImageButton backButton = findViewById(R.id.backButton);

        // Set click listener to go back when clicked
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Go back to previous activity
            }
        });


        buttonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CartActivity.this, "Removed", Toast.LENGTH_SHORT).show();

            }
        });
        buttonRemove2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CartActivity.this, "Removed", Toast.LENGTH_SHORT).show();

            }
        });
        // Set up Cancel button click
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CartActivity.this, "Cancelled", Toast.LENGTH_SHORT).show();
                // Optionally finish the activity or clear the cart
                finish();  // Close the activity when Cancel is pressed
                Intent intent = new Intent(CartActivity.this, SurplusFoodActivity.class);
                startActivity(intent);
            }
        });

        // Set up Proceed to Payment button click
        proceedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CartActivity.this, "Proceeding to Payment", Toast.LENGTH_SHORT).show();

                 Intent intent = new Intent(CartActivity.this, PaymentActivity.class);
                 startActivity(intent);
            }
        });
    }
}
