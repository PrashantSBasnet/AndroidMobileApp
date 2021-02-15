package com.example.helloconstaint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        Button btn_toasting = findViewById(R.id.button_toast);
        btn_toasting.setBackgroundColor(Color.GREEN);


    }

    /**
     * action listener whenever button Count is pressed
     * @param view
     */
    public void countUp(View view) {
        myCount++;
        mShowCount.setText(""+myCount);

        Button btn_counting = findViewById(R.id.button_zero);


        if (myCount%2!=0)
        {
            btn_counting.setBackgroundColor(Color.YELLOW);
        }

        else
        {
            btn_counting.setBackgroundColor(Color.RED);
        }



        Button btn_hello=findViewById(R.id.button_counting);
        btn_hello.setBackgroundColor(Color.YELLOW);
    }


    /**]
     * when zero is pressed
     * @param view
     */
    public void clearUp(View view){
        myCount=0;
        mShowCount.setText(""+myCount);
        Button btn_zero = findViewById(R.id.button_zero);
        btn_zero.setBackgroundColor(Color.GRAY);

    }
}