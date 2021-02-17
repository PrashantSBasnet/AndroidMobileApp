package com.example.scorekeeper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    /**
     * variables assignment
     */

    public static final String TAG= MainActivity.class.getName();
    private int teamAscore;
    private TextView scoreTeamA,scoreTeamB;
    private Button btnTeamA3,btnTeamB3;
    private Button btnTeamA2,btnTeamB2;
    private Button btnTeamA1,btnTeamB1;
    private Button btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /**
         * setting buttons via xml
         * R represents res folder
         * internally each folder is converted into class
         */

        scoreTeamA = findViewById(R.id.scoreteamA);
        btnTeamA3 = findViewById(R.id.score3);
        btnTeamA2 = findViewById((R.id.score2));
        btnTeamA1 = findViewById((R.id.score1));

        scoreTeamB = findViewById(R.id.scoreteamB);
        btnTeamB3 = findViewById(R.id.score3B);
        btnTeamB2 = findViewById((R.id.score2B));
        btnTeamB1 = findViewById((R.id.score1B));

        btnReset = findViewById(R.id.btn_reset);

        /**
         * to check Bundle. It is not null when the screen rotates
         */
        if (savedInstanceState == null)
        {
            Log.d(TAG, "savedInstanceState is  null");
            Log.d(TAG, "value"+ teamAscore);
        }

        /**
         * when screen is rotated
         */
        if (savedInstanceState != null)
        {
            Log.d(TAG, "savedInstanceState is not null");



            //To do
            //call method that displays score


            teamAscore = savedInstanceState.getInt("score");
            Log.d(TAG,"value"+teamAscore);


            scoreTeamA.setText(Integer.toString(teamAscore));





        }






        /**
         * creating listener
         * anonymous listener--object without a name
         */
        btnTeamA3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamAscore=teamAscore+3;
                scoreTeamA.setText(""+teamAscore);
            }
        }));

        btnTeamA2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamAscore=teamAscore+2;
                scoreTeamA.setText(""+teamAscore);
            }
        }));

        btnTeamA1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamAscore=teamAscore+1;
                scoreTeamA.setText(""+teamAscore);
            }
        }));
    }




    public void button2(View view) {
        Toast.makeText(MainActivity.this, "Button2 is clicked", Toast.LENGTH_SHORT).show();
    }



    /**
     * to test Activity LifeCycle
     * Overridden by Control+O
     */

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState");
        outState.putInt("score", teamAscore);

    }
}