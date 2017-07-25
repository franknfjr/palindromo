package com.example.frank.palindromo

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.frank.palindromo.R.id.bt_verificar
import com.example.frank.palindromo.domain.PalindromoK
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Frank on 25/07/2017.
 */
class MainActivityK : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        bt_verificar.setOnClickListener (this)
    }
    override fun onClick(view: View?){
        val palindromo = PalindromoK(eh_palindromo.text.toString())
        var resposta: String

        resposta = if(palindromo.ehPalindromo())
            " é um palíndromo"
            else
            " NÃO é um palindromo"

        resposta = palindromo.conteudo + resposta
        tv_resposta.text = resposta
    }
}