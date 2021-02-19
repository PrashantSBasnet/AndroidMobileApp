package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    /**
     * defining key for the Intent extra
     * public constant
     */
    public static final String EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY";

    /**
     * holds EditText
     */
    private EditText mReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        /**
         * reference to the EditText in SecondActivity
         */

        mReply = findViewById(R.id.editText_second);

        /**
         * coding of Intent
         */

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


        TextView textView = findViewById(R.id.text_message);

        textView.setText(message);

    }

    /**
     * for the response
     * @param view
     */

    public void returnReply(View view) {

        String reply = mReply.getText().toString();

        /**
         * new intent object for reply
         */

        Intent replyIntent = new Intent();

        /**
         * key value pairs
         * key=EXTRA_REPLY
         * value=reply
         */
        replyIntent.putExtra(EXTRA_REPLY, reply);

        /**
         * for success response
         */
        setResult(RESULT_OK,replyIntent);

        /**
         * closes the activity
         */
        finish();




    }
}