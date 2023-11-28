package com.Digi.SpringTP1.controleurVilles;

import com.Digi.SpringTP1.data.Ville;
import com.Digi.SpringTP1.data.VilleDao;
import com.Digi.SpringTP1.serviceVilles.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@RestController
@RequestMapping("/villes")
public class VilleControleur {
    @Autowired
    private VilleService villeService;

    @GetMapping
    public List<Ville> getVille() {
        return villeService.extractAll();
    }

    @GetMapping("/{id}")
    public List<Ville> getIdVille(@PathVariable long id) {
        return villeService.extractById(id);
    }

    @GetMapping("/nomVille")
    public List<Ville> getByNomVille(@RequestParam String nomVille) {
        return villeService.extractByNom(nomVille);
    }

    @PostMapping
    public ResponseEntity<String> insertVille(@RequestBody Ville nvVille) {
        villeService.insert(nvVille);
        return ResponseEntity.created(null).body("Ville ajoutée avec succès");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> modiVille(@PathVariable long id, @RequestBody Ville nomVille) {
        villeService.modifierVille(id, nomVille);
        return ResponseEntity.ok("Ville modifiée avec succès");
    }

    @DeleteMapping
    public ResponseEntity<String> supprimVille(@RequestBody String nomVille) {
        villeService.supprimerVille(nomVille);
        return ResponseEntity.ok("Ville supprimée avec succès");
    }
}

   /* ***** TP5


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
*/




