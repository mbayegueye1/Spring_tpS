package com.Digi.SpringTP1.controleurVilles;

import com.Digi.SpringTP1.data.Ville;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/villes")
public class VilleControleur {
    ArrayList<Ville> listvilles = new ArrayList<>();

    public VilleControleur() {

        listvilles.add(new Ville(1, "Montpellier"));
        listvilles.add(new Ville(2, "Paris"));
        listvilles.add(new Ville(3, "Besancon"));
        listvilles.add(new Ville(4, "Marseille"));

    }

    @GetMapping
    public ArrayList<Ville> getVilles() {
        return listvilles;
    }

    @GetMapping("/{id}")
    public Ville getIdVille(@PathVariable int id) {
        for (Ville VilleTrouvee : listvilles) {
            if (VilleTrouvee.getId() == id) {
                return VilleTrouvee;
            }
        }
        return null;
    }

    @PutMapping
    public String insererVille(@RequestBody Ville nvVille) {
        if (!listvilles.contains((nvVille.getId()))) {
            listvilles.add(nvVille);
            return "Succus creat ville";
        }
        return "ville existe";
    }

    @GetMapping("/{id}/modifier")
    public Ville getIdmodifier(@PathVariable int id) {
        return listvilles.remove(id);
    }

}

