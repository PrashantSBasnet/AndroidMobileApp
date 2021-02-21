package com.example.activiteintentschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {

        Intent intent = new Intent(MainActivity.this,SecondActivity.class);


        intent.putExtra("second", "Android supports explicit and implicit intents. " +
                "An application can define the target component directly in the intent (explicit intent) or ask the " +
                "Android system to evaluate registered components based on the intent data(implicit intents).");



        startActivity(intent);


    }


    public void launchFirstActivity(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("first", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in " +
                "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat " +
                "cupidatat non " +
                "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        startActivity(intent);

    }


    public void launchThirdActivity(View view) {

        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("second", "Challenge: Create an app with three Button elements labeled Text One, Text Two, and " +
                        "Text Three. When any of these Button elements are clicked, launch a second Activity. That second Activity should " +
                        "contain a ScrollView that displays one of three text passages (you can include your choice of passages)." +
                        " Use an Intent to launch the second Activity with extras to indicate which of the three passages to display.");
        startActivity(intent);


    }
}
