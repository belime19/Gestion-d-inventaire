package gestion.example.Gestion.d.inventaire.controller;

import gestion.example.Gestion.d.inventaire.model.Magasin;
import gestion.example.Gestion.d.inventaire.service.MagasinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/magasins")
@RestController
public class MagasinController {

    @Autowired
    MagasinService magasinService;

    @RequestMapping(method = RequestMethod.POST)
    public void addMagasin(@RequestBody Magasin magasin) {
        magasinService.addMagasin(magasin);
    }



}
