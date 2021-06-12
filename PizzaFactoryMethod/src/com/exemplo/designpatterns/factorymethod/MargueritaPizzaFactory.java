package com.exemplo.designpatterns.factorymethod;

public class MargueritaPizzaFactory extends PizzaFactory {

    @Override
    public Pizza create() {
        return new MargueritaPizza();
    }
}
