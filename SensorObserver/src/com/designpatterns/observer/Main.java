package com.designpatterns.observer;

import com.designpatterns.observer.entidade.SensorDeAberturaDeComporta;
import com.designpatterns.observer.entidade.SensorDeFechamentoDeComporta;
import com.designpatterns.observer.entidade.SensorDeNivelDeAgua;

public class Main {

    public static void main(String[] args) {
        SensorDeNivelDeAgua sna = new SensorDeNivelDeAgua();
        SensorDeAberturaDeComporta sac = new SensorDeAberturaDeComporta();
        SensorDeFechamentoDeComporta sfc = new SensorDeFechamentoDeComporta();

        sac.setNivelDeAberturaEmMetros(150.0);
        sfc.setNivelDeFechamentoEmMetros(100.0);

        sna.attach(sac);
        sac.setSensorDeNivelDeAgua(sna);
        sna.attach(sfc);
        sfc.setSensorDeNivelDeAgua(sna);

        sna.setNivelEmMetros(130.0);
        sna.setNivelEmMetros(170.0);
        sna.setNivelEmMetros(90.0);
    }
}
