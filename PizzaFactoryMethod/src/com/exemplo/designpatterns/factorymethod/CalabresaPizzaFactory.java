package com.exemplo.designpatterns.factorymethod;

public class CalabresaPizzaFactory extends PizzaFactory {

    @Override
    public Pizza create() {
        return new CalabresaPizza();
    }
}
