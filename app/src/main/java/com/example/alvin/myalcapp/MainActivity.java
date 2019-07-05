package com.example.alvin.myalcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button profileButton,alcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profileButton=findViewById(R.id.buttonProfile);
        profileButton.setOnClickListener(this);
        alcButton=findViewById(R.id.buttonAbout);
        alcButton.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        if (v==profileButton){
            startActivity(new Intent(getApplicationContext(),ProfileActivity.class));

        }
        else if (v==alcButton){
            startActivity(new Intent(getApplicationContext(),AlcAboutActivity.class));
        }

    }
}
