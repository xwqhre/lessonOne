package com.example.draft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton buttonNext;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonNext = findViewById(R.id.buttonNext);
        editText1 = findViewById(R.id.editTextName);
        editText2 = findViewById(R.id.editTextSurName);
        editText3 = findViewById(R.id.editTextSurName2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        buttonNext.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            String name1 = ((EditText) findViewById(R.id.editTextName)).getText().toString();
            String name2 = ((EditText) findViewById(R.id.editTextSurName)).getText().toString();
            String name3 = ((EditText) findViewById(R.id.editTextSurName2)).getText().toString();
            intent.putExtra("Key", name1);
            intent.putExtra("Key2", name2);
            intent.putExtra("Key3", name3);
            startActivity(intent);
        });
    }
}