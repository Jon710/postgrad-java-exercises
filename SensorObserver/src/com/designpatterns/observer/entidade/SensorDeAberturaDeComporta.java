package com.designpatterns.observer.entidade;

public class SensorDeAberturaDeComporta extends SensorDeComporta {

    private Double nivelDeAberturaEmMetros;

    public Double getNivelDeAberturaEmMetros() {
        return nivelDeAberturaEmMetros;
    }

    public void setNivelDeAberturaEmMetros(Double nivelDeAberturaEmMetros) {
        this.nivelDeAberturaEmMetros = nivelDeAberturaEmMetros;
    }

    @Override
    public void update() {
        super.setNivelAtualEmMetros(super.getSensorDeNivelDeAgua().getNivelEmMetros());

        if (this.getNivelAtualEmMetros() >= this.getNivelDeAberturaEmMetros()) {
            System.out.println("Abrindo a comporta da barragem...");
        }
    }
}
