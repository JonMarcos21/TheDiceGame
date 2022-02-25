package com.example.thedicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Juego extends AppCompatActivity {


    private TextView numero;
    private Button lanzar;
    int dado1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juego);

        numero = (TextView) findViewById(R.id.TxtPuntuacion);
    }
}