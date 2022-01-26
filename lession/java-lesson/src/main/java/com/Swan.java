package com;

public class Swan {

    protected String text = "new text";

    protected void getText() {
        System.out.println(text);
    }

    private void changeSom() {
        Swan swan = new Swan();
        swan.text = "lorem";
        swan.getText();
    }
}
