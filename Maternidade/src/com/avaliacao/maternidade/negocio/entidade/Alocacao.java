package com.avaliacao.maternidade.negocio.entidade;

public class Alocacao {
    private Long duracaoMinutos;

    private Parto parto;
    private Medico medico;

    public Long getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(Long duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}
