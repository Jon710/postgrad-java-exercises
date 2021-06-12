package com.avaliacao.maternidade.negocio.entidade;

import java.util.Collection;
import java.util.Date;

public class Parto {
    private Long id;
    private Date inicio;
    private Date termino;
    private Boolean complicado;

    private Collection<Alocacao> alocacoes;

    public void adicionarAlocacao(Alocacao _alocacao) {
        this.alocacoes.add(_alocacao);
    }

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

    public Boolean getComplicado() {
        return complicado;
    }

    public void setComplicado(Boolean complicado) {
        this.complicado = complicado;
    }
}
