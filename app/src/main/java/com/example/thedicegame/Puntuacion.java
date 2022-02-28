package com.example.thedicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Puntuacion extends AppCompatActivity {

    Button jugardenuevo;
    Button salir;

    Bundle datos;
    int tiradass;
    String nTiradas;
    TextView marcador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puntuacion);

        jugardenuevo = (Button) findViewById(R.id.jugarotraves);
        salir = (Button) findViewById(R.id.salirrr);
        marcador = (TextView)findViewById(R.id.Ntiradas);
        datos = getIntent().getExtras();
        tiradass = datos.getInt("tiradas");
        this.nTiradas= String.valueOf(this.tiradass);
        marcador.setText(nTiradas);
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