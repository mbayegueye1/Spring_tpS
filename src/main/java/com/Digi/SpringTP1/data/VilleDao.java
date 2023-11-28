package com.Digi.SpringTP1.data;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;

import java.sql.Statement;
import java.util.List;

@Component
public class VilleDao {
    @PersistenceContext
    private EntityManager em;

    /*private void initilizer(){
        em.getTransaction().begin();
        Ville ville1 = new Ville("Montpellier");
        Ville ville2 = new Ville("Paris");
        Ville ville3 = new Ville("Paris");
        Ville ville4 = new Ville("Paris");
        em.persist(ville1);
        em.persist(ville2);
        em.persist(ville3);
        em.persist(ville4);
        em.getTransaction().commit();
        em.close();
    }*/
   /* public List<Ville> extractAll(){

        TypedQuery<Ville> query = em.createQuery("SELECT v FROM Ville v", Ville.class);
        return query.getResultList();
    }
    public void insert(Ville nvVille){

        em.persist(nvVille);
    }

*/


}
