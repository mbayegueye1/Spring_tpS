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


    public void insert(Ville nomVille) {
        em.persist(nomVille);
    }


    public List<Ville> extractById(long id) {
        TypedQuery<Ville> query = em.createQuery("SELECT v FROM Ville v WHERE v.id = :id", Ville.class);
        query.setParameter("id", id);
        return query.getResultList();
    }


    public List<Ville> extractByNom(String nom) {
        TypedQuery<Ville> query = em.createQuery("SELECT v FROM Ville v WHERE v.nom = :nom", Ville.class);
        query.setParameter("nom", nom);
        return query.getResultList();
    }


    public void modifierVille(long id, Ville newnom) {
        Ville ville = em.find(Ville.class, id);
        if (ville != null) {
            ville.setNomVille(newnom.getNomVille());
        }
    }


    public void supprimerVille(String nomVille) {
        Ville ville = em.find(Ville.class, nomVille);
        if (ville != null) {
            em.remove(ville);
        }
    }
}
