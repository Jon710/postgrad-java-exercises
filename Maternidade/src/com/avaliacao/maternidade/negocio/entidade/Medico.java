package com.avaliacao.maternidade.negocio.entidade;

import java.util.Collection;

public class Medico {
    private Long    id;
    private String  CRM;
    private String  nome;
    private String  celular;
    private Double  valorHora;

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

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}
