package com.example.surbhibhatnagar.apptimize_login_demo.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.surbhibhatnagar.apptimize_login_demo.R;

/**
 * Created by surbhibhatnagar on 6/9/17.
 */

public class UsersActivity extends AppCompatActivity{
    private TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        textViewName = (TextView) findViewById(R.id.text1);
        String nameFromIntent = getIntent().getStringExtra("EMAIL");
        textViewName.setText("Welcome " + nameFromIntent);
    }
}
