package com.example.thedicegame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



import java.util.HashMap;
import java.util.Map;

public class Formulario extends AppCompatActivity {

    private EditText mEditTextNombre;
    private EditText mEditTextEmail;
    private EditText mEditTextContraseña;

    private Button registrar;


    //varibles de datos a registrar
    private String nombre ="";
    private String email ="";
    private String contraseña ="";

    FirebaseAuth mAuth;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario);

        mEditTextNombre = (EditText) findViewById(R.id.textoUsuario);
        mEditTextEmail =(EditText) findViewById(R.id.textoEmail);
        mEditTextContraseña = (EditText) findViewById(R.id.textoContraseña);

        registrar = (Button) findViewById(R.id.botonEnviar);

        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();


        // Comprobación  que los campos estan bien
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nombre = mEditTextNombre.getText().toString();
                email = mEditTextEmail.getText().toString();
                contraseña = mEditTextContraseña.getText().toString();

                if (!nombre.isEmpty() && !email.isEmpty() && !contraseña.isEmpty()){

                    if(contraseña.length()>=6){
                        registerUser();

                    }
                    else{
                        Toast.makeText(Formulario.this, "La contraseña debe tener al menos 6 caracteres", Toast.LENGTH_SHORT).show();
                    }


                }
                else {
                    Toast.makeText(Formulario.this, "Debe completar los campos ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    //Métdo para dar para atras en el formulario
    public void atras(View view){

        Intent atras = new Intent(this, Registro.class);
        startActivity(atras);
        finish();

    }

    //metodo de regitrar usuario

    private void registerUser(){

        mAuth.createUserWithEmailAndPassword(email,contraseña).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){

                    startActivity(new Intent(Formulario.this , Registro.class));
                    finish();
                    Map<String, Object>map = new HashMap<>();
                    map.put("nombre",nombre);
                    map.put("contraseña",contraseña);
                    map.put("email",email);

                    String id= mAuth.getCurrentUser().getUid();

                    mDatabase.child("Users").child(id).setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task2) {
                            if (task2.isSuccessful()){
                                startActivity(new Intent(Formulario.this , Registro.class));
                                finish();
                            }
                            else{
                                Toast.makeText(Formulario.this, "No se han podido crear los datos correctamente", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });
                }
                else{
                    Toast.makeText(Formulario.this, "No se pudo registrar este usuario", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}