package com.example.easyassist;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mybooking extends AppCompatActivity {

    ArrayList<mybookingmodel> arrmybookings = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mybooking);
        RecyclerView recyclerView2 = findViewById(R.id.recyclerview2);

        recyclerView2.setLayoutManager(new LinearLayoutManager(this));


        arrmybookings.add(new mybookingmodel(R.drawable.electrician,"electrician","2000","Running"));
        arrmybookings.add(new mybookingmodel(R.drawable.electrician,"electrician","2000","Running"));
        arrmybookings.add(new mybookingmodel(R.drawable.electrician,"electrician","2000","Running"));
        arrmybookings.add(new mybookingmodel(R.drawable.electrician,"electrician","2000","Running"));

        mybookingadapter adapter = new mybookingadapter(this,arrmybookings);
        recyclerView2.setAdapter(adapter);

        }
    }
