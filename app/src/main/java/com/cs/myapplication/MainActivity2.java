package com.cs.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView fname;
    private TextView lname;
    private TextView  phone;
    private TextView email;
    private TextView  bd;
    private TextView gender;

    private TextView country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fname=findViewById(R.id.firstName2);
        lname=findViewById(R.id.lastN);
        email=findViewById(R.id.email2);
        phone=findViewById(R.id.phone2);
        bd=findViewById(R.id.birthD2);
        gender=findViewById(R.id.gender2);
        country=findViewById(R.id.country2);

        Intent n= getIntent();

        fname.setText("amal");
        lname.setText(n.getStringExtra("lname"));
        email.setText(n.getStringExtra("email"));
        phone.setText(n.getStringExtra("phone"));
        bd.setText(n.getStringExtra("date"));
        gender.setText(n.getStringExtra("gender"));
        country.setText(n.getStringExtra("country"));

    }
}