package com.example.appmilgrau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    // 1) Atributos
    Button btnSalvar;
    EditText txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2) 'Linkando' o layout com o java
        btnSalvar = findViewById(R.id.btnSalvar);
        txtNome = findViewById(R.id.txtNome);

        // 3) Evento do btnSalvar
        btnSalvar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                // 4) Recuperando o valor o txtNome
                String nome = txtNome.getText().toString();

                // 5) Mensagem
                Toast.makeText(MainActivity.this,
                        "Olá, otário:" + nome,
                        Toast.LENGTH_LONG).show();

            }
        });
    }
}