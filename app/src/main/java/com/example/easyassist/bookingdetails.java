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

public class bookingdetails extends AppCompatActivity {

    ArrayList<bookingdetailModel> arrbookingdetails = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bookingdetails);
        RecyclerView recyclerView1 = findViewById(R.id.recyclerview1);

        recyclerView1.setLayoutManager(new LinearLayoutManager(this));


        arrbookingdetails.add(new bookingdetailModel("Name:","Khemnarayan"));
        arrbookingdetails.add(new bookingdetailModel("Phone no:" ,"98********"));
        arrbookingdetails.add(new bookingdetailModel("Email:" ,"khojwar@gmail.com"));
        arrbookingdetails.add(new bookingdetailModel("Description:" ,"Pipe leakage"));


        bookingdetailadapter adapter = new bookingdetailadapter(this,arrbookingdetails);
        recyclerView1.setAdapter(adapter);
        }
    }
