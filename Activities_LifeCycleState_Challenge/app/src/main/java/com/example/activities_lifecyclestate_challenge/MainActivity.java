package com.example.activities_lifecyclestate_challenge;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int TEXT_REQUEST = 1;

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    private TextView textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         textView1 = findViewById(R.id.textView);

        if (savedInstanceState != null){

            Log.d(LOG_TAG, "HELLO");
            textView1.setText(savedInstanceState.getString("Item1"));
            textView1.setVisibility(View.VISIBLE);
        }
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent( this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==TEXT_REQUEST){
            if (resultCode==RESULT_OK){
                String reply= data.getStringExtra(SecondActivity.Item1);
                Log.d(LOG_TAG, ""+reply);
                textView1.setText(reply);
                textView1.setVisibility(View.VISIBLE);
            }
        }
    }
}