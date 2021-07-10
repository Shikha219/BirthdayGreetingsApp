package com.example.birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
 this project is about creating a greeting card for birthday and anniversary with their names and your wishes for them
 and you can share it to them using another apps like whatsapp, messages etc.
 this project contains Regex codes,recyclerview,adapter class,Layouts(constraint layout,Linear layout,Relative Layout),cardView
 and both explicit and implicit intent.This app has its own custom launcher icon.*/


// this java file contains the front page of the app which has only one button which goes to LoginActivity


public class MainActivity extends AppCompatActivity {
    Button start_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start_button = findViewById(R.id.start);

        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });

    }
}
