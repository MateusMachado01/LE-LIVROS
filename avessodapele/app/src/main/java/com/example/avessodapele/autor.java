package com.example.avessodapele;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class autor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autor);

        View btnVoltar2 = findViewById(R.id.btnVoltar2);
        btnVoltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(MainActivity);
            }
        });
    }
}