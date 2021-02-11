package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * variable for log
     */
    int x =10; //int value
    public static  final String var = MainActivity.class.getSimpleName();

    /**
     * variables for happy birthday
     *
     */

    private TextView greet;
    private String name="Prashant";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * for programming challenge
         */
        greet=findViewById(R.id.Greetings);
        greet.setText("Happy Birthday to " + name);


        /**
         * log is used for debugging purpose
         * value is printed in console- similar to eclipse!!
         */

        //Logcat pane: Debug
        Log.d("MainActivity", "This is message and value stored in variable is:" + x); //only string so concatenate
        Log.d(var,"Checking for log debug x="+x); //have used value stored in variable for tag

        Log.i(var, "Checking for log info"); //Logcat pane: Info, Verbose, Debug
    }
}