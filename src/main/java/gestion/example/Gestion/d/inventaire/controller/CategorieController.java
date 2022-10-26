package gestion.example.Gestion.d.inventaire.controller;

import gestion.example.Gestion.d.inventaire.model.Categorie;
import gestion.example.Gestion.d.inventaire.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/categories")
@RestController
public class CategorieController {

    @Autowired
    CategorieService categorieService;

    @RequestMapping(method = RequestMethod.POST)
    public void addCategorie(@RequestBody Categorie categorie){
        categorieService.addCategorie(categorie);
    }



}
