package com.project.befit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.befit.R;

public class WorkoutCategoriesActivity extends AppCompatActivity {

    Button strTrainingB;
    Button crossfitB;
    Button aerobicAndCardioB;
    Button yogaAndPilatesB;
    Button stretchingAndBalanceB;
    TextView logoutTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_categories);

        strTrainingB = findViewById(R.id.buttonStrength);
        crossfitB = findViewById(R.id.buttonCrossfit);
        aerobicAndCardioB = findViewById(R.id.buttonAerobic);
        yogaAndPilatesB = findViewById(R.id.buttonYoga);
        stretchingAndBalanceB = findViewById(R.id.buttonStretching);
        logoutTV = findViewById(R.id.textViewLogout);

        strTrainingB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WorkoutCategoriesActivity.this, WeightTrainingActivity.class);
                startActivity(i);
            }
        });

        crossfitB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WorkoutCategoriesActivity.this, HIITAndCrossfitActivity.class);
                startActivity(i);
            }
        });

        aerobicAndCardioB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WorkoutCategoriesActivity.this, AerobicAndCardioActivity.class);
                startActivity(i);
            }
        });

        yogaAndPilatesB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WorkoutCategoriesActivity.this, YogaAndPilatesActivity.class);
                startActivity(i);
            }
        });

        stretchingAndBalanceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WorkoutCategoriesActivity.this, StretchingAndBalanceActivity.class);
                startActivity(i);
            }
        });

        logoutTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WorkoutCategoriesActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}