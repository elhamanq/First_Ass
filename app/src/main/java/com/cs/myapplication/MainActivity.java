package com.cs.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private EditText fname;
    private EditText lname;
    private EditText  phone;
    private EditText email;
    private EditText  bd;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname= findViewById(R.id.person_name);
        lname=findViewById(R.id.lastName);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        bd=findViewById(R.id.birthD);

        radioGroup=findViewById(R.id.radioG);
        spinner=findViewById(R.id.spinner2);
        countrySpinner();
    }

    private void countrySpinner() {

        ArrayList<String> country = new ArrayList<>();
        country.add(0,"Country");
        country.add(1,"Brazil");
        country.add(2,"Palestine");
        country.add(3,"Bulgaria");
        country.add(4,"Jordan");
        country.add(5,"Canada");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, country);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }



    public void getData(View view) {
        int selectedId = radioGroup.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        radioButton = (RadioButton) findViewById(selectedId);




        Intent n= new Intent( this,MainActivity2.class);
        n.putExtra("fname",fname.getText().toString());
        n.putExtra("lname",lname.getText().toString());
        n.putExtra("email",email.getText().toString());

        n.putExtra("phone",phone.getText().toString());
        n.putExtra("date",bd.getText().toString());
        n.putExtra("gender",radioButton.getText().toString());
        n.putExtra("country",spinner.getSelectedItem().toString());



        startActivity(n);


    }
}