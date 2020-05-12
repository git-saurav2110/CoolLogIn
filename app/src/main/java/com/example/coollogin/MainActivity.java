package com.example.coollogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText email,password;
    Button login;
    TextView DoNotRememberPasssword,facebook_login,DoNotHAveAccount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        email=(EditText) findViewById(R.id.user_name);
        password=(EditText) findViewById(R.id.password);
        login=(Button) findViewById(R.id.login);
        DoNotRememberPasssword=(TextView) findViewById(R.id.forgot_password);
        facebook_login=(TextView) findViewById(R.id.facebook_login);
        DoNotHAveAccount=(TextView) findViewById(R.id.sign_up);

        DoNotHAveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,signUp.class);
                startActivity(i);
            }
        });


    }
}
