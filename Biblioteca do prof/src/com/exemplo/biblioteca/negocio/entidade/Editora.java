package com.exemplo.biblioteca.negocio.entidade;

import java.util.ArrayList;
import java.util.Collection;

public class Editora {

    private Collection<Livro> livros = new ArrayList<>();

    public Collection<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Collection<Livro> livros) {
        this.livros = livros;
    }
}
