package com.example.thedicegame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

    Button formulario;
    Button inicio;

    private EditText contraseña1;
    private EditText correo1;

    private String textUsuario = "";
    private String textContraseña = "";

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        formulario=(Button) findViewById(R.id.registrarse);
        inicio =(Button) findViewById(R.id.acceso);

        contraseña1 = (EditText) findViewById(R.id.Contraseña);
        correo1 = (EditText) findViewById(R.id.Usuario);
        mAuth=FirebaseAuth.getInstance();

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
    public void registro(View view){

        Intent registro = new Intent(this, Formulario.class);
        startActivity(registro);
        finish();

    }
    private void loginuser(){

        mAuth.signInWithEmailAndPassword(textUsuario, textContraseña).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    startActivity(new Intent(Registro.this , Inicio.class));

                }
                else {
                    Toast.makeText(Registro.this, "No se pudo iniciar sesion, compruebe los datos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}