package com.exemplo.biblioteca.negocio.entidade;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Livro {

    private Long   id;
    private String isbn;
    private String titulo;
    private Long   ano;

    private Editora              editora;
    private Categoria            categoria;
    private Collection<Autor>    autores     = new ArrayList<>();
    private Collection<Exemplar> exemplares  = new ArrayList<>();

    public Livro(String _isbn, String _titulo, Long _ano,
                 Categoria _categoria, Editora _editora,
                 Collection<Autor> _autores) {

        this.setIsbn(_isbn);
        this.setTitulo(_titulo);
        this.setAno(_ano);

        this.setCategoria(_categoria);
        _categoria.addLivro(this);

        this.setEditora(_editora);
        _editora.getLivros().add(this);

        this.setAutores(_autores);

        for (Autor autor: _autores) {
            autor.getLivros().add(this);
        }
    }

    public Livro(String _isbn, String _titulo, Long _ano,
                 Categoria _categoria, Editora _editora, Autor _autor) {

        this.setIsbn(_isbn);
        this.setTitulo(_titulo);
        this.setAno(_ano);
        this.setCategoria(_categoria);
        this.setEditora(_editora);
        this.getAutores().add(_autor);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long _id) {

        if (_id == null) {
            throw new InvalidParameterException("O id do livro não pode ser nulo.");
        }

        this.id = _id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String _isbn) {

        if (_isbn == null || _isbn.trim().equals("")) {
            throw new InvalidParameterException("O ISBN do livro não pode ser nulo.");
        }

        this.isbn = _isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String _titulo) {

        if (_titulo == null || _titulo.trim().equals("")) {
            throw new InvalidParameterException("O título do livro não pode ser nulo.");
        }

        this.titulo = _titulo;
    }

    public Long getAno() {
        return ano;
    }

    public void setAno(Long _ano) {

        if (_ano == null ) {
            throw new InvalidParameterException("O ano do livro não pode ser nulo.");
        }

        if (_ano < 1455L) {
            throw new InvalidParameterException("O ano do livro não pode ser menor que 1455 " +
                    "(ano do primeiro livro impresso).");
        }

        this.ano = _ano;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora _editora) {

        if (_editora == null) {
            throw new InvalidParameterException("A editora do livro não pode ser nula.");
        }

        this.editora = _editora;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria _categoria) {

        if (_categoria == null) {
            throw new InvalidParameterException("A categoria do livro não pode ser nula.");
        }

        this.categoria = _categoria;
    }

    public Collection<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Collection<Autor> _autores) {

        if (_autores == null || _autores.size() == 0) {
            throw new InvalidParameterException("O livro deve ter pelo menos um autor.");
        }

        this.autores = _autores;
    }

    public Collection<Exemplar> getExemplares() {
        return exemplares;
    }

    public void setExemplares(Collection<Exemplar> _exemplares) {

        if (_exemplares == null || _exemplares.size() == 0) {
            throw new InvalidParameterException("O livro deve ter pelo menos um exemplar.");
        }

        this.exemplares = _exemplares;
    }
}
