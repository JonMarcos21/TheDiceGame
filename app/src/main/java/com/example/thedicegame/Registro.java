package com.example.thedicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {

    Button formulario;
    Button inicio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        formulario=(Button) findViewById(R.id.registrarse);
        inicio =(Button) findViewById(R.id.acceso);
    }

    public void registro(View view){

        Intent registro = new Intent(this, Formulario.class);
        startActivity(registro);
        finish();

    }
    public void inicio(View view){

        Intent inicio = new Intent(this, Inicio.class);
        startActivity(inicio);
        finish();

    }
}