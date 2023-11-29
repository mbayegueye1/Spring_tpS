package com.Digi.SpringTP1.repository;

import com.Digi.SpringTP1.data.Ville;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public interface VilleRepository extends CrudRepository<Ville, Integer> {
    Ville findByNomVille(String nomVille);


}
