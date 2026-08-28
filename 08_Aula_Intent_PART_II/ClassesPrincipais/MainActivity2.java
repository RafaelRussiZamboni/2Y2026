package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{
    //Atributo
    TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Iniciando
        lblResultado = findViewById(R.id.lblResultado);

        //Intent para receber o valor
        Intent it = getIntent();

        //Colocando o valor no textView
        lblResultado.setText("Olá, " + it.getStringExtra("nome")
                         + "Acho... acho que te amo!!!");

    }
}