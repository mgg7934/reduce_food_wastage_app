package com.example.reduce_food_wastage_app;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private ImageView profilePicture;
    private EditText fullNameInput, usernameInput, emailInput, phoneNumberInput, passwordInput;
    private Spinner addressDropdown;
    private TextView managePaymentText;
    private Button saveProfileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Initialize UI components
        profilePicture = findViewById(R.id.profilePicture);
        fullNameInput = findViewById(R.id.fullNameInput);
        usernameInput = findViewById(R.id.usernameInput);
        emailInput = findViewById(R.id.emailInput);
        phoneNumberInput = findViewById(R.id.phoneNumberInput);
        passwordInput = findViewById(R.id.passwordInput);
        addressDropdown = findViewById(R.id.addressDropdown);
        managePaymentText = findViewById(R.id.managePaymentText);
        saveProfileButton = findViewById(R.id.saveProfileButton);

        // Populate address dropdown (Spinner)
        // This could be populated from a database or other data source
        String[] addresses = {"Address 1", "Address 2", "Address 3"};
        ArrayAdapter<String> addressAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, addresses);
        addressDropdown.setAdapter(addressAdapter);

        // Save Profile button click listener
        saveProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateInputs()) {
                    // Save profile logic here
                    Toast.makeText(ProfileActivity.this, "Profile Saved", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ProfileActivity.this, "Please fill in all required fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Method to validate the input fields
    private boolean validateInputs() {
        if (TextUtils.isEmpty(fullNameInput.getText().toString()) ||
                TextUtils.isEmpty(usernameInput.getText().toString()) ||
                TextUtils.isEmpty(phoneNumberInput.getText().toString()) ||
                TextUtils.isEmpty(emailInput.getText().toString())) {
            return false;
        }
        return true;
    }
}
