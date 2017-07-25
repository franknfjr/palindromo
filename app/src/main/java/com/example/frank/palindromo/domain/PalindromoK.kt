package com.example.frank.palindromo.domain

/**
 * Created by Frank on 25/07/2017.
 */
class PalindromoK( var _conteudo: String ) {
    val conteudo: String = _conteudo
        get(){
            return field.toLowerCase()
        }

    fun ehPalindromo() : Boolean{
        return conteudo == conteudo.reversed()
    }
}