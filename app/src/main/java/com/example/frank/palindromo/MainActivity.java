package com.example.frank.palindromo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.frank.palindromo.domain.Palindromo;
import com.example.frank.palindromo.domain.PalindromoK;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btVerificar = (Button) findViewById(R.id.bt_verificar);
        btVerificar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText ehPalindromo = (EditText) findViewById(R.id.eh_palindromo);
        TextView tvResposta = (TextView) findViewById(R.id.tv_resposta);
        //Palindromo palindromo = new Palindromo(ehPalindromo.getText().toString());
        PalindromoK palindromo = new PalindromoK(ehPalindromo.getText().toString());
        String resposta;

        if (palindromo.ehPalindromo()){
            resposta = " É um palíndromo";
        }
        else {
            resposta = " NÃO é um palíndromo";
        }
        resposta = palindromo.getConteudo() + resposta;
        tvResposta.setText(resposta);
    }
}
