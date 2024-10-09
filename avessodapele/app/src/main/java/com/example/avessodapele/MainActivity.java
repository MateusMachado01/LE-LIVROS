package com.example.avessodapele;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View btnSinopse4 = findViewById(R.id.btnSinopse4);
        btnSinopse4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sinopse = new Intent(getApplicationContext(),sinopse.class);
                startActivity(sinopse);
            }
        });

        View btnAutor = findViewById(R.id.btnAutor);
        btnAutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent autor = new Intent(getApplicationContext(), autor.class);
                startActivity(autor);
            }
        });

        View btnPersonagens = findViewById(R.id.btnPersonagens);
        btnPersonagens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Personagens = new Intent(getApplicationContext(), Personagens.class);
                startActivity(Personagens);
            }
        });

        View btnTempo = findViewById(R.id.btnTempo);
        btnTempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tempo = new Intent(getApplicationContext(), Tempo.class);
                startActivity(Tempo);
            }
        });
    }
}