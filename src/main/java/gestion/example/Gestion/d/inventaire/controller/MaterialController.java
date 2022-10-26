package gestion.example.Gestion.d.inventaire.controller;

import gestion.example.Gestion.d.inventaire.model.Material;
import gestion.example.Gestion.d.inventaire.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/materials")
@RestController
public class MaterialController {

    @Autowired
    MaterialService materialService;

    @RequestMapping(method = RequestMethod.POST)
    public void addMaterial(@RequestBody Material material) {
        materialService.addMaterial(material);
    }

    @RequestMapping(value = "/{id}")
    public Material getMaterial (@PathVariable int id){
        return materialService.getMaterial(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateMaterial(@RequestBody Material material,@PathVariable int id){
        materialService.apdateMaterial(id,material);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteMaterial (@PathVariable int id){
        materialService.deleteMaterial(id);
    }

}
