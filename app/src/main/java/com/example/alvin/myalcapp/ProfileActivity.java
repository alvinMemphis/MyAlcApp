package com.example.alvin.myalcapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

public class ProfileActivity extends AppCompatActivity {
    ImageView imageViewProfile;
    TextView name, track, email, slack, country;
    CardView mCardView;
    LinearLayout mLinearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setUpViews();
    }


    private void setUpViews() {
        imageViewProfile = findViewById(R.id.imageViewProfile);
        name = findViewById(R.id.textViewName);
        track = findViewById(R.id.textViewTrack);
        email = findViewById(R.id.textViewEmail);
        slack = findViewById(R.id.textViewSlack);
        country = findViewById(R.id.textViewCountry);
        mCardView = findViewById(R.id.cardViewProfile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.home) {
            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}

