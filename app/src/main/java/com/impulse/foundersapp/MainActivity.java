package com.impulse.foundersapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Founder> founderList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        recyclerView = findViewById(R.id.founderRecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        founderList = new ArrayList<>();
        founderList.add(new Founder("Max Payne", R.drawable.payne, "Co-founder of Payne Enterprises",
                "Payne Enterprises", "1980", "$1.2 Billion"));

        founderList.add(new Founder("Walter White", R.drawable.white, "CEO of Walter White Industries",
                "WW Industries", "1978", "$80 Million"));

        founderList.add(new Founder("Tommy Shelby", R.drawable.shelby, "Founder of Shelby Company",
                "Shelby Company Ltd", "1990", "$600 Million"));

        founderList.add(new Founder("Bruce Wayne", R.drawable.wayne, "CEO of Wayne Enterprises",
                "Wayne Enterprises", "1989", "$9.2 Billion"));



        FounderAdapter adapter = new FounderAdapter(this, founderList);
        recyclerView.setAdapter(adapter);
    }
}
