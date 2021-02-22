package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * variable declaration
     */
    private int myCount=0;
    private TextView mShowCount; //to get reference to the TextView having scores

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount= findViewById(R.id.show_count);

    }


     /** android:onClick("") in activity_main.xml auto generates the following methods
     * @param view
     */


    public void showToast(View view) {

        /**
         * Initial Hello Toast Program
         */

        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
        Log.d(LOG_TAG, "Button is clicked");

        /**
         * coding of Activites and Intents
         */

        Intent intent = new Intent(this, SecondActivity.class);
        String message = "Hello"+ "\n"+ "    "+ myCount;
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);



    }

    /**
     * action listener whenever button Count is pressed
     * @param view
     */
    public void countUp(View view) {
        myCount++;
        mShowCount.setText(""+myCount);
    }



}