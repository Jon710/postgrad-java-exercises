package com.designpatterns.strategy.negocio.entidade;

import java.util.Collection;

public abstract class MediaStrategy {

    public abstract Double perform(Collection<Prova> _provas);

}
