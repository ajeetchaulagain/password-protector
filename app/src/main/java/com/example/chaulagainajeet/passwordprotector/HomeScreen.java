package com.example.chaulagainajeet.passwordprotector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
    private Button nextToFingerPrintScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        nextToFingerPrintScreen = findViewById(R.id.next_to_fingerprint);

        final Intent  intentTosSecondStep = new Intent(this, FingerPrint.class);

        nextToFingerPrintScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intentTosSecondStep);

            }
        });


    }private Button nextToFingerPrintScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        nextToFingerPrintScreen = findViewById(R.id.next_to_fingerprint);

        final Intent  intentTosSecondStep = new Intent(this, FingerPrint.class);

        nextToFingerPrintScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intentTosSecondStep);

            }
        });


    }
}
