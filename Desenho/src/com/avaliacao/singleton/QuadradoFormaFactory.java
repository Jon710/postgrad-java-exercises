package com.avaliacao.singleton;

public class QuadradoFormaFactory implements FormaFactory {
    @Override
    public Forma create() {
        return new QuadradoForma();
    }
}
