package com.example.helloconstraint;

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
    private int myCount = 0;
    private TextView mShowCount; //to get reference to the TextView having scores


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clearUp(View view) {
        myCount = 0;
        mShowCount = findViewById(R.id.show_count);
        mShowCount.setText("" + myCount);
        Button btn_zero = findViewById(R.id.button_zero);
        btn_zero.setBackgroundColor(Color.GRAY);
        Button btn_count = findViewById(R.id.button_count);
        btn_count.setBackgroundColor(Color.BLUE);
    }


    public void countUp(View view) {
        myCount++;
        mShowCount = findViewById(R.id.show_count);
        Button btn_count = findViewById(R.id.button_count);
        btn_count.setBackgroundColor(Color.RED);
        Button btn_zero = findViewById(R.id.button_zero);

        mShowCount.setText("" + myCount);

        if (myCount % 2 != 0) {
            btn_zero.setBackgroundColor(Color.YELLOW);
            btn_zero.setTextColor(Color.BLACK);
        }
        if (myCount % 2 == 0) {
            btn_zero.setBackgroundColor(Color.GREEN);
        }
    }

    public void toastUp(View view) {
        Button btn_toast = findViewById(R.id.button_toast);
        btn_toast.setBackgroundColor(Color.BLACK);
        btn_toast.setTextColor(Color.WHITE);

        Toast toast = Toast.makeText(this, "Hello Toast",Toast.LENGTH_SHORT);
        toast.show();


    }
}