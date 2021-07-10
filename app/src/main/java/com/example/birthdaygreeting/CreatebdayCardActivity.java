package com.example.birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/* this file will take 2 input (name of the bday person and wish for them) and pass it to next activity -> ChoosebdayCardActivity */

public class CreatebdayCardActivity extends AppCompatActivity {
    EditText name;
    List<String> nameList;
    EditText wish;
    List<String> wishList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_bday_card);
        nameList = new ArrayList<>();
        name = findViewById(R.id.nameInput);
        wishList = new ArrayList<>();
        wish = findViewById(R.id.wishInput);


    }

    public void createBirthdayCard(View view) {
        String str = name.getText().toString();
        String str2 = wish.getText().toString();
        nameList.add(str);
        wishList.add(str2);

        //if the input is not empty then only it will go to the next activity -> ChoosebdayCardActivity
        if (nameList!=null && wishList!=null){
            Intent intent=new Intent(getApplicationContext(), ChoosebdayCardActivity.class);
            intent.putStringArrayListExtra("key", (ArrayList<String>) nameList);
            intent.putStringArrayListExtra("key2", (ArrayList<String>) wishList);
            startActivity(intent);
        }

        //otherwise it will show the error message
        else {
            Toast.makeText(this,"Please Enter the details",Toast.LENGTH_LONG).show();
        }

    }
}