package com.designpatterns.observer.entidade;

import java.util.ArrayList;
import java.util.Collection;

public abstract class SensorDeLeitura {

    private Collection<SensorDeAtuacao> sensoresDeAtuacao = new ArrayList<>();

    public Collection<SensorDeAtuacao> getSensoresDeAtuacao() {
        return sensoresDeAtuacao;
    }

    public void setSensoresDeAtuacao(Collection<SensorDeAtuacao> sensoresDeAtuacao) {
        this.sensoresDeAtuacao = sensoresDeAtuacao;
    }

    public void attach(SensorDeAtuacao _o) {
        this.getSensoresDeAtuacao().add(_o);
    }

    public void dettach(SensorDeAtuacao _o) {
        this.getSensoresDeAtuacao().remove(_o);
    }

    public void notify_() {
        for (SensorDeAtuacao sa: this.getSensoresDeAtuacao()) {
            sa.update();
        }
    }
}
