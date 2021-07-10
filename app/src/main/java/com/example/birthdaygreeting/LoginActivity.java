package com.example.birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

/* Login page using Regex code it contains one button which goes to SelectOccasion page */

public class LoginActivity extends AppCompatActivity {
    Button btn;
    EditText email,password;
    TextView detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.email_login);
        password = findViewById(R.id.password_login);
        btn = findViewById(R.id.login_button);
        detail = findViewById(R.id.details);

        //Login Button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uemail = email.getText().toString();
                String fpwd = password.getText().toString();
                String msg = "Please provide vaid details";
                detail = findViewById(R.id.details);
                if (vemail(uemail) & vpass(fpwd)){
                    Toast.makeText(LoginActivity.this,"Successfully Registered", Toast.LENGTH_LONG).show();
                    reseterror();
                }else{
                    seterror(msg);
                }

            }
        });
    }


    //Regex Code
    private  boolean vemail(String uemail){
        return check("^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$", uemail);
    }
    private  boolean vpass(String fpwd){
        return check("^[a-zA-Z]\\w{3,14}$", fpwd);
    }

    private  void seterror(String msg){
        detail.setVisibility((View.VISIBLE));
        detail.setText(msg);
    }
    private void reseterror(){
        detail.setVisibility(View.INVISIBLE);
        detail.setText("");
        Intent intent=new Intent(LoginActivity.this, SelectOcassion.class);
        startActivity(intent);
    }
    private  boolean check(String pattern, String uinput){
        Pattern r = Pattern.compile(pattern);
        return  r.matcher(uinput).matches();
    }
}