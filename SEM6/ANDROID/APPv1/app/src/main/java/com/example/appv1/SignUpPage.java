package com.example.appv1;

import android.app.Activity;
import android.content.Intent;
import android.database.DatabaseErrorHandler;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpPage extends Activity {
    DataHandler dh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_page);


        Button signIn = findViewById(R.id.siginButton);
        EditText userName = findViewById(R.id.sigupName);
        EditText userMail = findViewById(R.id.sigupEmail);
        EditText userContact = findViewById(R.id.sigupContact);
        EditText userPassword = findViewById(R.id.signupPassword);
        EditText pass2 = findViewById(R.id.signupConfirmPassword);


        signIn.setText("Sign Up");

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name, Mail, Contact, Password;
                Name = userName.getText().toString();
                Mail = userMail.getText().toString();
                Contact = userContact.getText().toString();
                Password = userPassword.getText().toString();

                if(userPassword.getText().toString().equals(pass2.getText().toString())){
                    dh = new DataHandler(getApplicationContext());
                    boolean res = dh.addData(Name, Password, Mail, Contact);
                    Log.d("res", ""+res);
                    if (res){
                        Intent goHome = new Intent(SignUpPage.this, HomePage.class);
                        goHome.putExtra("userName", userName.getText().toString());
                        startActivity(goHome);
                        Toast.makeText(SignUpPage.this, "Welcome " + userName.getText().toString(), Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(SignUpPage.this, "Sign in Failed", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(SignUpPage.this, "Pasword does not Match.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
