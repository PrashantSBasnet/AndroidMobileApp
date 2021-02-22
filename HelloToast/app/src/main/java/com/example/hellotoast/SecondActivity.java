package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.textView);
        Intent intent = getIntent();

        //int num = intent.getIntExtra("counter", 0);
        String msg = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        textView.setText(""+msg);

    }
}