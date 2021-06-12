package com.exemplo.designpatterns.module;

import com.exemplo.designpatterns.abstractfactory.SkinSingletonFactory;

public class UbuntoModuleClient {

    public void renderInteface() {

        SkinSingletonFactory.getInstance().createButton().render();
        SkinSingletonFactory.getInstance().createTextBox().render();

    }
}
