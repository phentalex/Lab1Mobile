package com.example.thirdapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        TextView textview = findViewById((R.id.textview));
        String getText = getIntent().getStringExtra("Имя");
        String fullText = "Переданный параметр: " + getText;
        textview.setText(fullText);
    }



}