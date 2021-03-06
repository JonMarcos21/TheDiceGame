package com.example.thedicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Juego extends AppCompatActivity {


    private EditText numero;
    private Button lanzar;

    int xdado;
    int ydado;

    private ImageButton dado;
    private ImageButton btn0x0;
    private ImageButton btn0x1;
    private ImageButton btn0x2;
    private ImageButton btn0x3;
    private ImageButton btn0x4;
    private ImageButton btn0x5;
    private ImageButton btn0x6;
    private ImageButton btn0x7;
    private ImageButton btn0x8;
    private ImageButton btn0x9;

    private ImageButton btn1x0;
    private ImageButton btn1x1;
    private ImageButton btn1x2;
    private ImageButton btn1x3;
    private ImageButton btn1x4;
    private ImageButton btn1x5;
    private ImageButton btn1x6;
    private ImageButton btn1x7;
    private ImageButton btn1x8;
    private ImageButton btn1x9;

    private ImageButton btn2x0;
    private ImageButton btn2x1;
    private ImageButton btn2x2;
    private ImageButton btn2x3;
    private ImageButton btn2x4;
    private ImageButton btn2x5;
    private ImageButton btn2x6;
    private ImageButton btn2x7;
    private ImageButton btn2x8;
    private ImageButton btn2x9;

    private ImageButton btn3x0;
    private ImageButton btn3x1;
    private ImageButton btn3x2;
    private ImageButton btn3x3;
    private ImageButton btn3x4;
    private ImageButton btn3x5;
    private ImageButton btn3x6;
    private ImageButton btn3x7;
    private ImageButton btn3x8;
    private ImageButton btn3x9;

    private ImageButton btn4x0;
    private ImageButton btn4x1;
    private ImageButton btn4x2;
    private ImageButton btn4x3;
    private ImageButton btn4x4;
    private ImageButton btn4x5;
    private ImageButton btn4x6;
    private ImageButton btn4x7;
    private ImageButton btn4x8;
    private ImageButton btn4x9;

    private ImageButton btn5x0;
    private ImageButton btn5x1;
    private ImageButton btn5x2;
    private ImageButton btn5x3;
    private ImageButton btn5x4;
    private ImageButton btn5x5;
    private ImageButton btn5x6;
    private ImageButton btn5x7;
    private ImageButton btn5x8;
    private ImageButton btn5x9;

    private ImageButton btn6x0;
    private ImageButton btn6x1;
    private ImageButton btn6x2;
    private ImageButton btn6x3;
    private ImageButton btn6x4;
    private ImageButton btn6x5;
    private ImageButton btn6x6;
    private ImageButton btn6x7;
    private ImageButton btn6x8;
    private ImageButton btn6x9;

    private ImageButton btn7x0;
    private ImageButton btn7x1;
    private ImageButton btn7x2;
    private ImageButton btn7x3;
    private ImageButton btn7x4;
    private ImageButton btn7x5;
    private ImageButton btn7x6;
    private ImageButton btn7x7;
    private ImageButton btn7x8;
    private ImageButton btn7x9;

    private ImageButton btn8x0;
    private ImageButton btn8x1;
    private ImageButton btn8x2;
    private ImageButton btn8x3;
    private ImageButton btn8x4;
    private ImageButton btn8x5;
    private ImageButton btn8x6;
    private ImageButton btn8x7;
    private ImageButton btn8x8;
    private ImageButton btn8x9;

    private ImageButton btn9x0;
    private ImageButton btn9x1;
    private ImageButton btn9x2;
    private ImageButton btn9x3;
    private ImageButton btn9x4;
    private ImageButton btn9x5;
    private ImageButton btn9x6;
    private ImageButton btn9x7;
    private ImageButton btn9x8;
    private ImageButton btn9x9;

    int xmover;
    int ymover;
    int xmover2;
    int ymover2;


    int[][]tablero = new int[10][10];


    private TextView marcador;
    int dado1;
    String nTiradas;
    int tiradas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juego);

        dado = (ImageButton) findViewById(R.id.btnDado);


        marcador =(TextView) findViewById(R.id.TxtTiradas);

        btn0x0 =(ImageButton) findViewById(R.id.btn0x0);
        btn0x1 =(ImageButton) findViewById(R.id.btn0x1);
        btn0x2 =(ImageButton) findViewById(R.id.btn0x2);
        btn0x3 =(ImageButton) findViewById(R.id.btn0x3);
        btn0x4 =(ImageButton) findViewById(R.id.btn0x4);
        btn0x5 =(ImageButton) findViewById(R.id.btn0x5);
        btn0x6 =(ImageButton) findViewById(R.id.btn0x6);
        btn0x7 =(ImageButton) findViewById(R.id.btn0x7);
        btn0x8 =(ImageButton) findViewById(R.id.btn0x8);
        btn0x9 =(ImageButton) findViewById(R.id.btn0x9);


        btn1x0 =(ImageButton) findViewById(R.id.btn1x0);
        btn1x1 =(ImageButton) findViewById(R.id.btn1x1);
        btn1x2 =(ImageButton) findViewById(R.id.btn1x2);
        btn1x3 =(ImageButton) findViewById(R.id.btn1x3);
        btn1x4 =(ImageButton) findViewById(R.id.btn1x4);
        btn1x5 =(ImageButton) findViewById(R.id.btn1x5);
        btn1x6 =(ImageButton) findViewById(R.id.btn1x6);
        btn1x7 =(ImageButton) findViewById(R.id.btn1x7);
        btn1x8 =(ImageButton) findViewById(R.id.btn1x8);
        btn1x9 =(ImageButton) findViewById(R.id.btn1x9);

        btn2x0 =(ImageButton) findViewById(R.id.btn2x0);
        btn2x1 =(ImageButton) findViewById(R.id.btn2x1);
        btn2x2 =(ImageButton) findViewById(R.id.btn2x2);
        btn2x3 =(ImageButton) findViewById(R.id.btn2x3);
        btn2x4 =(ImageButton) findViewById(R.id.btn2x4);
        btn2x5 =(ImageButton) findViewById(R.id.btn2x5);
        btn2x6 =(ImageButton) findViewById(R.id.btn2x6);
        btn2x7 =(ImageButton) findViewById(R.id.btn2x7);
        btn2x8 =(ImageButton) findViewById(R.id.btn2x8);
        btn2x9 =(ImageButton) findViewById(R.id.btn2x9);

        btn3x0 =(ImageButton) findViewById(R.id.btn3x0);
        btn3x1 =(ImageButton) findViewById(R.id.btn3x1);
        btn3x2 =(ImageButton) findViewById(R.id.btn3x2);
        btn3x3 =(ImageButton) findViewById(R.id.btn3x3);
        btn3x4 =(ImageButton) findViewById(R.id.btn3x4);
        btn3x5 =(ImageButton) findViewById(R.id.btn3x5);
        btn3x6 =(ImageButton) findViewById(R.id.btn3x6);
        btn3x7 =(ImageButton) findViewById(R.id.btn3x7);
        btn3x8 =(ImageButton) findViewById(R.id.btn3x8);
        btn3x9 =(ImageButton) findViewById(R.id.btn3x9);

        btn4x0 =(ImageButton) findViewById(R.id.btn4x0);
        btn4x1 =(ImageButton) findViewById(R.id.btn4x1);
        btn4x2 =(ImageButton) findViewById(R.id.btn4x2);
        btn4x3 =(ImageButton) findViewById(R.id.btn4x3);
        btn4x4 =(ImageButton) findViewById(R.id.btn4x4);
        btn4x5 =(ImageButton) findViewById(R.id.btn4x5);
        btn4x6 =(ImageButton) findViewById(R.id.btn4x6);
        btn4x7 =(ImageButton) findViewById(R.id.btn4x7);
        btn4x8 =(ImageButton) findViewById(R.id.btn4x8);
        btn4x9 =(ImageButton) findViewById(R.id.btn4x9);

        btn5x0 =(ImageButton) findViewById(R.id.btn5x0);
        btn5x1 =(ImageButton) findViewById(R.id.btn5x1);
        btn5x2 =(ImageButton) findViewById(R.id.btn5x2);
        btn5x3 =(ImageButton) findViewById(R.id.btn5x3);
        btn5x4 =(ImageButton) findViewById(R.id.btn5x4);
        btn5x5 =(ImageButton) findViewById(R.id.btn5x5);
        btn5x6 =(ImageButton) findViewById(R.id.btn5x6);
        btn5x7 =(ImageButton) findViewById(R.id.btn5x7);
        btn5x8 =(ImageButton) findViewById(R.id.btn5x8);
        btn5x9 =(ImageButton) findViewById(R.id.btn5x9);

        btn6x0 =(ImageButton) findViewById(R.id.btn6x0);
        btn6x1 =(ImageButton) findViewById(R.id.btn6x1);
        btn6x2 =(ImageButton) findViewById(R.id.btn6x2);
        btn6x3 =(ImageButton) findViewById(R.id.btn6x3);
        btn6x4 =(ImageButton) findViewById(R.id.btn6x4);
        btn6x5 =(ImageButton) findViewById(R.id.btn6x5);
        btn6x6 =(ImageButton) findViewById(R.id.btn6x6);
        btn6x7 =(ImageButton) findViewById(R.id.btn6x7);
        btn6x8 =(ImageButton) findViewById(R.id.btn6x8);
        btn6x9 =(ImageButton) findViewById(R.id.btn6x9);

        btn7x0 =(ImageButton) findViewById(R.id.btn7x0);
        btn7x1 =(ImageButton) findViewById(R.id.btn7x1);
        btn7x2 =(ImageButton) findViewById(R.id.btn7x2);
        btn7x3 =(ImageButton) findViewById(R.id.btn7x3);
        btn7x4 =(ImageButton) findViewById(R.id.btn7x4);
        btn7x5 =(ImageButton) findViewById(R.id.btn7x5);
        btn7x6 =(ImageButton) findViewById(R.id.btn7x6);
        btn7x7 =(ImageButton) findViewById(R.id.btn7x7);
        btn7x8 =(ImageButton) findViewById(R.id.btn7x8);
        btn7x9 =(ImageButton) findViewById(R.id.btn7x9);


        btn8x0 =(ImageButton) findViewById(R.id.btn8x0);
        btn8x1 =(ImageButton) findViewById(R.id.btn8x1);
        btn8x2 =(ImageButton) findViewById(R.id.btn8x2);
        btn8x3 =(ImageButton) findViewById(R.id.btn8x3);
        btn8x4 =(ImageButton) findViewById(R.id.btn8x4);
        btn8x5 =(ImageButton) findViewById(R.id.btn8x5);
        btn8x6 =(ImageButton) findViewById(R.id.btn8x6);
        btn8x7 =(ImageButton) findViewById(R.id.btn8x7);
        btn8x8 =(ImageButton) findViewById(R.id.btn8x8);
        btn8x9 =(ImageButton) findViewById(R.id.btn8x9);

        btn9x0 =(ImageButton) findViewById(R.id.btn9x0);
        btn9x1 =(ImageButton) findViewById(R.id.btn9x1);
        btn9x2 =(ImageButton) findViewById(R.id.btn9x2);
        btn9x3 =(ImageButton) findViewById(R.id.btn9x3);
        btn9x4 =(ImageButton) findViewById(R.id.btn9x4);
        btn9x5 =(ImageButton) findViewById(R.id.btn9x5);
        btn9x6 =(ImageButton) findViewById(R.id.btn9x6);
        btn9x7 =(ImageButton) findViewById(R.id.btn9x7);
        btn9x8 =(ImageButton) findViewById(R.id.btn9x8);
        btn9x9 =(ImageButton) findViewById(R.id.btn9x9);



        for (int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[0].length;j++){
                tablero[i][j]=0;
            }
        }
        tablero[9][9]=1;
        tablero[0][0]=2;




    }
    public void siguiente (){


        Intent siguiente = new Intent(this, Puntuacion.class);
        siguiente.putExtra("tiradas",tiradas);
        startActivity(siguiente);
        finish();
    }

    public void lanzar (View view){

        dado1 = (int)(Math.random()*6+1);
        tiradas++;
        this.nTiradas= String.valueOf(this.tiradas);
        marcador.setText(nTiradas);

        switch (dado1){
            case 1:
                dado.setImageResource(R.drawable.uno);
                break;
            case 2:
                dado.setImageResource(R.drawable.dos);
                break;
            case 3:
                dado.setImageResource(R.drawable.tres);
                break;
            case 4:
                dado.setImageResource(R.drawable.cuatro);
                break;
            case 5:
                dado.setImageResource(R.drawable.cinco);
                break;
            case 6:
                dado.setImageResource(R.drawable.seis);
        }
        dado.setEnabled(false);
        xmover=xdado+dado1;
        ymover=ydado+dado1;

        xmover2=xdado-dado1;
        ymover2=ydado-dado1;


        //Seg??n el resultado del dado activamos las casillas a las que se pueden moverse segun la X
        if(ydado==0 && xmover==0){
            btn0x0.setEnabled(true);
            btn0x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover2==0){
            btn0x0.setEnabled(true);
            btn0x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover==1){
            btn1x0.setEnabled(true);
            btn1x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover2==1){
            btn1x0.setEnabled(true);
            btn1x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover==2){
            btn2x0.setEnabled(true);
            btn2x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover2==2){
            btn2x0.setEnabled(true);
            btn2x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover==3) {
            btn3x0.setEnabled(true);
            btn3x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover2==3){
            btn3x0.setEnabled(true);
            btn3x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover==4) {
            btn4x0.setEnabled(true);
            btn4x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover2==4){
            btn4x0.setEnabled(true);
            btn4x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover==5) {
            btn5x0.setEnabled(true);
            btn5x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover2==5){
            btn5x0.setEnabled(true);
            btn5x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover==6) {
            btn6x0.setEnabled(true);
            btn6x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover2==6){
            btn6x0.setEnabled(true);
            btn6x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover==7) {
            btn7x0.setEnabled(true);
            btn7x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover2==7){
            btn7x0.setEnabled(true);
            btn7x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover==8) {
            btn8x0.setEnabled(true);
            btn8x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover2==8){
            btn8x0.setEnabled(true);
            btn8x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover==9) {
            btn8x0.setEnabled(true);
            btn8x0.setImageResource(R.drawable.square_red);
        }
        if(ydado==0 && xmover2==9){
            btn8x0.setEnabled(true);
            btn8x0.setImageResource(R.drawable.square_red);
        }




        if(ydado==1 && xmover==0){
            btn0x1.setEnabled(true);
            btn0x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover2==0){
            btn0x1.setEnabled(true);
            btn0x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover==1){
            btn1x1.setEnabled(true);
            btn1x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover2==1){
            btn1x1.setEnabled(true);
            btn1x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover==2){
            btn2x1.setEnabled(true);
            btn2x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover2==2){
            btn2x1.setEnabled(true);
            btn2x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover==3) {
            btn3x1.setEnabled(true);
            btn3x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover2==3){
            btn3x1.setEnabled(true);
            btn3x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover==4) {
            btn4x1.setEnabled(true);
            btn4x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover2==4){
            btn4x1.setEnabled(true);
            btn4x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover==5) {
            btn5x1.setEnabled(true);
            btn5x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover2==5){
            btn5x1.setEnabled(true);
            btn5x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover==6) {
            btn6x1.setEnabled(true);
            btn6x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover2==6){
            btn6x1.setEnabled(true);
            btn6x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover==7) {
            btn7x1.setEnabled(true);
            btn7x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover2==7){
            btn7x1.setEnabled(true);
            btn7x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover==8) {
            btn8x1.setEnabled(true);
            btn8x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover2==8){
            btn8x1.setEnabled(true);
            btn8x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover==9) {
            btn9x1.setEnabled(true);
            btn9x1.setImageResource(R.drawable.square_red);
        }
        if(ydado==1 && xmover2==9){
            btn9x1.setEnabled(true);
            btn9x1.setImageResource(R.drawable.square_red);
        }




        if(ydado==2 && xmover==0){
            btn0x2.setEnabled(true);
            btn0x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover2==0){
            btn0x2.setEnabled(true);
            btn0x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover==1){
            btn1x2.setEnabled(true);
            btn1x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover2==1){
            btn1x2.setEnabled(true);
            btn1x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover==2){
            btn2x2.setEnabled(true);
            btn2x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover2==2){
            btn2x2.setEnabled(true);
            btn2x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover==3) {
            btn3x2.setEnabled(true);
            btn3x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover2==3){
            btn3x2.setEnabled(true);
            btn3x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover==4) {
            btn4x2.setEnabled(true);
            btn4x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover2==4){
            btn4x2.setEnabled(true);
            btn4x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover==5) {
            btn5x2.setEnabled(true);
            btn5x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover2==5){
            btn5x2.setEnabled(true);
            btn5x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover==6) {
            btn6x2.setEnabled(true);
            btn6x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover2==6){
            btn6x2.setEnabled(true);
            btn6x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover==7) {
            btn7x2.setEnabled(true);
            btn7x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover2==7){
            btn7x2.setEnabled(true);
            btn7x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover==8) {
            btn8x2.setEnabled(true);
            btn8x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover2==8){
            btn8x2.setEnabled(true);
            btn8x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover==9) {
            btn9x2.setEnabled(true);
            btn9x2.setImageResource(R.drawable.square_red);
        }
        if(ydado==2 && xmover2==9){
            btn9x2.setEnabled(true);
            btn9x2.setImageResource(R.drawable.square_red);
        }




        if(ydado==3 && xmover==0){
            btn0x3.setEnabled(true);
            btn0x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover2==0){
            btn0x3.setEnabled(true);
            btn0x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover==1){
            btn1x3.setEnabled(true);
            btn1x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover2==1){
            btn1x3.setEnabled(true);
            btn1x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover==2){
            btn2x3.setEnabled(true);
            btn2x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover2==2){
            btn2x3.setEnabled(true);
            btn2x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover==3) {
            btn3x3.setEnabled(true);
            btn3x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover2==3){
            btn3x3.setEnabled(true);
            btn3x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover==4) {
            btn4x3.setEnabled(true);
            btn4x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover2==4){
            btn4x3.setEnabled(true);
            btn4x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover==5) {
            btn5x3.setEnabled(true);
            btn5x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover2==5){
            btn5x3.setEnabled(true);
            btn5x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover==6) {
            btn6x3.setEnabled(true);
            btn6x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover2==6){
            btn6x3.setEnabled(true);
            btn6x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover==7) {
            btn7x3.setEnabled(true);
            btn7x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover2==7){
            btn7x3.setEnabled(true);
            btn7x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover==8) {
            btn8x3.setEnabled(true);
            btn8x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover2==8){
            btn8x3.setEnabled(true);
            btn8x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover==9) {
            btn9x3.setEnabled(true);
            btn9x3.setImageResource(R.drawable.square_red);
        }
        if(ydado==3 && xmover2==9){
            btn9x3.setEnabled(true);
            btn9x3.setImageResource(R.drawable.square_red);
        }




        if(ydado==4 && xmover==0){
            btn0x4.setEnabled(true);
            btn0x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover2==0){
            btn0x4.setEnabled(true);
            btn0x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover==1){
            btn1x4.setEnabled(true);
            btn1x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover2==1){
            btn1x4.setEnabled(true);
            btn1x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover==2){
            btn2x4.setEnabled(true);
            btn2x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover2==2){
            btn2x4.setEnabled(true);
            btn2x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover==3) {
            btn3x4.setEnabled(true);
            btn3x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover2==3){
            btn3x4.setEnabled(true);
            btn3x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover==4) {
            btn4x4.setEnabled(true);
            btn4x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover2==4){
            btn4x4.setEnabled(true);
            btn4x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover==5) {
            btn5x4.setEnabled(true);
            btn5x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover2==5){
            btn5x4.setEnabled(true);
            btn5x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover==6) {
            btn6x4.setEnabled(true);
            btn6x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover2==6){
            btn6x4.setEnabled(true);
            btn6x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover==7) {
            btn7x4.setEnabled(true);
            btn7x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover2==7){
            btn7x4.setEnabled(true);
            btn7x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover==8) {
            btn8x4.setEnabled(true);
            btn8x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover2==8){
            btn8x4.setEnabled(true);
            btn8x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover==9) {
            btn9x4.setEnabled(true);
            btn9x4.setImageResource(R.drawable.square_red);
        }
        if(ydado==4 && xmover2==9){
            btn9x4.setEnabled(true);
            btn9x4.setImageResource(R.drawable.square_red);
        }




        if(ydado==5 && xmover==0){
            btn0x5.setEnabled(true);
            btn0x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover2==0){
            btn0x5.setEnabled(true);
            btn0x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover==1){
            btn1x5.setEnabled(true);
            btn1x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover2==1){
            btn1x5.setEnabled(true);
            btn1x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover==2){
            btn2x5.setEnabled(true);
            btn2x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover2==2){
            btn2x5.setEnabled(true);
            btn2x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover==3) {
            btn3x5.setEnabled(true);
            btn3x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover2==3){
            btn3x5.setEnabled(true);
            btn3x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover==4) {
            btn4x5.setEnabled(true);
            btn4x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover2==4){
            btn4x5.setEnabled(true);
            btn4x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover==5) {
            btn5x5.setEnabled(true);
            btn5x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover2==5){
            btn5x5.setEnabled(true);
            btn5x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover==6) {
            btn6x5.setEnabled(true);
            btn6x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover2==6){
            btn6x5.setEnabled(true);
            btn6x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover==7) {
            btn7x5.setEnabled(true);
            btn7x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover2==7){
            btn7x5.setEnabled(true);
            btn7x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover==8) {
            btn8x5.setEnabled(true);
            btn8x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover2==8){
            btn8x5.setEnabled(true);
            btn8x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover==9) {
            btn9x5.setEnabled(true);
            btn9x5.setImageResource(R.drawable.square_red);
        }
        if(ydado==5 && xmover2==9){
            btn9x5.setEnabled(true);
            btn9x5.setImageResource(R.drawable.square_red);
        }




        if(ydado==6 && xmover==0){
            btn0x6.setEnabled(true);
            btn0x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover2==0){
            btn0x6.setEnabled(true);
            btn0x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover==1){
            btn1x6.setEnabled(true);
            btn1x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover2==1){
            btn1x6.setEnabled(true);
            btn1x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover==2){
            btn2x6.setEnabled(true);
            btn2x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover2==2){
            btn2x6.setEnabled(true);
            btn2x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover==3) {
            btn3x6.setEnabled(true);
            btn3x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover2==3){
            btn3x6.setEnabled(true);
            btn3x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover==4) {
            btn4x6.setEnabled(true);
            btn4x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover2==4){
            btn4x6.setEnabled(true);
            btn4x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover==5) {
            btn5x6.setEnabled(true);
            btn5x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover2==5){
            btn5x6.setEnabled(true);
            btn5x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover==6) {
            btn6x6.setEnabled(true);
            btn6x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover2==6){
            btn6x6.setEnabled(true);
            btn6x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover==7) {
            btn7x6.setEnabled(true);
            btn7x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover2==7){
            btn7x6.setEnabled(true);
            btn7x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover==8) {
            btn8x6.setEnabled(true);
            btn8x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover2==8){
            btn8x6.setEnabled(true);
            btn8x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover==9) {
            btn9x6.setEnabled(true);
            btn9x6.setImageResource(R.drawable.square_red);
        }
        if(ydado==6 && xmover2==9){
            btn9x6.setEnabled(true);
            btn9x6.setImageResource(R.drawable.square_red);
        }




        if(ydado==7 && xmover==0){
            btn0x7.setEnabled(true);
            btn0x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover2==0){
            btn0x7.setEnabled(true);
            btn0x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover==1){
            btn1x7.setEnabled(true);
            btn1x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover2==1){
            btn1x7.setEnabled(true);
            btn1x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover==2){
            btn2x7.setEnabled(true);
            btn2x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover2==2){
            btn2x7.setEnabled(true);
            btn2x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover==3) {
            btn3x7.setEnabled(true);
            btn3x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover2==3){
            btn3x7.setEnabled(true);
            btn3x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover==4) {
            btn4x7.setEnabled(true);
            btn4x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover2==4){
            btn4x7.setEnabled(true);
            btn4x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover==5) {
            btn5x7.setEnabled(true);
            btn5x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover2==5){
            btn5x7.setEnabled(true);
            btn5x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover==6) {
            btn6x7.setEnabled(true);
            btn6x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover2==6){
            btn6x7.setEnabled(true);
            btn6x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover==7) {
            btn7x7.setEnabled(true);
            btn7x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover2==7){
            btn7x7.setEnabled(true);
            btn7x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover==8) {
            btn8x7.setEnabled(true);
            btn8x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover2==8){
            btn8x7.setEnabled(true);
            btn8x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover==9) {
            btn9x7.setEnabled(true);
            btn9x7.setImageResource(R.drawable.square_red);
        }
        if(ydado==7 && xmover2==9){
            btn9x7.setEnabled(true);
            btn9x7.setImageResource(R.drawable.square_red);
        }




        if(ydado==8 && xmover==0){
            btn0x8.setEnabled(true);
            btn0x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover2==0){
            btn0x8.setEnabled(true);
            btn0x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover==1){
            btn1x8.setEnabled(true);
            btn1x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover2==1){
            btn1x8.setEnabled(true);
            btn1x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover==2){
            btn2x8.setEnabled(true);
            btn2x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover2==2){
            btn2x8.setEnabled(true);
            btn2x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover==3) {
            btn3x8.setEnabled(true);
            btn3x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover2==3){
            btn3x8.setEnabled(true);
            btn3x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover==4) {
            btn4x8.setEnabled(true);
            btn4x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover2==4){
            btn4x8.setEnabled(true);
            btn4x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover==5) {
            btn5x8.setEnabled(true);
            btn5x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover2==5){
            btn5x8.setEnabled(true);
            btn5x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover==6) {
            btn6x8.setEnabled(true);
            btn6x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover2==6){
            btn6x8.setEnabled(true);
            btn6x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover==7) {
            btn7x8.setEnabled(true);
            btn7x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover2==7){
            btn7x8.setEnabled(true);
            btn7x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover==8) {
            btn8x8.setEnabled(true);
            btn8x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover2==8){
            btn8x8.setEnabled(true);
            btn8x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover==9) {
            btn9x8.setEnabled(true);
            btn9x8.setImageResource(R.drawable.square_red);
        }
        if(ydado==8 && xmover2==9){
            btn9x8.setEnabled(true);
            btn9x8.setImageResource(R.drawable.square_red);
        }




        if(ydado==9 && xmover==0){
            btn0x9.setEnabled(true);
            btn0x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover2==0){
            btn0x9.setEnabled(true);
            btn0x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover==1){
            btn1x9.setEnabled(true);
            btn1x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover2==1){
            btn1x9.setEnabled(true);
            btn1x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover==2){
            btn2x9.setEnabled(true);
            btn2x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover2==2){
            btn2x9.setEnabled(true);
            btn2x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover==3) {
            btn3x9.setEnabled(true);
            btn3x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover2==3){
            btn3x9.setEnabled(true);
            btn3x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover==4) {
            btn4x9.setEnabled(true);
            btn4x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover2==4){
            btn4x9.setEnabled(true);
            btn4x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover==5) {
            btn5x9.setEnabled(true);
            btn5x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover2==5){
            btn5x9.setEnabled(true);
            btn5x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover==6) {
            btn6x9.setEnabled(true);
            btn6x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover2==6){
            btn6x9.setEnabled(true);
            btn6x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover==7) {
            btn7x9.setEnabled(true);
            btn7x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover2==7){
            btn7x9.setEnabled(true);
            btn7x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover==8) {
            btn8x9.setEnabled(true);
            btn8x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover2==8){
            btn8x9.setEnabled(true);
            btn8x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover==9) {
            btn9x9.setEnabled(true);
            btn9x9.setImageResource(R.drawable.square_red);
        }
        if(ydado==9 && xmover2==9){
            btn9x9.setEnabled(true);
            btn9x9.setImageResource(R.drawable.square_red);
        }

        //Seg??n el resultado del dado activamos las casillas a las que se pueden moverse segun la Y

        if(xdado==0 && ymover==0){
            btn0x0.setEnabled(true);
            btn0x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover2==0){
            btn0x0.setEnabled(true);
            btn0x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover==1){
            btn0x1.setEnabled(true);
            btn0x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover2==1){
            btn0x1.setEnabled(true);
            btn0x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover==2){
            btn0x2.setEnabled(true);
            btn0x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover2==2){
            btn0x2.setEnabled(true);
            btn0x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover==3){
            btn0x3.setEnabled(true);
            btn0x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover2==3){
            btn0x3.setEnabled(true);
            btn0x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover==4){
            btn0x4.setEnabled(true);
            btn0x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover2==4){
            btn0x4.setEnabled(true);
            btn0x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover==5){
            btn0x5.setEnabled(true);
            btn0x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover2==5){
            btn0x5.setEnabled(true);
            btn0x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover==6){
            btn0x6.setEnabled(true);
            btn0x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover2==6){
            btn0x6.setEnabled(true);
            btn0x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover==7){
            btn0x7.setEnabled(true);
            btn0x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover2==7){
            btn0x7.setEnabled(true);
            btn0x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover==8){
            btn0x8.setEnabled(true);
            btn0x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover2==8){
            btn0x8.setEnabled(true);
            btn0x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover==9){
            btn0x9.setEnabled(true);
            btn0x9.setImageResource(R.drawable.square_red);
        }
        if(xdado==0 && ymover2==9){
            btn0x9.setEnabled(true);
            btn0x9.setImageResource(R.drawable.square_red);
        }




        if(xdado==1 && ymover==0){
            btn1x0.setEnabled(true);
            btn1x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover2==0){
            btn1x0.setEnabled(true);
            btn1x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover==1){
            btn1x1.setEnabled(true);
            btn1x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover2==1){
            btn1x1.setEnabled(true);
            btn1x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover==2){
            btn1x2.setEnabled(true);
            btn1x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover2==2){
            btn1x2.setEnabled(true);
            btn1x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover==3){
            btn1x3.setEnabled(true);
            btn1x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover2==3){
            btn1x3.setEnabled(true);
            btn1x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover==4){
            btn1x4.setEnabled(true);
            btn1x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover2==4){
            btn1x4.setEnabled(true);
            btn1x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover==5){
            btn1x5.setEnabled(true);
            btn1x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover2==5){
            btn1x5.setEnabled(true);
            btn1x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover==6){
            btn1x6.setEnabled(true);
            btn1x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover2==6){
            btn1x6.setEnabled(true);
            btn1x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover==7){
            btn1x7.setEnabled(true);
            btn1x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover2==7){
            btn1x7.setEnabled(true);
            btn1x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover==8){
            btn1x8.setEnabled(true);
            btn1x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover2==8){
            btn1x8.setEnabled(true);
            btn1x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover==9){
            btn1x9.setEnabled(true);
            btn1x9.setImageResource(R.drawable.square_red);
        }
        if(xdado==1 && ymover2==9){
            btn1x9.setEnabled(true);
            btn1x9.setImageResource(R.drawable.square_red);
        }




        if(xdado==2 && ymover==0){
            btn2x0.setEnabled(true);
            btn2x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover2==0){
            btn2x0.setEnabled(true);
            btn2x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover==1){
            btn2x1.setEnabled(true);
            btn2x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover2==1){
            btn2x1.setEnabled(true);
            btn2x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover==2){
            btn2x2.setEnabled(true);
            btn2x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover2==2){
            btn2x2.setEnabled(true);
            btn2x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover==3){
            btn2x3.setEnabled(true);
            btn2x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover2==3){
            btn2x3.setEnabled(true);
            btn2x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover==4){
            btn2x4.setEnabled(true);
            btn2x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover2==4){
            btn2x4.setEnabled(true);
            btn2x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover==5){
            btn2x5.setEnabled(true);
            btn2x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover2==5){
            btn2x5.setEnabled(true);
            btn2x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover==6){
            btn2x6.setEnabled(true);
            btn2x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover2==6){
            btn2x6.setEnabled(true);
            btn2x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover==7){
            btn2x7.setEnabled(true);
            btn2x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover2==7){
            btn2x7.setEnabled(true);
            btn2x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover==8){
            btn2x8.setEnabled(true);
            btn2x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover2==8){
            btn2x8.setEnabled(true);
            btn2x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover==9){
            btn2x9.setEnabled(true);
            btn2x9.setImageResource(R.drawable.square_red);
        }
        if(xdado==2 && ymover2==9){
            btn2x9.setEnabled(true);
            btn2x9.setImageResource(R.drawable.square_red);
        }




        if(xdado==3 && ymover==0){
            btn3x0.setEnabled(true);
            btn3x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover2==0){
            btn3x0.setEnabled(true);
            btn3x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover==1){
            btn3x1.setEnabled(true);
            btn3x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover2==1){
            btn3x1.setEnabled(true);
            btn3x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover==2){
            btn3x2.setEnabled(true);
            btn3x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover2==2){
            btn3x2.setEnabled(true);
            btn3x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover==3){
            btn3x3.setEnabled(true);
            btn3x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover2==3){
            btn3x3.setEnabled(true);
            btn3x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover==4){
            btn3x4.setEnabled(true);
            btn3x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover2==4){
            btn3x4.setEnabled(true);
            btn3x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover==5){
            btn3x5.setEnabled(true);
            btn3x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover2==5){
            btn3x5.setEnabled(true);
            btn3x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover==6){
            btn3x6.setEnabled(true);
            btn3x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover2==6){
            btn3x6.setEnabled(true);
            btn3x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover==7){
            btn3x7.setEnabled(true);
            btn3x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover2==7){
            btn3x7.setEnabled(true);
            btn3x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover==8){
            btn3x8.setEnabled(true);
            btn3x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover2==8){
            btn3x8.setEnabled(true);
            btn3x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover==9){
            btn3x9.setEnabled(true);
            btn3x9.setImageResource(R.drawable.square_red);
        }
        if(xdado==3 && ymover2==9){
            btn3x9.setEnabled(true);
            btn3x9.setImageResource(R.drawable.square_red);
        }




        if(xdado==4 && ymover==0){
            btn4x0.setEnabled(true);
            btn4x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover2==0){
            btn4x0.setEnabled(true);
            btn4x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover==1){
            btn4x1.setEnabled(true);
            btn4x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover2==1){
            btn4x1.setEnabled(true);
            btn4x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover==2){
            btn4x2.setEnabled(true);
            btn4x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover2==2){
            btn4x2.setEnabled(true);
            btn4x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover==3){
            btn4x3.setEnabled(true);
            btn4x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover2==3){
            btn4x3.setEnabled(true);
            btn4x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover==4){
            btn4x4.setEnabled(true);
            btn4x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover2==4){
            btn4x4.setEnabled(true);
            btn4x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover==5){
            btn4x5.setEnabled(true);
            btn4x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover2==5){
            btn4x5.setEnabled(true);
            btn4x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover==6){
            btn4x6.setEnabled(true);
            btn4x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover2==6){
            btn4x6.setEnabled(true);
            btn4x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover==7){
            btn4x7.setEnabled(true);
            btn4x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover2==7){
            btn4x7.setEnabled(true);
            btn4x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover==8){
            btn4x8.setEnabled(true);
            btn4x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover2==8){
            btn4x8.setEnabled(true);
            btn4x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover==9){
            btn4x9.setEnabled(true);
            btn4x9.setImageResource(R.drawable.square_red);
        }
        if(xdado==4 && ymover2==9){
            btn4x9.setEnabled(true);
            btn4x9.setImageResource(R.drawable.square_red);
        }




        if(xdado==5 && ymover==0){
            btn5x0.setEnabled(true);
            btn5x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover2==0){
            btn5x0.setEnabled(true);
            btn5x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover==1){
            btn5x1.setEnabled(true);
            btn5x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover2==1){
            btn5x1.setEnabled(true);
            btn5x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover==2){
            btn5x2.setEnabled(true);
            btn5x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover2==2){
            btn5x2.setEnabled(true);
            btn5x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover==3){
            btn5x3.setEnabled(true);
            btn5x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover2==3){
            btn5x3.setEnabled(true);
            btn5x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover==4){
            btn5x4.setEnabled(true);
            btn5x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover2==4){
            btn5x4.setEnabled(true);
            btn5x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover==5){
            btn5x5.setEnabled(true);
            btn5x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover2==5){
            btn5x5.setEnabled(true);
            btn5x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover==6){
            btn5x6.setEnabled(true);
            btn5x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover2==6){
            btn5x6.setEnabled(true);
            btn5x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover==7){
            btn5x7.setEnabled(true);
            btn5x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover2==7){
            btn5x7.setEnabled(true);
            btn5x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover==8){
            btn5x8.setEnabled(true);
            btn5x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover2==8){
            btn5x8.setEnabled(true);
            btn5x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover==9){
            btn5x9.setEnabled(true);
            btn5x9.setImageResource(R.drawable.square_red);
        }
        if(xdado==5 && ymover2==9){
            btn5x9.setEnabled(true);
            btn5x9.setImageResource(R.drawable.square_red);
        }




        if(xdado==6 && ymover==0){
            btn6x0.setEnabled(true);
            btn6x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover2==0){
            btn6x0.setEnabled(true);
            btn6x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover==1){
            btn6x1.setEnabled(true);
            btn6x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover2==1){
            btn6x1.setEnabled(true);
            btn6x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover==2){
            btn6x2.setEnabled(true);
            btn6x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover2==2){
            btn6x2.setEnabled(true);
            btn6x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover==3){
            btn6x3.setEnabled(true);
            btn6x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover2==3){
            btn6x3.setEnabled(true);
            btn6x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover==4){
            btn6x4.setEnabled(true);
            btn6x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover2==4){
            btn6x4.setEnabled(true);
            btn6x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover==5){
            btn6x5.setEnabled(true);
            btn6x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover2==5){
            btn6x5.setEnabled(true);
            btn6x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover==6){
            btn6x6.setEnabled(true);
            btn6x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover2==6){
            btn6x6.setEnabled(true);
            btn6x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover==7){
            btn6x7.setEnabled(true);
            btn6x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover2==7){
            btn6x7.setEnabled(true);
            btn6x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover==8){
            btn6x8.setEnabled(true);
            btn6x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover2==8){
            btn6x8.setEnabled(true);
            btn6x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover==9){
            btn6x9.setEnabled(true);
            btn6x9.setImageResource(R.drawable.square_red);
        }
        if(xdado==6 && ymover2==9){
            btn6x9.setEnabled(true);
            btn6x9.setImageResource(R.drawable.square_red);
        }




        if(xdado==7 && ymover==0){
            btn7x0.setEnabled(true);
            btn7x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover2==0){
            btn7x0.setEnabled(true);
            btn7x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover==1){
            btn7x1.setEnabled(true);
            btn7x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover2==1){
            btn7x1.setEnabled(true);
            btn7x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover==2){
            btn7x2.setEnabled(true);
            btn7x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover2==2){
            btn7x2.setEnabled(true);
            btn7x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover==3){
            btn7x3.setEnabled(true);
            btn7x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover2==3){
            btn7x3.setEnabled(true);
            btn7x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover==4){
            btn7x4.setEnabled(true);
            btn7x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover2==4){
            btn7x4.setEnabled(true);
            btn7x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover==5){
            btn7x5.setEnabled(true);
            btn7x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover2==5){
            btn7x5.setEnabled(true);
            btn7x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover==6){
            btn7x6.setEnabled(true);
            btn7x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover2==6){
            btn7x6.setEnabled(true);
            btn7x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover==7){
            btn7x7.setEnabled(true);
            btn7x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover2==7){
            btn7x7.setEnabled(true);
            btn7x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover==8){
            btn7x8.setEnabled(true);
            btn7x8.setImageResource(R.drawable.square_red);
        }
        if(ymover<=9 && xdado==7 && ymover2==8){
            btn7x8.setEnabled(true);
            btn7x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover==9){
            btn7x9.setEnabled(true);
            btn7x9.setImageResource(R.drawable.square_red);
        }
        if(xdado==7 && ymover2==9){
            btn7x9.setEnabled(true);
            btn7x9.setImageResource(R.drawable.square_red);
        }




        if(xdado==8 && ymover==0){
            btn8x0.setEnabled(true);
            btn8x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover2==0){
            btn8x0.setEnabled(true);
            btn8x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover==1){
            btn8x1.setEnabled(true);
            btn8x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover2==1){
            btn8x1.setEnabled(true);
            btn8x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover==2){
            btn8x2.setEnabled(true);
            btn8x2.setImageResource(R.drawable.square_red);
        }
        if(ymover<=9 && xdado==8 && ymover2==2){
            btn8x2.setEnabled(true);
            btn8x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover==3){
            btn8x3.setEnabled(true);
            btn8x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover2==3){
            btn8x3.setEnabled(true);
            btn8x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover==4){
            btn8x4.setEnabled(true);
            btn8x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover2==4){
            btn8x4.setEnabled(true);
            btn8x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover==5){
            btn8x5.setEnabled(true);
            btn8x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover2==5){
            btn8x5.setEnabled(true);
            btn8x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover==6){
            btn8x6.setEnabled(true);
            btn8x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover2==6){
            btn8x6.setEnabled(true);
            btn8x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover==7){
            btn8x7.setEnabled(true);
            btn8x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover2==7){
            btn8x7.setEnabled(true);
            btn8x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover==8){
            btn8x8.setEnabled(true);
            btn8x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover2==8){
            btn8x8.setEnabled(true);
            btn8x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover==9){
            btn8x9.setEnabled(true);
            btn8x9.setImageResource(R.drawable.square_red);
        }
        if(xdado==8 && ymover2==9){
            btn8x9.setEnabled(true);
            btn8x9.setImageResource(R.drawable.square_red);
        }




        if(xdado==9 && ymover==0){
            btn9x0.setEnabled(true);
            btn9x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover2==0){
            btn9x0.setEnabled(true);
            btn9x0.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover==1){
            btn9x1.setEnabled(true);
            btn9x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover2==1){
            btn9x1.setEnabled(true);
            btn9x1.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover==2){
            btn9x2.setEnabled(true);
            btn9x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover2==2){
            btn9x2.setEnabled(true);
            btn9x2.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover==3){
            btn9x3.setEnabled(true);
            btn9x3.setImageResource(R.drawable.square_red);
        }
        if(ymover<=9 && xdado==9 && ymover2==3){
            btn9x3.setEnabled(true);
            btn9x3.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover==4){
            btn9x4.setEnabled(true);
            btn9x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover2==4){
            btn9x4.setEnabled(true);
            btn9x4.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover==5){
            btn9x5.setEnabled(true);
            btn9x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover2==5){
            btn9x5.setEnabled(true);
            btn9x5.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover==6){
            btn9x6.setEnabled(true);
            btn9x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover2==6){
            btn9x6.setEnabled(true);
            btn9x6.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover==7){
            btn9x7.setEnabled(true);
            btn9x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover2==7){
            btn9x7.setEnabled(true);
            btn9x7.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover==8){
            btn9x8.setEnabled(true);
            btn9x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover2==8){
            btn9x8.setEnabled(true);
            btn9x8.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover==9){
            btn9x9.setEnabled(true);
            btn9x9.setImageResource(R.drawable.square_red);
        }
        if(xdado==9 && ymover2==9){
            btn9x9.setEnabled(true);
            btn9x9.setImageResource(R.drawable.square_red);
        }


        }
    public void casilla0x0(View view){

        //Muevo el heroe a la posici??n seleccionada
        btn0x0.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado=0;
        ydado=0;

        //Compruebo que el cofre no est?? en esta casilla
        if(tablero[xdado][ydado]==1){
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);

        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);


    }
    public void casilla1x0(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn1x0.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 1;
        ydado = 0;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);

        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla2x0(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn1x0.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 2;
        ydado = 0;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);

        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla3x0(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn1x0.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 3;
        ydado = 0;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);

        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla4x0(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn4x0.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 4;
        ydado = 0;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);

        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla5x0(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn5x0.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 5;
        ydado = 0;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);

        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla6x0(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn6x0.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 6;
        ydado = 0;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);

        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla7x0(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn7x0.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 7;
        ydado = 0;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);

        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla8x0(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn8x0.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 8;
        ydado = 0;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);

        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla9x0(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn9x0.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 9;
        ydado = 0;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);

        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla0x1(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn0x1.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 0;
        ydado = 1;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla1x1(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn1x1.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 1;
        ydado = 1;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla2x1(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn2x1.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 2;
        ydado = 1;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla3x1(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn3x1.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 3;
        ydado = 1;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla4x1(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn4x1.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 4;
        ydado = 1;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla5x1(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn5x1.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 5;
        ydado = 1;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla6x1(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn6x1.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 6;
        ydado = 1;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla7x1(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn7x1.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 7;
        ydado = 1;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla8x1(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn8x1.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 8;
        ydado = 1;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla9x1(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn9x1.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 9;
        ydado = 1;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);

        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla0x2(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn0x2.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 0;
        ydado = 2;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla1x2(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn1x2.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 1;
        ydado = 2;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla2x2(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn2x2.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 2;
        ydado = 2;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla3x2(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn3x2.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 3;
        ydado = 2;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla4x2(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn4x2.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 4;
        ydado = 2;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla5x2(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn5x2.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 5;
        ydado = 2;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla6x2(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn6x2.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 6;
        ydado = 2;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla7x2(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn7x2.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 7;
        ydado = 2;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla8x2(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn8x2.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 8;
        ydado = 2;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla9x2(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn9x2.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 9;
        ydado = 2;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);

        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla0x3(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn0x3.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 0;
        ydado = 3;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla1x3(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn1x3.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 1;
        ydado = 3;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla2x3(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn2x3.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 2;
        ydado = 3;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla3x3(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn3x3.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 3;
        ydado = 3;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla4x3(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn4x3.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 4;
        ydado = 3;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla5x3(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn5x3.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 5;
        ydado = 3;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla6x3(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn6x3.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 6;
        ydado = 3;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla7x3(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn7x3.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 7;
        ydado = 3;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla8x3(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn8x3.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 8;
        ydado = 3;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla9x3(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn9x3.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 9;
        ydado = 3;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);

        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla0x4(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn0x4.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 0;
        ydado = 4;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla1x4(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn1x4.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 1;
        ydado = 4;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla2x4(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn2x4.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 2;
        ydado = 4;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla3x4(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn3x4.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 3;
        ydado = 4;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla4x4(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn4x4.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 4;
        ydado = 4;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla5x4(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn5x4.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 5;
        ydado = 4;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla6x4(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn6x4.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 6;
        ydado = 4;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla7x4(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn7x4.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 7;
        ydado = 4;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla8x4(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn8x4.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 8;
        ydado = 4;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla9x4(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn9x4.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 9;
        ydado = 4;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);

        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla0x5(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn0x5.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 0;
        ydado = 5;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla1x5(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn1x5.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 1;
        ydado = 5;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla2x5(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn2x5.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 2;
        ydado = 5;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla3x5(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn3x5.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 3;
        ydado = 5;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla4x5(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn4x5.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 4;
        ydado = 5;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla5x5(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn5x5.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 5;
        ydado = 5;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla6x5(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn6x5.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 6;
        ydado = 5;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla7x5(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn7x5.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 7;
        ydado = 5;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla8x5(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn8x5.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 8;
        ydado = 5;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla9x5(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn9x5.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 9;
        ydado = 5;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);

        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla0x6(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn0x6.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 0;
        ydado = 6;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla1x6(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn1x6.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 1;
        ydado = 6;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla2x6(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn2x6.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 2;
        ydado = 6;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla3x6(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn3x6.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 3;
        ydado = 6;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla4x6(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn4x6.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 4;
        ydado = 6;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla5x6(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn5x6.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 5;
        ydado = 6;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla6x6(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn6x6.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 6;
        ydado = 6;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla7x6(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn7x6.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 7;
        ydado = 6;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla8x6(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn8x6.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 8;
        ydado = 6;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla9x6(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn9x6.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 9;
        ydado = 6;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);

        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla0x7(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn0x7.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 0;
        ydado = 7;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla1x7(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn1x7.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 1;
        ydado = 7;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla2x7(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn2x7.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 2;
        ydado = 7;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }

    public void casilla3x7(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn3x7.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 3;
        ydado = 7;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla4x7(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn4x7.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 4;
        ydado = 7;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla5x7(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn5x7.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 5;
        ydado = 7;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla6x7(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn6x7.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 6;
        ydado = 7;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla7x7(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn7x7.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 7;
        ydado = 7;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }

    public void casilla8x7(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn8x7.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 8;
        ydado = 7;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla9x7(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn9x7.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 9;
        ydado = 7;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);

        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla0x8(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn0x8.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 0;
        ydado = 8;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla1x8(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn1x8.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 1;
        ydado = 8;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla2x8(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn2x8.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 2;
        ydado = 8;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla3x8(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn3x8.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 3;
        ydado = 8;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla4x8(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn4x8.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 4;
        ydado = 8;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla5x8(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn5x8.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 5;
        ydado = 8;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla6x8(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn6x8.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 6;
        ydado = 8;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla7x8(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn7x8.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 7;
        ydado = 8;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla8x8(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn8x8.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 8;
        ydado = 8;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla9x8(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn9x8.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 9;
        ydado = 8;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);

        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla0x9(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn0x9.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 0;
        ydado = 9;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);


        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla1x9(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn1x9.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 1;
        ydado = 9;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);


        btn0x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla2x9(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn2x9.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 2;
        ydado = 9;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);


        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla3x9(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn3x9.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 3;
        ydado = 9;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);


        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla4x9(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn4x9.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 4;
        ydado = 9;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);


        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla5x9(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn5x9.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 5;
        ydado = 9;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);


        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla6x9(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn6x9.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 6;
        ydado = 9;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);


        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla7x9(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn7x9.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 7;
        ydado = 9;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);


        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla8x9(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn8x9.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 8;
        ydado = 9;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);


        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }
    public void casilla9x9(View view) {

        //Muevo el heroe a la posici??n seleccionada
        btn9x9.setImageResource(R.drawable.heroe);

        //Actualizo a X y la Y del array
        xdado = 9;
        ydado = 9;

        //Compruebo que el cofre no est?? en esta casilla
        if (tablero[xdado][ydado] == 1) {
            Toast.makeText(Juego.this, "??Felicidades! ??has encontrado el cofre!", Toast.LENGTH_SHORT).show();
            siguiente();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.tablero);
        btn1x0.setImageResource(R.drawable.tablero);
        btn2x0.setImageResource(R.drawable.tablero);
        btn3x0.setImageResource(R.drawable.tablero);
        btn4x0.setImageResource(R.drawable.tablero);
        btn5x0.setImageResource(R.drawable.tablero);
        btn6x0.setImageResource(R.drawable.tablero);
        btn7x0.setImageResource(R.drawable.tablero);
        btn8x0.setImageResource(R.drawable.tablero);
        btn9x0.setImageResource(R.drawable.tablero);


        btn0x1.setImageResource(R.drawable.tablero);
        btn1x1.setImageResource(R.drawable.tablero);
        btn2x1.setImageResource(R.drawable.tablero);
        btn3x1.setImageResource(R.drawable.tablero);
        btn4x1.setImageResource(R.drawable.tablero);
        btn5x1.setImageResource(R.drawable.tablero);
        btn6x1.setImageResource(R.drawable.tablero);
        btn7x1.setImageResource(R.drawable.tablero);
        btn8x1.setImageResource(R.drawable.tablero);
        btn9x1.setImageResource(R.drawable.tablero);


        btn0x2.setImageResource(R.drawable.tablero);
        btn1x2.setImageResource(R.drawable.tablero);
        btn2x2.setImageResource(R.drawable.tablero);
        btn3x2.setImageResource(R.drawable.tablero);
        btn4x2.setImageResource(R.drawable.tablero);
        btn5x2.setImageResource(R.drawable.tablero);
        btn6x2.setImageResource(R.drawable.tablero);
        btn7x2.setImageResource(R.drawable.tablero);
        btn8x2.setImageResource(R.drawable.tablero);
        btn9x2.setImageResource(R.drawable.tablero);


        btn0x3.setImageResource(R.drawable.tablero);
        btn1x3.setImageResource(R.drawable.tablero);
        btn2x3.setImageResource(R.drawable.tablero);
        btn3x3.setImageResource(R.drawable.tablero);
        btn4x3.setImageResource(R.drawable.tablero);
        btn5x3.setImageResource(R.drawable.tablero);
        btn6x3.setImageResource(R.drawable.tablero);
        btn7x3.setImageResource(R.drawable.tablero);
        btn8x3.setImageResource(R.drawable.tablero);
        btn9x3.setImageResource(R.drawable.tablero);


        btn0x4.setImageResource(R.drawable.tablero);
        btn1x4.setImageResource(R.drawable.tablero);
        btn2x4.setImageResource(R.drawable.tablero);
        btn3x4.setImageResource(R.drawable.tablero);
        btn4x4.setImageResource(R.drawable.tablero);
        btn5x4.setImageResource(R.drawable.tablero);
        btn6x4.setImageResource(R.drawable.tablero);
        btn7x4.setImageResource(R.drawable.tablero);
        btn8x4.setImageResource(R.drawable.tablero);
        btn9x4.setImageResource(R.drawable.tablero);


        btn0x5.setImageResource(R.drawable.tablero);
        btn1x5.setImageResource(R.drawable.tablero);
        btn2x5.setImageResource(R.drawable.tablero);
        btn3x5.setImageResource(R.drawable.tablero);
        btn4x5.setImageResource(R.drawable.tablero);
        btn5x5.setImageResource(R.drawable.tablero);
        btn6x5.setImageResource(R.drawable.tablero);
        btn7x5.setImageResource(R.drawable.tablero);
        btn8x5.setImageResource(R.drawable.tablero);
        btn9x5.setImageResource(R.drawable.tablero);


        btn0x6.setImageResource(R.drawable.tablero);
        btn1x6.setImageResource(R.drawable.tablero);
        btn2x6.setImageResource(R.drawable.tablero);
        btn3x6.setImageResource(R.drawable.tablero);
        btn4x6.setImageResource(R.drawable.tablero);
        btn5x6.setImageResource(R.drawable.tablero);
        btn6x6.setImageResource(R.drawable.tablero);
        btn7x6.setImageResource(R.drawable.tablero);
        btn8x6.setImageResource(R.drawable.tablero);
        btn9x6.setImageResource(R.drawable.tablero);


        btn0x7.setImageResource(R.drawable.tablero);
        btn1x7.setImageResource(R.drawable.tablero);
        btn2x7.setImageResource(R.drawable.tablero);
        btn3x7.setImageResource(R.drawable.tablero);
        btn4x7.setImageResource(R.drawable.tablero);
        btn5x7.setImageResource(R.drawable.tablero);
        btn6x7.setImageResource(R.drawable.tablero);
        btn7x7.setImageResource(R.drawable.tablero);
        btn8x7.setImageResource(R.drawable.tablero);
        btn9x7.setImageResource(R.drawable.tablero);


        btn0x8.setImageResource(R.drawable.tablero);
        btn1x8.setImageResource(R.drawable.tablero);
        btn2x8.setImageResource(R.drawable.tablero);
        btn3x8.setImageResource(R.drawable.tablero);
        btn4x8.setImageResource(R.drawable.tablero);
        btn5x8.setImageResource(R.drawable.tablero);
        btn6x8.setImageResource(R.drawable.tablero);
        btn7x8.setImageResource(R.drawable.tablero);
        btn8x8.setImageResource(R.drawable.tablero);
        btn9x8.setImageResource(R.drawable.tablero);


        btn0x9.setImageResource(R.drawable.tablero);
        btn1x9.setImageResource(R.drawable.tablero);
        btn2x9.setImageResource(R.drawable.tablero);
        btn3x9.setImageResource(R.drawable.tablero);
        btn4x9.setImageResource(R.drawable.tablero);
        btn5x9.setImageResource(R.drawable.tablero);
        btn6x9.setImageResource(R.drawable.tablero);
        btn7x9.setImageResource(R.drawable.tablero);
        btn8x9.setImageResource(R.drawable.tablero);


        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);

        dado.setEnabled(true);
    }


}