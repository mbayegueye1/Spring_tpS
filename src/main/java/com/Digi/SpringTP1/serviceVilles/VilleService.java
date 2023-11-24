package com.Digi.SpringTP1.serviceVilles;

import com.Digi.SpringTP1.data.Ville;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VilleService {
    public VilleService() {
    }
    public List<Ville> getAllUsers(){
        List<Ville> villes = new ArrayList();
        villes.add(new Ville("Montpellier"));
        villes.add(new Ville("Paris"));
        villes.add(new Ville("Besancon"));
        return villes;

    }

}
