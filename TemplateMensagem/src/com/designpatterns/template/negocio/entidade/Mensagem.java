package com.designpatterns.template.negocio.entidade;

public abstract class Mensagem {

    public String completa(Integer _pontos) {
        return "Você fez " + _pontos + " pontos. Seu resultado é " + this.parte(_pontos);
    }

    protected abstract String parte(Integer _pontos);
}
