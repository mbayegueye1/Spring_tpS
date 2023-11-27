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
        for(Ville villeajoute  :listvilles) {
            if (villeajoute.getId() == nvVille.getId()) {
                return "ville existe";
            }
        }
        listvilles.add(nvVille);
        return "ville ajouté";
    }
    @PostMapping("/{id}")
    public String villeModifier(@PathVariable long id, @RequestBody Ville ville) {
        for (Ville v : listvilles) {
            if (v.getId() == id) {
                v.setNomVille(ville.getNomVille());
                return "modif ok";

            }
        }
        return null;
    }
    @DeleteMapping ("/{id}")
    public Ville deleteId(@PathVariable int id) {
        for (Ville v : listvilles) {
            if (v.getId() == id) {
                return listvilles.remove(id);

            }

    }
        return null;

}


}

