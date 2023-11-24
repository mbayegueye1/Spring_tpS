package com.Digi.SpringTP1.data;

import java.io.Serializable;
public class Ville implements Serializable{
    private String nomVille;
    public Ville() {
    }
    public Ville(String nomVille) {
        this.nomVille = nomVille;
    }
    public String getNomVille() {
        return nomVille;
    }
    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

}

