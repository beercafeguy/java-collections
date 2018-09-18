package com.beercafeguy.java.collection;

public class MoofCorrected {
    private int id;

    public MoofCorrected(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MoofCorrected && ((MoofCorrected)obj).getId() == this.getId())
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return id%10;
    }

    @Override
    public String toString() {
        return "Moof{" +
                "id=" + id +
                '}';
    }
}
