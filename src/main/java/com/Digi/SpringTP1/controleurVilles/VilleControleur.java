package com.Digi.SpringTP1.controleurVilles;

import com.Digi.SpringTP1.dataVille.Ville;
import com.Digi.SpringTP1.serviceVilles.VilleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/villes")
public class VilleControleur {
    private final VilleService villeService;

    public VilleControleur(VilleService villeservice) {
        this.villeService = villeservice;
    }
    @GetMapping("/villesList")
    public List<Ville> getUsers(){
        return this.villeService.getAllUsers();
    }


}
