package com.exemplo.designpatterns.abstractfactory;

public class FlatTextBox extends TextBox {
    @Override
    public void render() {
        System.out.println("FlatTextBox renderizado.");
    }
}
