package com.avaliacao.singleton;

public class DriverSingleton {
    private static DriverSingleton instance;

    private     String parametroDeConfiguracao;

    private DriverSingleton() {
        this.parametroDeConfiguracao = "driver-type:owx.cartagena.max=350";
    }

    public static DriverSingleton getInstance() {
        if (instance == null) {
            instance = new DriverSingleton();
        }

        return instance;
    }

    public String getParametroDeConfiguracao() {
        return this.parametroDeConfiguracao;
    }
}
