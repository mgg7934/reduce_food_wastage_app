package com.example.reduce_food_wastage_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PaymentActivity extends AppCompatActivity {

    private EditText cardNumberInput, cardHolderNameInput, expirationDateInput, cvvInput;
    private Button payNowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        // Initialize UI components
        cardNumberInput = findViewById(R.id.cardNumberInput);
        cardHolderNameInput = findViewById(R.id.cardHolderNameInput);
        expirationDateInput = findViewById(R.id.expirationDateInput);
        cvvInput = findViewById(R.id.cvvInput);
        payNowButton = findViewById(R.id.payNowButton);

        // Set up button click listener
        payNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle payment logic here
                if (validateInputs()) {
                    Toast.makeText(PaymentActivity.this, "Payment Successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(PaymentActivity.this, "Please fill in all details", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Method to validate user inputs
    private boolean validateInputs() {
        return !cardNumberInput.getText().toString().isEmpty()
                && !cardHolderNameInput.getText().toString().isEmpty()
                && !expirationDateInput.getText().toString().isEmpty()
                && !cvvInput.getText().toString().isEmpty();
    }
}