package com.example.avessodapele;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tempo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo);

        View btnVoltar4 = findViewById(R.id.btnVoltar4);
        btnVoltar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(MainActivity);
            }
        });

        View btnPele = findViewById(R.id.btnPele);
        btnPele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ApeleActivity = new Intent(getApplicationContext(), Apele.class);
                startActivity(ApeleActivity);
            }
        });
        View btnOavesso = findViewById(R.id.btnOavesso);
        btnOavesso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent OavessoActivity = new Intent(getApplicationContext(), Oavesso.class);
                startActivity(OavessoActivity);

            }
        });
        View btnVolta = findViewById(R.id.btnVolta);
        btnVolta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DevoltaActivity = new Intent(getApplicationContext(), Devolta.class);
                startActivity(DevoltaActivity);

            }
        });
        View btnBarca = findViewById(R.id.btnBarca);
        btnBarca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AbarcaActivity = new Intent(getApplicationContext(), Abarca.class);
                startActivity(AbarcaActivity);

            }
        });
    }
}