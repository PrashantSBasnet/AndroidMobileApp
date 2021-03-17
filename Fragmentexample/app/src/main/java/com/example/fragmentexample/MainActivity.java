package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private int toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = null;

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggle==0){
                    toggle =1;
                }
                else {
                    toggle = 0;
                }
                setupFragment(toggle);
        });

            setupFragment (toggle);

    }

    private void setupFragment(int toggle) {
        FragmentManager fm = getSupportFragmentManager();
        if (fragment==null){
            Fragment1 frag = new Fragment1();
            fm.beginTransaction().replace(R.id.fragment_container1,frag)
                    .commit();
        }

        else {
            Fragment2 frag = new Fragment2();
            fm.beginTransaction().replace(R.id.contaniner_1,frag).commit();
        }
        }



