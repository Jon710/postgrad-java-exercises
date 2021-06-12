package com.avaliacao.factory;

public class PizzariaFachada {
    public void comprar(String _tipo) {
        Pizza p = PizzaFactory.getPizza(_tipo);
        p.preparar();
        p.embalar();
        p.entregar();
    }
}
