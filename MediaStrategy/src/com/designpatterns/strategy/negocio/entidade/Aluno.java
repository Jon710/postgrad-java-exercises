package com.designpatterns.strategy.negocio.entidade;

import java.util.ArrayList;
import java.util.Collection;

public class Aluno {
    private Long id;
    private String ra;
    private String nome;

    private Collection<Matricula> matriculas = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
