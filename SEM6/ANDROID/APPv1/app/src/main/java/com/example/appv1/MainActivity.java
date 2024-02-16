package com.example.appv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DataHandler dh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.coal));

        Button login = findViewById(R.id.loginButton);
        TextView sigup = findViewById(R.id.signUp);
        login.setText("Login");

        EditText userName = findViewById(R.id.userName);
        EditText userPassword = findViewById(R.id.userPassword);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name, Password;

                Name = userName.getText().toString();
                Password = userPassword.getText().toString();

                dh = new DataHandler(getApplicationContext());
                Cursor res = dh.Login(Name, Password);

                if(res.moveToFirst()){
                    String test = res.getString(0);
                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                }
            }
        });

        sigup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goSigup = new Intent(MainActivity.this, SignUpPage.class);
                startActivity(goSigup);
            }
        });
    }
}