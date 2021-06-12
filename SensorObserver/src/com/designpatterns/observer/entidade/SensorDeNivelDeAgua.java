package com.designpatterns.observer.entidade;

public class SensorDeNivelDeAgua extends SensorDeLeitura {

    private Double nivelEmMetros;

    public Double getNivelEmMetros() {
        return nivelEmMetros;
    }

    public void setNivelEmMetros(Double nivelEmMetros) {
        this.nivelEmMetros = nivelEmMetros;
        super.notify_();
    }
}
