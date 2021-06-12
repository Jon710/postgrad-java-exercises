package com.avaliacao.factory;

public class Main {

    public static void main(String[] args) {
        new PizzariaFachada().comprar("marguerita");
        new PizzariaFachada().comprar("calabresa");
        new PizzariaFachada().comprar("frango");
    }
}
