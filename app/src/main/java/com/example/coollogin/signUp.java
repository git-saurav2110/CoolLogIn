package com.example.coollogin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class signUp extends AppCompatActivity {
    EditText DateOfBirth;
    DatePickerDialog.OnDateSetListener setListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        DateOfBirth=(EditText) findViewById(R.id.date_of_birth);

        Calendar calendar=Calendar.getInstance();
        final int year=calendar.get(Calendar.YEAR);
        final int month=calendar.get(Calendar.MONTH);
        final int day=calendar.get(Calendar.DAY_OF_MONTH);



        setListener= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month=month+1;
                String Date=day+"/"+month+"/"+year;
                DateOfBirth.setText(Date);
            }
        };
        DateOfBirth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               DatePickerDialog datePickerDialog=new DatePickerDialog(signUp.this, new DatePickerDialog.OnDateSetListener() {
                   @Override
                   public void onDateSet(DatePicker view, int year, int month, int day) {
                       month=month+1;
                       String Date=day+"/"+month+"/"+year;
                       DateOfBirth.setText(Date);

                   }
               },year,month,day);
               datePickerDialog.show();


            }
        });



    }
}
