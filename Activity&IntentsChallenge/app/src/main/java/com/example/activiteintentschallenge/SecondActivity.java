package com.example.activiteintentschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.txt_display);
        Intent intent = getIntent();

        String para1 = intent.getStringExtra("first");
        String para2= intent.getStringExtra("second");
        String para3 = intent.getStringExtra("third");

        textView.setText(""+ para1);

        if (para2!=null){
            textView.setText(""+para2);
        }
        if (para3!=null){
            textView.setText((""+para3));
        }





    }
}