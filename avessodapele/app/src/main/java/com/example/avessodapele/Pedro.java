package com.example.avessodapele;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pedro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedro);

        View btnVoltarh3 = findViewById(R.id.btnVoltarh3);
        btnVoltarh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PersonagensActivity = new Intent(getApplicationContext(), Personagens.class);
                startActivity(PersonagensActivity);
            }
        });
    }
}