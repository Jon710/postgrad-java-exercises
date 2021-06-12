package com.exemplo.designpatterns.abstractfactory;

public class DarkTextBox extends TextBox {
    @Override
    public void render() {
        System.out.println("DarkTextBox renderizado!");
    }
}
