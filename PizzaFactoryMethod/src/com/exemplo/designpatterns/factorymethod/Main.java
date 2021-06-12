package com.exemplo.designpatterns.factorymethod;

public class Main {

    public static void main(String[] args) {

        new PizzariaFachada().comprar("marguerita");
        new PizzariaFachada().comprar("calabresa");
        new PizzariaFachada().comprar("siciliana");
    }
}
