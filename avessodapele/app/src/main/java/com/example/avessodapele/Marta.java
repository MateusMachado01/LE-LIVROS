package com.example.avessodapele;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Marta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marta);

        View btnVoltarh2 = findViewById(R.id.btnVoltarh2);
        btnVoltarh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PersonagensActivity = new Intent(getApplicationContext(), Personagens.class);
                startActivity(PersonagensActivity);
            }
        });
    }
}