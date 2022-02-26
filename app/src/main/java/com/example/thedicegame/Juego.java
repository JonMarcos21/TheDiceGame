package com.example.thedicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Juego extends AppCompatActivity {


    private EditText numero;
    private Button lanzar;

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






    private TextView marcador;
    int dado1;



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








    }

    public void lanzar (View view){

        dado1 = (int)(Math.random()*6)*1;


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



    }


}