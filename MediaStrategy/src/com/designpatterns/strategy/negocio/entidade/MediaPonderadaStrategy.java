package com.designpatterns.strategy.negocio.entidade;

import java.util.Collection;

public class MediaPonderadaStrategy extends MediaStrategy {
    @Override
    public Double perform(Collection<Prova> _provas) {

        if (_provas == null || _provas.size() < 3) {
            throw new IllegalArgumentException("Para calcular a média ponderada são necessários pelo menos 3 provas.");
        }

        // Cálculo da média ponderada

        return 0.0;
    }
}
