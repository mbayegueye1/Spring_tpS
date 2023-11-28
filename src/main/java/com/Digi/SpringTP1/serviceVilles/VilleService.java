package com.Digi.SpringTP1.serviceVilles;

import com.Digi.SpringTP1.data.Ville;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VilleService {
    @PersistenceContext
    private EntityManager em;
    public List<Ville> extractAll(){

        TypedQuery<Ville> query = em.createQuery("SELECT v FROM Ville v WHERE v.id = :id", Ville.class);
        return query.getResultList();
    }
    public void insert(Ville nomVille){

        em.persist(nomVille);
    }
    public List<Ville> extratbyId(long id){
        TypedQuery<Ville> query2 = em.createQuery("SELECT v FROM Ville v", Ville.class);
        query2.setParameter("id", id);
        return query2.getResultList();
    }
    public List<Ville> extratbyNom(String nom){
        TypedQuery<Ville> query2 = em.createQuery("SELECT v FROM Ville v", Ville.class);
        query2.setParameter("nom", nom);
        return query2.getResultList();
    }

    public List<Ville> modifierVille(long id, Ville newnom){
        Query query3 = em.createQuery("UPDATE VILLE l SET l.nom= :newnom WHERE l.nom=:VILLE.nom");
        query3.setParameter("nom", newnom);
        query3.executeUpdate();
        return query3.getResultList();
    }

    public List<Ville> supprimerVille(Ville nomVille){
        Query query = em.createQuery("DELETE FROM VILLE v WHERE v.nom=:nomVille");
        query.setParameter("nom", "nomVille");
        query.executeUpdate();
        return query.getResultList();
    }



}
