package com.exemplo.designpatterns.abstractfactory;

public class FlatSkinSingletonFactory extends SkinSingletonFactory {



    @Override
    public Button createButton() {
        return new FlatButton();
    }

    @Override
    public TextBox createTextBox() {
        return new FlatTextBox();
    }
}
