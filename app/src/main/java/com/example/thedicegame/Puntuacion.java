package com.example.thedicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Puntuacion extends AppCompatActivity {

    Button jugardenuevo;
    Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puntuacion);

        jugardenuevo = (Button) findViewById(R.id.jugarotraves);
        salir = (Button) findViewById(R.id.salirrr);
    }

    public void play(View view){

        Intent play = new Intent(this, Juego.class);
        startActivity(play);
        finish();

    }
    public void salir(View view){

        Intent salir = new Intent(this, Registro.class);
        startActivity(salir);
        finish();

    }

}