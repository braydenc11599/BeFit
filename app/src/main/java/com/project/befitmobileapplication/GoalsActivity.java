package com.project.befitmobileapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.example.befit.R;

public class GoalsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button okB;
    TextView logoutTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);

        Spinner spinner1 = findViewById(R.id.sexSpinner);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.sex_array, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(this);

        Spinner spinner2 = findViewById(R.id.activityLevelSpinner);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.activityLevel_array, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);

        logoutTV = findViewById(R.id.textViewLogout);
        okB = findViewById(R.id.buttonOk);

        logoutTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToMain = new Intent(GoalsActivity.this, MainActivity.class);
                startActivity(intToMain);
            }
        });

        okB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToWorkouts = new Intent(GoalsActivity.this, WorkoutCategoriesActivity.class);
                startActivity(intToWorkouts);
            }
        });
    }
        @Override
        public void onItemSelected (AdapterView < ? > parent, View view,int position, long id){
            String text = parent.getItemAtPosition(position).toString();
            Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected (AdapterView < ? > parent){
            Toast.makeText(GoalsActivity.this, "Something Went Wrong, Please Select An Item From The List", Toast.LENGTH_SHORT).show();
        }
    }