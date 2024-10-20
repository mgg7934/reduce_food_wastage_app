package com.example.reduce_food_wastage_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    private EditText emailInput;
    private Button sendResetLinkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        // Initialize UI elements
        emailInput = findViewById(R.id.emailInput);
        sendResetLinkButton = findViewById(R.id.sendResetLinkButton);

        // Send Reset Link button listener
        sendResetLinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailInput.getText().toString();

                if (email.isEmpty()) {
                    Toast.makeText(ForgotPasswordActivity.this, "Please enter your email", Toast.LENGTH_SHORT).show();
                } else {
                    // Logic to send reset password link to email goes here
                    Toast.makeText(ForgotPasswordActivity.this, "Reset link sent to: " + email, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
