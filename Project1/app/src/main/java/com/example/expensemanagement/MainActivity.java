package com.example.expensemanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Automatically called when activity load
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trip_details);
    }
}