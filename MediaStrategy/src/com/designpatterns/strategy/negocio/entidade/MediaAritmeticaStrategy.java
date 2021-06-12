package com.designpatterns.strategy.negocio.entidade;

import java.util.Collection;

public class MediaAritmeticaStrategy extends MediaStrategy {
    @Override
    public Double perform(Collection<Prova> _provas) {

        Double somatorioDasNotas = 0.0;

        for (Prova p: _provas) {
            somatorioDasNotas += p.getNota();
        }

        return somatorioDasNotas / _provas.size();
    }
}
