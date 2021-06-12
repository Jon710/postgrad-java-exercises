package com.avaliacao.singleton;

public class DesenhistaFachada {
    public void desenhar(String _tipo) {
        Forma f = FormaFactory.getForma(_tipo);
        f.desenhar();
    }
}
