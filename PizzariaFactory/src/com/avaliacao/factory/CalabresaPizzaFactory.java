package com.avaliacao.factory;

public class CalabresaPizzaFactory extends PizzaFactory {
    @Override
    public Pizza create() {
        return new CalabresaPizza();
    }
}
