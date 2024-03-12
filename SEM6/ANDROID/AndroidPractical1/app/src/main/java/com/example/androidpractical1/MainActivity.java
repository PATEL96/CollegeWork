package com.example.androidpractical1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("DidWhat", "Created");

        Button btn = findViewById(R.id.button1);
        TextView enroll = findViewById(R.id.Enrollment);

        btn.setText("Click me");
        enroll.setText("202103103510081");


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked Button", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("DidWhat", "Paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DidWhat", "Resumed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("DidWhat", "Destroyed");
    }
}
