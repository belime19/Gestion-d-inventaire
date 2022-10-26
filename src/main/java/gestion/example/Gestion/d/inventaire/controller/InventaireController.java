package gestion.example.Gestion.d.inventaire.controller;

import gestion.example.Gestion.d.inventaire.model.Inventaire;
import gestion.example.Gestion.d.inventaire.service.InventaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/inventaires")
@RestController
public class InventaireController {

    @Autowired
    InventaireService inventaireService;

    @RequestMapping(method = RequestMethod.POST)
    public void addInventaire(@RequestBody Inventaire inventaire) {
        inventaireService.addInventaire(inventaire);
    }

    @RequestMapping(value = "/{id}")
    public Inventaire getInventaire (@PathVariable int id){
        return inventaireService.getInventaire(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateInventaire(@RequestBody Inventaire inventaire,@PathVariable int id){
        inventaireService.apdateInventaire(id,inventaire);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteInventaire (@PathVariable int id){
        inventaireService.deleteInventaire(id);
    }







}
