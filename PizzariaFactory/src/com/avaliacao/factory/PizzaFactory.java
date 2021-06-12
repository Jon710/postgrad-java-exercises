package com.avaliacao.factory;

import java.security.InvalidParameterException;

public abstract class PizzaFactory {
    public abstract Pizza create();

    public static Pizza getPizza(String _tipo) {
        if ("marguerita".equals(_tipo)) {
            return new MargueritaPizzaFactory().create();
        } else if ("calabresa".equals(_tipo)) {
            return new CalabresaPizzaFactory().create();
        } else {
            throw new IllegalArgumentException("Tipo de pizza não suportado!");
        }
    }
}
