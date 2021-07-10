package com.example.birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

/* this java file uses the Row Adapter and recyclerView*/
public class ChoosebdayCardActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1;
    int image[]={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bday_choose_card);
        ArrayList<String> nameList = getIntent().getStringArrayListExtra("key");
        ArrayList<String> wishList = getIntent().getStringArrayListExtra("key2");
        recyclerView=findViewById(R.id.recycle);
        Row adaptor=new Row(this,nameList,wishList,image);
        recyclerView.setAdapter(adaptor);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}