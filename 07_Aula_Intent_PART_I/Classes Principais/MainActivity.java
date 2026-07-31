package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    //1) Atributo
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2) Iniciando o elemento
        btnEntrar = findViewById(R.id.btnEntrar);

        //3) Evento do botão
        btnEntrar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                /*    :::  INTENT   :::
                    Classe responsável pela manipulação
                    das activities... permitindo uma
                    'ligação' entre elas, além de passagem
                    de valores!!!     S2   :)
                 */

                //Instanciando o Intent
                Intent it = new Intent(MainActivity.this,
                                        Tela2.class);

                //Iniciando a Tela2
                startActivity(it);

            }
        });



    }
}