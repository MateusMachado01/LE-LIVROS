package com.example.avessodapele;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Oavesso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oavesso);
        View btnAvessoVoltar = findViewById(R.id.btnAvessoVoltar);
        btnAvessoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TempoActivity = new Intent(getApplicationContext(),Tempo.class);
                startActivity(TempoActivity);
            }
        });
    }
}