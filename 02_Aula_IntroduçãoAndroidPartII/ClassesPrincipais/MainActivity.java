package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    //1) Atributos
    Button btnAumentar, btnSair, btnLimpar;
    EditText txtNome,txtSalario,txtCargo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //'Linkar' os elementos do layout com o Java
        txtNome = (EditText) findViewById(R.id.txtNome);
        txtCargo = (EditText) findViewById(R.id.txtCargo);
        txtSalario = (EditText) findViewById(R.id.txtSalario);
        btnAumentar = (Button) findViewById(R.id.btnAumentar);
        btnLimpar = (Button) findViewById(R.id.btnLimpar);
        btnSair = (Button) findViewById(R.id.btnSair);

        //3 Criando o evento do butao1
        btnAumentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                //4) recuperando valores
                String nome = txtNome.getText().toString();
                String cargo = txtCargo.getText().toString();
                double salario = Double.parseDouble(
                             txtSalario.getText().toString());

                //5) aumentando salario do mano ai em 15%
                double valorfinal = salario + (salario * 0.15);

                //6) Variável para mostrar a mens final
                String mens = "Olá Meu fofo :) \n " +
                        "Nome: " + nome + "\n" +
                        "Cargo: " + cargo + "\n" +
                        "Salário Antigo:" + salario +"\n" +
                        "Salário Atual:" + valorfinal;

                //7) Toast - Notificação fofinha

                Toast.makeText(MainActivity.this,
                        mens,
                        Toast.LENGTH_LONG).show();
            }
        }); // btnAumentar

        // 8) Evento do btnLimpar
        btnLimpar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                // 9) Limpando os campos
                txtSalario.setText("");
                txtCargo.setText("");
                txtNome.setText("");
            }
        }); // btnLimpar

        //10) evento btnSair
        btnSair.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Mensagem para o usuário
                Toast.makeText(MainActivity.this,
                              "Adeus, meu querido!!!",
                                 Toast.LENGTH_LONG).show();

                // Finalizar as activities
                finishAffinity();

                //Encerra todos os processor
                System.exit(0);

            }
        }); //btnSair

        // Evento clique longo btnAumentar
        btnAumentar.setOnLongClickListener(new View.OnLongClickListener()
        {
            @Override
            public boolean onLongClick(View view)
            {
                // Mensagem de teste
                Toast.makeText(MainActivity.this,
                               "Pare de clicar ai, OTÁRIO!!!",
                                Toast.LENGTH_LONG).show();
                return true;
            }
        }); //btnAumentarLong


    }
}