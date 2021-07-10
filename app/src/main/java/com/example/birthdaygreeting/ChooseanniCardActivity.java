package com.example.birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

/* this java file uses the Row2 Adapter and recyclerView*/


public class ChooseanniCardActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1;
    int image[]={R.drawable.annithree,R.drawable.annitwo,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.annisix,R.drawable.seven,R.drawable.annieight,R.drawable.nine,R.drawable.annione};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseanni_card);
        ArrayList<String> nameList = getIntent().getStringArrayListExtra("key3");
        ArrayList<String> wishList = getIntent().getStringArrayListExtra("key4");
        recyclerView=findViewById(R.id.recycle2);
        Row2 adapter=new Row2(this,nameList,wishList,image);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}