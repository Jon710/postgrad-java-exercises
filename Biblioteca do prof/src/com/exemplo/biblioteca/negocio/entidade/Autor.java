package com.exemplo.biblioteca.negocio.entidade;

import java.util.ArrayList;
import java.util.Collection;

public class Autor {
    private Nacionalidade nacionalidade;
    private Collection<Livro> livros = new ArrayList<>();

    public Collection<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Collection<Livro> _livros) {
        this.livros = _livros;
    }
}
