package com.designpatterns.strategy.negocio.entidade;

import java.util.ArrayList;
import java.util.Collection;

public class Curso {

    private Long id;
    private String nome;
    private String descricao;

    private Collection<Matricula> matriculas = new ArrayList<>();

    public Collection<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(Collection<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
