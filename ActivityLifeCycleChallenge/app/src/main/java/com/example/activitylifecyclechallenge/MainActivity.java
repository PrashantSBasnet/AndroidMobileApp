package com.example.activitylifecyclechallenge;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;
    private TextView view1;
    private String reply;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view1= findViewById(R.id.value1);
        view1.setText("No Values Added Yet"); //value set when the app launches


    //---------------------------------------------------------------------
        // to save state when device is rotated

        if (savedInstanceState!=null){
            reply = savedInstanceState.getString("key_counter");
            view1.setText(reply);
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("key_counter", reply);
    }
    //---------------------------------------------------------------------


    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent,TEXT_REQUEST);
    }




    /* Handles the data in the return intent from SecondActivity
     * to get the value from SecondActivity
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==TEXT_REQUEST){//Test for the right intent reply
            if (resultCode==RESULT_OK){//Test to make sure the intent reply was good
                reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                Log.d(LOG_TAG,reply);
                view1.setText(reply);
            }
        }

    }
}