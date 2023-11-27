package com.Digi.SpringTP1.data;

import java.io.Serializable;

public class Ville  {
    private int id;
    private String nomVille;

    public Ville() {
    }

    public Ville(int id, String nomVille) {
        this.id = id;
        this.nomVille = nomVille;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "id=" + id +
                ", nomVille='" + nomVille + '\'' +
                '}';
    }
}

