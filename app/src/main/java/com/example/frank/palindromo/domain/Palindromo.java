package com.example.frank.palindromo.domain;

/**
 * Created by Frank on 25/07/2017.
 */

public class Palindromo {
    private String conteudo;

    public Palindromo(String conteudo) {
        this.conteudo = conteudo;
    }

    public boolean ehPalindromo(){
        String invertido = new StringBuilder(conteudo).reverse().toString();
        return invertido.equalsIgnoreCase(conteudo);
    }

    public String getConteudo() {
        return conteudo.toLowerCase();
    }
}
