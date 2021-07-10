package com.example.birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/* this java file contains two button one going to CreatebdayCardActivity and another for going to CreateammiCardActivity */

public class SelectOcassion extends AppCompatActivity {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_occasion);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);


        //Birthday Button  ->  CreatebdayCardActivity

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectOcassion.this, CreatebdayCardActivity.class);
                startActivity(intent);
            }
        });


        //Anniversary Button  ->  CreateAnniCardActivity

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectOcassion.this, CreateAnniCardActivity.class);
                startActivity(intent);
            }
        });
    }
}