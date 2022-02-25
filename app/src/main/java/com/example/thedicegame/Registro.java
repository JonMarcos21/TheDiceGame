package com.example.thedicegame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Registro extends AppCompatActivity {

    // creacion de variables para añadir datos
    Button formulario;
    Button inicio;
    Button play;

    private EditText contraseña1;
    private EditText correo1;

    private String textUsuario = "";
    private String textContraseña = "";

    private FirebaseAuth mAuth;


    //conecto las variables con el xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        inicio =(Button) findViewById(R.id.acceso);

        contraseña1 = (EditText) findViewById(R.id.Contraseña);
        correo1 = (EditText) findViewById(R.id.Usuario);
        mAuth=FirebaseAuth.getInstance();

        play = (Button)findViewById(R.id.btnPlay);
        play.setEnabled(false);
        play.setTextColor(Color.parseColor("#9E9E9E"));


      /*  inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario = correo.getText().toString();
                mcontraseña = contraseña.getText().toString();

                if(!usuario.isEmpty() && !mcontraseña.isEmpty()){

                    loginuser();
                }
                else{
                    Toast.makeText(Registro.this, "Completa los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });*/

    }

    //creo un metodo para el boton de login que en caso de que esten los campos bien pasara de pantalla
    public void acceso(View view) {

        textUsuario = correo1.getText().toString();
        textContraseña = contraseña1.getText().toString();

        if(!textUsuario.isEmpty() && !textContraseña.isEmpty()){

            loginuser();
        }
        else{
            Toast.makeText(Registro.this, "Completa los campos", Toast.LENGTH_SHORT).show();
        }
    }
    //metodo para pasar al formulario
    public void registro(View view){

        Intent registro = new Intent(this, Formulario.class);
        startActivity(registro);
        finish();

    }
    //metodo para acceder a la otra actividad
    public void play(View view){

        Intent play = new Intent(this, Juego.class);
        startActivity(play);
        finish();

    }
    //metodo para comprobar que se añaden los datos
    private void loginuser(){

        mAuth.signInWithEmailAndPassword(textUsuario, textContraseña).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    //si la tarea es buena decimos que el boton play se active
                    play.setEnabled(true);
                    play.setTextColor(Color.parseColor("#ffffff"));


                }
                // un else que genera un toast en caso de error
                else {
                    Toast.makeText(Registro.this, "No se pudo iniciar sesion, compruebe los datos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}