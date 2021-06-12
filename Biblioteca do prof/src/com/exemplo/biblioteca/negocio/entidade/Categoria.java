package com.exemplo.biblioteca.negocio.entidade;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;

public class Categoria {

    private Collection<Livro> livros = new ArrayList<>();

    public Collection<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Collection<Livro> livros) {
        this.livros = livros;
    }

    public void addLivro(Livro _livro) {

        if (_livro == null) {
            throw new InvalidParameterException("O livro não pode ser nulo.");
        }

        this.getLivros().add(_livro);
    }
}


