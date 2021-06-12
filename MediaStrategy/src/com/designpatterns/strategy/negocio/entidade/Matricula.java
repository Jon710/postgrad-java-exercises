package com.designpatterns.strategy.negocio.entidade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Matricula {

    private Long id;
    private Date inicio;
    private Date termino;

    private Aluno aluno;
    private Curso curso;
    private Collection<Prova> provas = new ArrayList<>();


    private MediaStrategy mediaStrategy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getTermino() {
        return termino;
    }

    public void setTermino(Date termino) {
        this.termino = termino;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Collection<Prova> getProvas() {
        return provas;
    }

    public void setProvas(Collection<Prova> provas) {
        this.provas = provas;
    }

    public MediaStrategy getMediaStrategy() {
        return mediaStrategy;
    }

    public void setMediaStrategy(MediaStrategy mediaStrategy) {
        this.mediaStrategy = mediaStrategy;
    }

    public Double calcularMedia() {
        return this.mediaStrategy.perform(this.provas);
    }
}
