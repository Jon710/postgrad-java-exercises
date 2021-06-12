package com.exemplo.designpatterns.factorymethod;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

public abstract class PizzaFactory {

    private static Map<String, PizzaFactory> factories;

    static {
        factories = new HashMap<>();
        factories.put("marguerita", new MargueritaPizzaFactory());
        factories.put("calabresa",  new CalabresaPizzaFactory());
    }

    public abstract Pizza create();

    public static Pizza getPizza(String _tipo) {

        if (!factories.containsKey(_tipo)) {
            throw new IllegalArgumentException("Tipo de pizza não suportado.");
        }

        return factories.get(_tipo).create();
    }
}
