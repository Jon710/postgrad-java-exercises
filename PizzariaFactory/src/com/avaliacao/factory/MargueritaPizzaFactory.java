package com.avaliacao.factory;

public class MargueritaPizzaFactory extends PizzaFactory {


    @Override
    public Pizza create() {
        return new MargueritaPizza();
    }
}
