package com.Digi.SpringTP1.serviceVilles;

import com.Digi.SpringTP1.data.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class VilleService {

    @Autowired
    private EntityManager em;


    public List<Ville> extractAll() {

        TypedQuery<Ville> query = em.createQuery("SELECT v FROM Ville v", Ville.class);
        return query.getResultList();
    }

    @Transactional
    public void insert(Ville nomVille) {
        em.persist(nomVille);
    }

    @Transactional
    public List<Ville> extractById(int id) {

        TypedQuery<Ville> query = em.createQuery("SELECT v FROM Ville v WHERE v.id = :id", Ville.class);
        query.setParameter("id", id);
        return query.getResultList();
    }

    @Transactional
    public List<Ville> extractByNom(String nomVille) {
        TypedQuery<Ville> query = em.createQuery("SELECT v FROM Ville v WHERE v.nom = "+nomVille+"'", Ville.class);
        query.setParameter("nom", nomVille);
        return query.getResultList();
    }

    @Transactional
    public void modifierVille(long id, Ville newnom) {
        Ville ville = em.find(Ville.class, id);
        if (ville != null) {
            ville.setNomVille(newnom.getNomVille());
        }
    }

    @Transactional
    public void supprimerVille(String nomVille) {
        Ville ville = em.find(Ville.class, nomVille);
        if (ville != null) {
            em.remove(ville);
        }
    }

    /*@Transactional
    public void List<Departement> extrairVilleDept(Ville ville){
        TypedQuery<Departement> query = em.createQuery("SELECT v FROM Ville v", Departement.class);
        return query.getResultList()
    }*/

}
