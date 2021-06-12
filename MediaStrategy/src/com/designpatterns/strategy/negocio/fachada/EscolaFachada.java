package com.designpatterns.strategy.negocio.fachada;

import com.designpatterns.strategy.negocio.entidade.Matricula;

public class EscolaFachada {

    public static Double calcularMedia(Matricula _matricula) {
        return _matricula.calcularMedia();
    }
}
