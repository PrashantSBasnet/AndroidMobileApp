package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        TextView textView = findViewById(R.id.textView);

        /**
         * retrieving data
         */
        Intent intent = getIntent();

        /**
         * defaultValue can be any!!
         */

        int num = intent.getIntExtra("key", 0);
        textView.setText(""+ num);
    }
}