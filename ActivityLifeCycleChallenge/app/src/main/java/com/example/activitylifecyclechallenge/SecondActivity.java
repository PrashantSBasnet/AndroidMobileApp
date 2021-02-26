package com.example.activitylifecyclechallenge;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    public static final String EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY";

    private String reply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



    }


    //when add button is pressed
    public void returnValue(View view) {
       reply = "Cheese";


       //--trying for multiples
        Button btn_rice = (Button)findViewById(R.id.btn_rice);

        btn_rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reply = "rice";Log.d(LOG_TAG, reply);
            }
        } );
        //---------



            Intent replyIntent = new Intent();
            replyIntent.putExtra(EXTRA_REPLY, reply); //EXTRA_REPLY acts as key
            setResult(RESULT_OK, replyIntent);
            finish();
        }

}