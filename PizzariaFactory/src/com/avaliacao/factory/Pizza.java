package com.avaliacao.factory;

public abstract class Pizza {
    public abstract void preparar();

    public void embalar() {
        System.out.println("Embalando a pizza...");
    }

    public void entregar() {
        System.out.println("Entregando a pizza...");
    }
}
