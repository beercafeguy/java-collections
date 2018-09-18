package com.beercafeguy.java.collection;

public class Moof {
    private int id;

    public Moof(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Moof{" +
                "id=" + id +
                '}';
    }
}
