package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    //1) Atributos
    TextView lblmensagem, lblTextoArtista;
    Spinner spinner;
    ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2) Iniciando os elementos
        lblmensagem = findViewById(R.id.lblmensagem);
        lblTextoArtista = findViewById(R.id.lblTextoArtista);
        spinner = findViewById(R.id.spinner);
        imagem = findViewById(R.id.imagem);

        //3) Criando um ArrayList
        ArrayList<String> listinha = new ArrayList<String>();

        //4) Adicionando valores na lista
        listinha.add("Bruno Mars");
        listinha.add("Lana Del Rey");
        listinha.add("Sabrina Carpenter");
        listinha.add("Pitty");

        // 5) Adaptando a lista para ela ser usada no layout
        ArrayAdapter<String> adaptador =
                     new ArrayAdapter<String>(MainActivity.this,
                                   android.R.layout.simple_list_item_1,
                                    listinha);

        // 6) Inserindo a lista adaptada no spinner
        spinner.setAdapter(adaptador);

    }
}