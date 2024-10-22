package com.example.reduce_food_wastage_app;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PurchaseHistoryActivity extends AppCompatActivity {

    private TextView tvDownloadReceipt, tvDownloadReceipt2, tvDownloadReceipt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_history);

        // Find the download receipt TextView

        tvDownloadReceipt = findViewById(R.id.tvDownloadReceipt);
        tvDownloadReceipt2 = findViewById(R.id.tvDownloadReceipt2);
        tvDownloadReceipt3 = findViewById(R.id.tvDownloadReceipt3);

        ImageButton backButton = findViewById(R.id.backButton);

        // Set click listener to go back when clicked
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Go back to previous activity
            }
        });

        // Set a click listener on the download receipt TextView
        tvDownloadReceipt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a toast message when the download receipt is clicked
                Toast.makeText(PurchaseHistoryActivity.this, "Downloading receipt...", Toast.LENGTH_SHORT).show();
            }
        });

        tvDownloadReceipt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a toast message when the download receipt is clicked
                Toast.makeText(PurchaseHistoryActivity.this, "Downloading receipt...", Toast.LENGTH_SHORT).show();
            }
        });

        tvDownloadReceipt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a toast message when the download receipt is clicked
                Toast.makeText(PurchaseHistoryActivity.this, "Downloading receipt...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
