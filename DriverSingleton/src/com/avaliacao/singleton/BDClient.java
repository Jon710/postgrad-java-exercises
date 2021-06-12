package com.avaliacao.singleton;

public class BDClient {

    public static void main(String[] args) {
        System.out.println("O driver de configuração é: " + DriverSingleton.getInstance().getParametroDeConfiguracao());
    }
}
