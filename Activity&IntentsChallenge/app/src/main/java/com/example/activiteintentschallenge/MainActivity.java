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


        intent.putExtra("second", "SECOND SECOND SECOND SECOND SECOND SECOND" +
                "CLICKED CLICKED CLICKED CLICKED " +
                "SECOND --------SECOND---------- SECOND--------- "
                +
                "CLICKED CLICKED CLICKED CLICKED " +
                "SECOND --------SECOND---------- SECOND--------- "
                +
                "CLICKED CLICKED CLICKED CLICKED " +
                "SECOND --------SECOND---------- SECOND--------- "
                +
                "CLICKED CLICKED CLICKED CLICKED " +
                "SECOND --------SECOND---------- SECOND--------- "
                +
                "CLICKED CLICKED CLICKED CLICKED " +
                "SECOND --------SECOND---------- SECOND--------- "
                +
                "CLICKED CLICKED CLICKED CLICKED " +
                "SECOND --------SECOND---------- SECOND--------- "+
                "CLICKED CLICKED CLICKED CLICKED " +
                        "SECOND --------SECOND---------- SECOND--------- "
                +
                "CLICKED CLICKED CLICKED CLICKED " +
                "SECOND --------SECOND---------- SECOND--------- "+
                "CLICKED CLICKED CLICKED CLICKED " +
                "SECOND --------SECOND---------- SECOND--------- "
                +
                "CLICKED CLICKED CLICKED CLICKED " +
                "SECOND --------SECOND---------- SECOND--------- "+
                "CLICKED CLICKED CLICKED CLICKED " +
                "SECOND --------SECOND---------- SECOND--------- ");

        startActivity(intent);

    }


    public void launchFirstActivity(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("first", "FIRST  FIRST FIRST FIRST FIRST  FIRST  FIRST"  +
                "CLICKED CLICKED CLICKED CLICKED  " +
                "CLICKED CLICKED CLICKED CLICKED  " +
                "FIRST ------ FIRST ---- FIRST --- FIRST"+
                "FIRST  FIRST FIRST FIRST FIRST  FIRST  FIRST"  +
                "CLICKED CLICKED CLICKED CLICKED  " +
                "CLICKED CLICKED CLICKED CLICKED  " +
                "FIRST ------ FIRST ---- FIRST --- FIRST"+
                "FIRST  FIRST FIRST FIRST FIRST  FIRST  FIRST"  +
                "CLICKED CLICKED CLICKED CLICKED  " +
                "CLICKED CLICKED CLICKED CLICKED  " +
                "FIRST ------ FIRST ---- FIRST --- FIRST"+
                "FIRST  FIRST FIRST FIRST FIRST  FIRST  FIRST"  +
                "CLICKED CLICKED CLICKED CLICKED  " +
                "CLICKED CLICKED CLICKED CLICKED  " +
                "FIRST ------ FIRST ---- FIRST --- FIRST"+"FIRST ------ FIRST ---- FIRST --- FIRST"+
                "FIRST  FIRST FIRST FIRST FIRST  FIRST  FIRST"  +
                "CLICKED CLICKED CLICKED CLICKED  " +
                "CLICKED CLICKED CLICKED CLICKED  " +
                "FIRST ------ FIRST ---- FIRST --- FIRST"+
                "FIRST  FIRST FIRST FIRST FIRST  FIRST  FIRST"  +
                "CLICKED CLICKED CLICKED CLICKED  " +
                "CLICKED CLICKED CLICKED CLICKED  " +
                "FIRST ------ FIRST ---- FIRST --- FIRST"
        );
        startActivity(intent);

    }


    public void launchThirdActivity(View view) {

        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("second", "THIRD ----- THIRD ----- THIRD ------ THIRD ------"+
                        "CLICKED CLICKED CLICKED CLICKED  " +
                        "THIRD ----- THIRD ----- THIRD ------ THIRD ------"+
                        "THIRD ----- THIRD ----- THIRD ------ THIRD ------"+
                        "CLICKED CLICKED CLICKED CLICKED  " +
                        "THIRD ----- THIRD ----- THIRD ------ THIRD ------"+
                        "THIRD ----- THIRD ----- THIRD ------ THIRD ------"+
                        "CLICKED CLICKED CLICKED CLICKED  " +
                        "THIRD ----- THIRD ----- THIRD ------ THIRD ------"+
                        "THIRD ----- THIRD ----- THIRD ------ THIRD ------"+
                        "CLICKED CLICKED CLICKED CLICKED  " +
                        "THIRD ----- THIRD ----- THIRD ------ THIRD ------"+
                        "THIRD ----- THIRD ----- THIRD ------ THIRD ------"+
                        "CLICKED CLICKED CLICKED CLICKED  " +
                        "THIRD ----- THIRD ----- THIRD ------ THIRD ------"+
                        "THIRD ----- THIRD ----- THIRD ------ THIRD ------"+
                        "CLICKED CLICKED CLICKED CLICKED  " +
                        "THIRD ----- THIRD ----- THIRD ------ THIRD ------"
                     );
        startActivity(intent);

    }
}
