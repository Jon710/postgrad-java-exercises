package com.exemplo.biblioteca;

import com.exemplo.biblioteca.negocio.entidade.Autor;
import com.exemplo.biblioteca.negocio.entidade.Categoria;
import com.exemplo.biblioteca.negocio.entidade.Editora;
import com.exemplo.biblioteca.negocio.entidade.Livro;
import com.exemplo.biblioteca.util.ImpressoraHtml;
import com.exemplo.biblioteca.util.ImpressoraTexto;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n>>> Aplicativo compilando e rodando. :)");
        System.out.println("PS: eu estou falando isso para você da classe Main.");

        Livro livro = new Livro("111-111222333", "Livro Teste", 2021L,
                new Categoria(), new Editora(), new Autor());

        System.out.println(new ImpressoraTexto().imprimir(livro));
        System.out.println(new ImpressoraHtml().imprimir(livro));
    }
}
