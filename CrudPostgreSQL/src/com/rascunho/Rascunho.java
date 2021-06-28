package com.rascunho;

public class Rascunho {

    private String text;

    public Rascunho() {
    }

    public Rascunho(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Rascunho{" +
                "text='" + text + '\'' +
                '}';
    }
}
