package com.project.befit;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.befit.R;
import com.google.firebase.auth.FirebaseAuth;

public class GoalsActivity extends AppCompatActivity {
    Button logoutB;
    FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);

        logoutB = findViewById(R.id.buttonLogout);

        logoutB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToMain = new Intent(GoalsActivity.this, MainActivity.class);
                startActivity(intToMain);
            }
        });
    }
}