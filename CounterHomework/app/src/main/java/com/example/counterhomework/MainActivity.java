package com.example.counterhomework;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count=0;
    private TextView textView;
    private Button btnIncrement;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.display_count);
        btnIncrement = findViewById(R.id.button);


        //the bundle is not null when device rotates
        if (savedInstanceState!=null){
            count = savedInstanceState.getInt("key_counter");
            textView.setText(Integer.toString(count));
        }

    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("key_counter", count);
    }



    //method to increase count when button is pressed
    public void increaseCount(View view) {
        count++;
        textView.setText("" + count);
    }

}