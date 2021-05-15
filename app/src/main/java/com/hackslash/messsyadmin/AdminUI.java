package com.hackslash.messsyadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminUI extends AppCompatActivity {
    Button login , addImage , register, visibility;
    EditText name , emailAdd , mobileNumber  , password;
    String  sName , sEmail , sMobile , sHostelName, sPassword , data;
    Boolean hasVisible = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_u_i);

        Intent intent = getIntent();

        login = (Button) findViewById(R.id.login);
        addImage = (Button) findViewById(R.id.addImage);
        register = (Button) findViewById(R.id.register);
        visibility = (Button) findViewById(R.id.visibility);
        name = (EditText) findViewById(R.id.name);
        emailAdd = (EditText) findViewById(R.id.EmailAddress);
        mobileNumber = (EditText) findViewById(R.id.mobilenumber);
        password = (EditText) findViewById(R.id.Password);



        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sName = name.getText().toString();
                sEmail = emailAdd.getText().toString();
                sMobile = mobileNumber.getText().toString();
                sPassword = password.getText().toString();
                data = "Name: " + sName + "\nEmail: " + sEmail + "\nMobile No: " + sMobile + "\nPassword: " +sPassword;
                Toast.makeText(AdminUI.this,data, Toast.LENGTH_SHORT).show();
            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        visibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hasVisible){
                    password.setTransformationMethod(new PasswordTransformationMethod());
                    hasVisible = false ;
                }
                else{
                    password.setTransformationMethod(null);
                    hasVisible = true;

                }
            }
        });

        addImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AdminUI.this, "Adding Image", Toast.LENGTH_SHORT).show();
            }
        });


    }
}