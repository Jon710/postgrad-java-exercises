package com.designpatterns.template;

import com.designpatterns.template.negocio.entidade.MensagemNormal;

public class Main {

    public static void main(String[] args) {
        System.out.println(new MensagemNormal().completa(3));
    }
}
