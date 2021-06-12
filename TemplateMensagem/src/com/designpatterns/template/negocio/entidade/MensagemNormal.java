package com.designpatterns.template.negocio.entidade;

public class MensagemNormal extends Mensagem {
    @Override
    protected String parte(Integer _pontos) {

        String parte = "abaixo do esperado. Tente novamente.";

        if (_pontos >= 5 && _pontos <= 7) {
            parte = "regular. Você pode fazer mais.";
        } else if (_pontos >= 8 && _pontos <= 9) {
            parte = "muito bom! Mais um pouco e você chega no topo!";
        } else if (_pontos == 10) {
            parte = "excepcional! Você é um dos melhores.";
        }

        return parte;
    }
}
