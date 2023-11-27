package com.Digi.SpringTP1.controleurVilles;

import com.Digi.SpringTP1.data.Ville;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;

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
    public ResponseEntity<String> insererVille(@RequestBody Ville nvVille) {
        for(Ville villeajoute  :listvilles) {
            if (villeajoute.getId() == nvVille.getId()) {
                return ResponseEntity.badRequest().body("ville existe");
            }
        }
        listvilles.add(nvVille);
        return ResponseEntity.ok("ville ajouté");
    }
    @PostMapping("/{id}")
    public ResponseEntity<String> villeModifier(@PathVariable long id, @RequestBody Ville ville) {
        if (id <= 0) {
            return ResponseEntity.badRequest().body("id pas correct");
        }
        for (Ville v : listvilles) {
            if (v.getId() == id) {
                v.setNomVille(ville.getNomVille());
                return ResponseEntity.ok("modif ok");
            }
        }
        return null;
    }
    @DeleteMapping ("/{id}")
    public ResponseEntity<String> deleteId(@PathVariable long id) {
        if (id == 0) {
            return ResponseEntity.badRequest().body("id pas correct");
        }
        Iterator<Ville> iterVilles = listvilles.iterator();

        while (iterVilles.hasNext()) {
            Ville v = iterVilles.next();
            if (v.getId() == id) {
                iterVilles.remove();
                return ResponseEntity.ok("modif ville okk");
            }
        }
        return null;
    }

}



