package com.home.models;

public class Rascunho {

    private Usuario user;
    private String title;
    private String text;

    public Rascunho() {
    }

    public Rascunho(Usuario user, String title, String text) {
        this.user = user;
        this.title = title;
        this.text = text;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
                "user=" + user +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
