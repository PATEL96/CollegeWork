package com.example.appv1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import org.w3c.dom.Text;

public class HomePage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        Button b1 = findViewById(R.id.button);
        Button b2 = findViewById(R.id.button2);

        getWindow().setStatusBarColor(ContextCompat.getColor(HomePage.this, R.color.coal));

        TextView userName = findViewById(R.id.userNameText);

        Intent get1 = getIntent();
        String Name = get1.getStringExtra("userName");

        userName.setText(Name);
    }
}