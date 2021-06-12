package com.designpatterns.observer.entidade;

public abstract class SensorDeComporta extends SensorDeAtuacao {

    private Double nivelAtualEmMetros;
    private SensorDeNivelDeAgua sensorDeNivelDeAgua;

    public Double getNivelAtualEmMetros() {
        return nivelAtualEmMetros;
    }

    public void setNivelAtualEmMetros(Double nivelAtualEmMetros) {
        this.nivelAtualEmMetros = nivelAtualEmMetros;
    }

    public SensorDeNivelDeAgua getSensorDeNivelDeAgua() {
        return sensorDeNivelDeAgua;
    }

    public void setSensorDeNivelDeAgua(SensorDeNivelDeAgua sensorDeNivelDeAgua) {
        this.sensorDeNivelDeAgua = sensorDeNivelDeAgua;
    }
}
