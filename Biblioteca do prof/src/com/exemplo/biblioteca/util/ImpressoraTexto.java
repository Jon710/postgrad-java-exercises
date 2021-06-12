package com.exemplo.biblioteca.util;

import com.exemplo.biblioteca.negocio.entidade.Livro;

public class ImpressoraTexto extends Impressora {

    @Override
    public String imprimir(Livro _livro) {
         return "Título: " + _livro.getTitulo();
    }
}