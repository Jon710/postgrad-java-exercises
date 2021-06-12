package com.avaliacao.singleton;

public class CirculoFormaFactory implements FormaFactory {

    @Override
    public Forma create() {
        return new CirculoForma();
    }
}
