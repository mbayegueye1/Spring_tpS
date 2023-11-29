package com.Digi.SpringTP1.controleurVilles;

import com.Digi.SpringTP1.data.Ville;
import com.Digi.SpringTP1.exception.ExceptionError;
import com.Digi.SpringTP1.repository.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v2/villes")
public class VilleControlleurRepository {
    @Autowired
    private VilleRepository villeRepository;

    @GetMapping
    public Iterable<Ville> getAll()  throws ExceptionError{
        Iterable<Ville> villes = villeRepository.findAll();
        return villes;
    }

    @GetMapping("/{id}")
    public Ville getVilleById(@PathVariable int id){
        Ville ville = villeRepository.findById(id).get();
        return ville;
    }
}
