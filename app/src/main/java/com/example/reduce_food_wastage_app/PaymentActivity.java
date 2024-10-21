package com.example.reduce_food_wastage_app;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PaymentActivity extends AppCompatActivity {

    private EditText cardNumberInput, cardHolderNameInput, expirationDateInput, cvvInput;
    private Button payNowButton, cancelButton;

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
        cancelButton = findViewById(R.id.cancelButton);

        // Pay Now button click listener
        payNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateInputs()) {
                    // Show payment success popup
                    showPaymentSuccessDialog();
                } else {
                    Toast.makeText(PaymentActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Cancel button click listener
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Ends this activity and goes back to the previous one
            }
        });
    }

    // Method to validate the input fields
    private boolean validateInputs() {
        String cardNumber = cardNumberInput.getText().toString();
        String cardHolderName = cardHolderNameInput.getText().toString();
        String expirationDate = expirationDateInput.getText().toString();
        String cvv = cvvInput.getText().toString();

        if (TextUtils.isEmpty(cardNumber) || cardNumber.length() != 16) {
            cardNumberInput.setError("Enter a valid 16-digit card number");
            return false;
        }

        if (TextUtils.isEmpty(cardHolderName)) {
            cardHolderNameInput.setError("Enter cardholder's name");
            return false;
        }

        if (TextUtils.isEmpty(expirationDate) || !expirationDate.matches("(0[1-9]|1[0-2])/([0-9]{2})")) {
            expirationDateInput.setError("Enter a valid expiration date (MM/YY)");
            return false;
        }

        if (TextUtils.isEmpty(cvv) || cvv.length() != 3) {
            cvvInput.setError("Enter a valid 3-digit CVV");
            return false;
        }

        return true;
    }

    // Method to show the payment success popup
    private void showPaymentSuccessDialog() {
        // Create an AlertDialog builder
        AlertDialog.Builder builder = new AlertDialog.Builder(PaymentActivity.this);

        // Inflate the custom layout
        View dialogView = getLayoutInflater().inflate(R.layout.payment_success_dialog, null);
        builder.setView(dialogView);

        // Create the AlertDialog
        final AlertDialog dialog = builder.create();

        // Find the OK button inside the custom layout
        Button okButton = dialogView.findViewById(R.id.okButton);

        // Set the OK button's onClick behavior
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss(); // Dismiss the dialog
                redirectToDashboard(); // Redirect to dashboard
            }
        });

        // Show the dialog
        dialog.show();
    }


    // Method to redirect to DashboardActivity
    private void redirectToDashboard() {
        Intent intent = new Intent(PaymentActivity.this,SettingsActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  // Clears the back stack
        startActivity(intent);
        finish();  // Ends the PaymentActivity
    }
}

