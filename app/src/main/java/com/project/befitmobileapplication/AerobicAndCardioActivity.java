package com.project.befitmobileapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.befit.R;

public class AerobicAndCardioActivity extends AppCompatActivity {

    Button workout1;
    TextView logoutTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aerobic_and_cardio);

        workout1 = findViewById(R.id.buttonAerobicAndCardioWorkout1);
        logoutTV = findViewById(R.id.textViewLogout);

        workout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AerobicAndCardioActivity.this, AerobicAndCardioWorkoutActivity1.class);
                startActivity(i);
            }
        });

        logoutTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AerobicAndCardioActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}