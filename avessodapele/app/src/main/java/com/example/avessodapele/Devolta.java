package com.example.avessodapele;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Devolta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devolta);
        View btnSaoPetVoltar = findViewById(R.id.btnSaoPetVoltar);
        btnSaoPetVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  TempoActivity = new Intent(getApplicationContext(), Tempo.class);
                startActivity(TempoActivity);
            }
        });
    }
}