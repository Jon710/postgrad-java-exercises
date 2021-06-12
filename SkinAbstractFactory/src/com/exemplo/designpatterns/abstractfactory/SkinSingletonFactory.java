package com.exemplo.designpatterns.abstractfactory;

public abstract class SkinSingletonFactory {

    private static SkinSingletonFactory sf;

    public abstract Button createButton();
    public abstract TextBox createTextBox();

    SkinSingletonFactory() {

    }

    public static SkinSingletonFactory getInstance() {

        if (sf == null) {
            // Aqui seria lido de um arquivo de confifuração,
            // variável de ambiente, injeção de independência, etc.
            sf = new DarkSkinSingletonFactory();
        }

        return sf;
    }
}
