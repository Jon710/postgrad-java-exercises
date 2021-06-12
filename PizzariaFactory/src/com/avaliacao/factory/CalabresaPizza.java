package com.avaliacao.factory;

public class CalabresaPizza extends Pizza {
    @Override
    public void preparar() {
        System.out.println("Preparando a pizza calabresa...");
    }
}
