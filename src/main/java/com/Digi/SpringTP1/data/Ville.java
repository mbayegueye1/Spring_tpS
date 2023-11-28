package com.Digi.SpringTP1.data;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Ville  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="NOM")
    private String nomVille;



    public Ville() {
    }

    public Ville( String nomVille) {

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

