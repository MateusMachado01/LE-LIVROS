package com.example.avessodapele;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Personagens extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagens);

        View btnVoltar3 = findViewById(R.id.btnVoltar4);
        btnVoltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(MainActivity);
            }
        });
        View btnHenrique = findViewById(R.id.btnHenrique);
        btnHenrique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HenriqueActivity = new Intent(getApplicationContext(), Henrique.class);
                startActivity(HenriqueActivity);

            }
        });
        View btnMarta = findViewById(R.id.btnMarta);
        btnMarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MartaActivity = new Intent(getApplicationContext(), Marta.class);
                startActivity(MartaActivity);

            }
        });
        View btnPedro = findViewById(R.id.btnPedro);
        btnPedro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PedroActivity = new Intent(getApplicationContext(), Pedro.class);
                startActivity(PedroActivity);

            }
        });
    }
}