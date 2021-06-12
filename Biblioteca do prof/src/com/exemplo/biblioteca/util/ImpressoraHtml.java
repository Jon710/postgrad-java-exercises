package com.exemplo.biblioteca.util;

import com.exemplo.biblioteca.negocio.entidade.Livro;

public class ImpressoraHtml extends Impressora {

    @Override
    public String imprimir(Livro _livro) {
        return "<html><body><h1>Título: " + _livro.getTitulo() + "</h1></body></html>";
    }
}