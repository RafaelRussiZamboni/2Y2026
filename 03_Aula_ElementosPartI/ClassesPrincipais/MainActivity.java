package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    // 1) Atributos
    Button btnEsquerda, btnDireita;
    ImageView img;
    String nomeFoto = "";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2)  'Linkando' os elementos do layout com a programação
        btnDireita = (Button) findViewById(R.id.btnDireita);
        btnEsquerda = (Button) findViewById(R.id.btnEsquerda);
        img = (ImageView) findViewById(R.id.img);

        // 3) Evento btnDireita
        btnDireita.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(nomeFoto.equals(""))
                {
                    img.setImageResource(R.drawable.malmsteen);
                    nomeFoto = "malmsteen";
                }
                if(nomeFoto.equals("malmsteen"))
                {
                    img.setImageResource(R.drawable.rush);
                    nomeFoto = "rush";
                }
                if(nomeFoto.equals("rush"))
                {
                    img.setImageResource(R.drawable.teste);
                    nomeFoto = "teste";
                }
                if(nomeFoto.equals("teste"))
                {
                    img.setImageResource(R.drawable.ic_launcher_foreground);
                    nomeFoto = "";
                }






            }
        });

        //5) Evento btnEsquerda
        btnEsquerda.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                img.setImageResource(R.drawable.rush);
            }
        });

        //6) Configurando clique longo no ImageView
        img.setOnLongClickListener(new View.OnLongClickListener()
        {
            @Override
            public boolean onLongClick(View view)
            {
                img.setImageResource(R.drawable.teste);
                return true;
            }
        });


    }
}