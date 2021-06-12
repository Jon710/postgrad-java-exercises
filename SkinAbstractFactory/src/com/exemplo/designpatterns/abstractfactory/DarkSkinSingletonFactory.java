package com.exemplo.designpatterns.abstractfactory;

public class DarkSkinSingletonFactory extends SkinSingletonFactory {


    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextBox createTextBox() {
        return new DarkTextBox();
    }
}
