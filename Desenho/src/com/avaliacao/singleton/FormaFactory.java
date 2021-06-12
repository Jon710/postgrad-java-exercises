package com.avaliacao.singleton;

import java.security.InvalidParameterException;

public interface FormaFactory {

    Forma create();

     static Forma getForma(String _tipo) {
        if ("quadrado".equals(_tipo)) {
            return new QuadradoFormaFactory().create();
        } else if ("circulo".equals(_tipo)) {
            return new CirculoFormaFactory().create();
        } else {
            throw new InvalidParameterException("Forma não suportada!");
        }
    }
}
