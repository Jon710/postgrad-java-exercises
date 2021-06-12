package com.designpatterns.strategy.negocio.entidade;

public class Prova {

    private Double nota;
    private Matricula matricula;

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
