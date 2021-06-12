package com.designpatterns.observer.entidade;

public class SensorDeFechamentoDeComporta extends SensorDeComporta {

    private Double nivelDeFechamentoEmMetros;

    public Double getNivelDeFechamentoEmMetros() {
        return nivelDeFechamentoEmMetros;
    }

    public void setNivelDeFechamentoEmMetros(Double nivelDeFechamentoEmMetros) {
        this.nivelDeFechamentoEmMetros = nivelDeFechamentoEmMetros;
    }

    @Override
    public void update() {
        super.setNivelAtualEmMetros(super.getSensorDeNivelDeAgua().getNivelEmMetros());

        if (this.getNivelAtualEmMetros() <= this.getNivelDeFechamentoEmMetros()) {
            System.out.println("Fechando a comporta da barragem...");
        }
    }
}
