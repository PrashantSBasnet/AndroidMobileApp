package com.example.activities_lifecyclestate_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    public static final String Item1 = "com.example.android.twoactivities.Item1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    public void launchMainActivity(View view) {
        String item1 = "Cheese";
        Intent replyIntent = new Intent();
        replyIntent.putExtra(Item1, item1);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}