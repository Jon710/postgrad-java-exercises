package com.exemplo.designpatterns.factorymethod;

public class MargueritaPizza extends Pizza {
    @Override
    public void preparar() {
        System.out.println("Preparando a pizza marguerita...");
    }
}
