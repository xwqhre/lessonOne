package com.example.draft;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView ViewName;
    private TextView ViewSurName;
    private TextView ViewSurName2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ViewName = findViewById(R.id.editTextName);
        ViewSurName = findViewById(R.id.editTextSurName);
        ViewSurName2 = findViewById(R.id.editTextSurName2);
        ViewName.setText(getIntent().getStringExtra("Key"));
        ViewSurName.setText(getIntent().getStringExtra("Key2"));
        ViewSurName2.setText(getIntent().getStringExtra("Key3"));
    }
}