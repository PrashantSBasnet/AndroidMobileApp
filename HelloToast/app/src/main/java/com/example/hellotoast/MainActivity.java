package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * variable declaration
     */
    private int myCount=0;
    private TextView mShowCount; //to get reference to the TextView having scores




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount= findViewById(R.id.show_count);

    }

    /**
     * android:onClick("") in activity_main.xml auto generates the following methods
     * @param view
     */

    public void showToast(View view) {

        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();

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