package com.example.birthdaygreeting;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/* this java file is adapter class for ChooseanniCardActivity */

public class Row2 extends RecyclerView.Adapter<Row2.MyViewHolder>{
    private List<String> itemsName;
    private List<String> yourWish;
    int images[];
    Context context;
    public Row2(Context ct, ArrayList<String> nameList, ArrayList<String> wishList, int image[]){
        context = ct;
        itemsName = nameList;
        yourWish = wishList;
        images = image;
    }

    @NonNull
    @Override
    public Row2.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.row2,parent,false);
        return new Row2.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Row2.MyViewHolder holder, int position) {
        holder.setNames(itemsName.get(0));
        holder.setWishes(yourWish.get(0));
        holder.imageView.setImageResource(images[position]);
        holder.likebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Image Liked", Toast.LENGTH_LONG).show();

            }
        });
        holder.sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,yourWish.get(0));
                context.startActivity(intent.createChooser(intent,"Share using: "));
            }
        });

    }

    @Override
    public int getItemCount()
    {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView,textView2;
        ImageView imageView;
        public Button likebtn,sharebtn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView= itemView.findViewById(R.id.textView);
            textView2= itemView.findViewById(R.id.textView2);
            imageView= itemView.findViewById(R.id.imageView);
            likebtn= itemView.findViewById(R.id.likebtn);
            sharebtn= itemView.findViewById(R.id.sharebtn);

        }

        public void setNames(CharSequence name) {
            textView.setText(name);
        }

        public void setWishes(CharSequence wish) {
            textView2.setText(wish);
        }
    }
}
