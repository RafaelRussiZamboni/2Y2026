package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    //1) Atributos
    EditText txtProduto,txtValor;
    SeekBar seekBar;
    Switch swDesconto;
    TextView lblValorSeekBar;
    Button btnResultado;

    //Valor da seekbar
    int valorDaBarra = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2) Iniciando os elementos
        txtProduto = (EditText) findViewById(R.id.txtProduto);
        txtValor = (EditText) findViewById(R.id.txtValor);
        lblValorSeekBar = (TextView) findViewById(R.id.lblValorSeekBar);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        swDesconto = (Switch) findViewById(R.id.swDesconto);
        btnResultado = (Button) findViewById(R.id.btnResultado);

        //3) Deixando a barra desabilitada
        seekBar.setActivated(false);

        //4) Limitando o valor da seekbar
        seekBar.setMax(45);
        seekBar.setMin(10);

        //5) Evento do switch
        swDesconto.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
                seekBar.setActivated(true);
            }
        });





        //6) Evento da barra
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int posicao, boolean b)
            {
                //Atualizando valor
                valorDaBarra = posicao;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {
                //Atualizando o valor na telinha
                lblValorSeekBar.setText(valorDaBarra + " %");
            }
        });









    }
}