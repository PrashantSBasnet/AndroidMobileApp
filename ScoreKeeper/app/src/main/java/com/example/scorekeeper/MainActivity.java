package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    /**
     * variables assignment
     */

    private int teamAscore;
    private TextView scoreTeamA;
    private Button btnTeamA3;
    private Button btnTeamA2;
    private Button btnTeamA1;


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


        /**
         * creating listener
         * anonymous listener--object without a name
         */
        btnTeamA3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamAscore=teamAscore+3;
                scoreTeamA.setText(""+teamAscore);
                Toast.makeText(MainActivity.this, "Button is clicked", Toast.LENGTH_SHORT).show();
            }
        }));

        btnTeamA2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamAscore=teamAscore+2;
                scoreTeamA.setText(""+teamAscore);
                Toast.makeText(MainActivity.this, "Button is clicked", Toast.LENGTH_SHORT).show();
            }
        }));

        btnTeamA1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamAscore=teamAscore+1;
                scoreTeamA.setText(""+teamAscore);
                Toast.makeText(MainActivity.this, "Button is clicked", Toast.LENGTH_SHORT).show();
            }
        }));




        /*
        different ways to create listener

        ClickListener listener = new ClickListener();
        btnTeamA3.setOnClickListener(listener);


        //another way
        //when the class implements ClickListener

        btnTeamA3.setOnClickListener(this);
        btnTeamA2.setOnClickListener(this);

        @Override
            public void onClick(View v) {
            if (v.getId()==R.id.btn_score3)
                Toast.makeText(MainActivity.this, "Button 3 is clicked", Toast.LENGTH_SHORT).show();
            else if(v.getId()==R.id.btn_score2)
                Toast.makeText(MainActivity.this, " Button 2 is clicked", Toast.LENGTH_SHORT).show();
            }
       */



        /**
         alternative way to create listener

        class ClassListener implements View.OnClickListener {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button is clicked", Toast.LENGTH_SHORT).show();
            }
        }
         */
    }


    /**
     * when button on click is set on activity_main
     * @param view
     */
    public void button2(View view) {
        Toast.makeText(MainActivity.this, "Button2 is clicked", Toast.LENGTH_SHORT).show();
    }
}