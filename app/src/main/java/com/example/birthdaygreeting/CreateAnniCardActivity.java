package com.example.birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

/* this file will take 2 input (name of the anni person and wish for them) and pass it to next activity -> ChooseanniCardActivity */


public class CreateAnniCardActivity extends AppCompatActivity {
    EditText name;
    List<String> nameList;
    EditText wish;
    List<String> wishList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_anni_card);
        nameList = new ArrayList<>();
        name = findViewById(R.id.nameInput);
        wishList = new ArrayList<>();
        wish = findViewById(R.id.wishInput);
    }

    public void createAnniversaryCard(View view) {
        String str = name.getText().toString();
        String str2 = wish.getText().toString();
        nameList.add(str);
        wishList.add(str2);
        Intent intent = new Intent(getApplicationContext(), ChooseanniCardActivity.class);
        intent.putStringArrayListExtra("key3", (ArrayList<String>) nameList);
        intent.putStringArrayListExtra("key4", (ArrayList<String>) wishList);
        startActivity(intent);
    }
}