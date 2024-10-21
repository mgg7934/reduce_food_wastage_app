package com.example.reduce_food_wastage_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CardView;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class SettingsActivity extends AppCompatActivity {

    private CardView cardProfile, cardPurchaseHistory, cardSavedRecipes, cardCustomerSupport;
    private Switch notificationSwitch, darkModeSwitch;
    private Button saveSettingsButton, logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Initialize UI components
        cardProfile = findViewById(R.id.cardProfile);
        cardPurchaseHistory = findViewById(R.id.cardPurchaseHistory);
        cardSavedRecipes = findViewById(R.id.cardSavedRecipes);
        cardCustomerSupport = findViewById(R.id.cardCustomerSupport);
        notificationSwitch = findViewById(R.id.notificationSwitch);
        darkModeSwitch = findViewById(R.id.darkModeSwitch);
        saveSettingsButton = findViewById(R.id.saveSettingsButton);
        logoutButton = findViewById(R.id.logoutButton);

        // Set click listeners for card views
        cardProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingsActivity.this, "Profile Clicked", Toast.LENGTH_SHORT).show();
                // Navigate to ProfileActivity
                Intent intent = new Intent(SettingsActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        cardPurchaseHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingsActivity.this, "Purchase History Clicked", Toast.LENGTH_SHORT).show();
                // Navigate to PurchaseHistoryActivity
                Intent intent = new Intent(SettingsActivity.this, PurchaseHistoryActivity.class);
                startActivity(intent);
            }
        });

        cardSavedRecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingsActivity.this, "Saved Recipes Clicked", Toast.LENGTH_SHORT).show();
                // Navigate to SavedRecipesActivity
                Intent intent = new Intent(SettingsActivity.this, SavedRecipesActivity.class);
                startActivity(intent);
            }
        });

        cardCustomerSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingsActivity.this, "Customer Support Clicked", Toast.LENGTH_SHORT).show();
                // Navigate to CustomerSupportActivity
                Intent intent = new Intent(SettingsActivity.this, CustomerSupportActivity.class);
                startActivity(intent);
            }
        });

        // Set click listener for Save Settings button
        saveSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean notificationsEnabled = notificationSwitch.isChecked();
                boolean darkModeEnabled = darkModeSwitch.isChecked();

                // Save the settings (you can implement actual saving logic here)
                Toast.makeText(SettingsActivity.this, "Settings Saved", Toast.LENGTH_SHORT).show();
            }
        });

        // Set click listener for Logout button
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingsActivity.this, "Logged Out", Toast.LENGTH_SHORT).show();
                // Navigate to LoginActivity
                Intent intent = new Intent(SettingsActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Close the SettingsActivity after logout
            }
        });
    }
}

