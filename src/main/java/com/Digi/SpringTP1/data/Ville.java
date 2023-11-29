package com.Digi.SpringTP1.data;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "VILLE")
public class Ville implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nomVille;

    private int nbrHabitants;

    private String codeDept;
    /*@ManyToOne
    @JoinColumn(name = "idDept")*/
    /*private Departement departement;*/

    public Ville() {
    }

    /*public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
*/
    public Ville(String nomVille) {

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

    public int getNbrHabitants() {
        return nbrHabitants;
    }

    public String getCodeDept() {
        return codeDept;
    }

    public void setCodeDept(String codeDept) {
        this.codeDept = codeDept;
    }

    public void setNbrHabitants(int nbrHabitants) {
        this.nbrHabitants = nbrHabitants;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "id=" + id +
                ", nomVille='" + nomVille + '\'' +
                '}';
    }
}

