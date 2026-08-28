package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    //1) Atributo
    EditText txtNome;
    Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2) Iniciando os elementos
        txtNome = findViewById(R.id.txtNome);
        btnCadastrar = findViewById(R.id.btnCadastrar);

        //3) Evento do botão
        btnCadastrar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Recuperando valor
                String nome = txtNome.getText().toString();

                //Intent para passar o valor para outra tela
                Intent it = new Intent(MainActivity.this,
                                            MainActivity2.class);
                it.putExtra("nome",nome);
                startActivity(it);
            }
        });
    }
}