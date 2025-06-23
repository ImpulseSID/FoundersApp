package com.impulse.foundersapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView nameTextView, descTextView, companyTextView, birthYearTextView, netWorthTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.detailImage);
        nameTextView = findViewById(R.id.detailName);
        descTextView = findViewById(R.id.detailDesc);
        companyTextView = findViewById(R.id.detailCompany);
        birthYearTextView = findViewById(R.id.detailBirthYear);
        netWorthTextView = findViewById(R.id.detailNetWorth);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        int imageResId = intent.getIntExtra("imageResId", R.drawable.default_image);
        String description = intent.getStringExtra("desc");
        String company = intent.getStringExtra("company");
        String birthYear = intent.getStringExtra("birthYear");
        String netWorth = intent.getStringExtra("netWorth");

        imageView.setImageResource(imageResId);
        nameTextView.setText(name);
        descTextView.setText(description);
        companyTextView.setText("Company: " + company);
        birthYearTextView.setText("Born: " + birthYear);
        netWorthTextView.setText("Net Worth: " + netWorth);
    }
}
