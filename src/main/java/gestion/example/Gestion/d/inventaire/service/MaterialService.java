package gestion.example.Gestion.d.inventaire.service;

import gestion.example.Gestion.d.inventaire.model.Material;
import gestion.example.Gestion.d.inventaire.repositorie.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialService {

    @Autowired
    MaterialRepository materialRepository;

    public void addMaterial(Material material) {
        materialRepository.save(material);
    }

    public Material getMaterial(int id) {
        return materialRepository.findById(id).get();
    }

    public void apdateMaterial(int id, Material material) {

    }

    public void deleteMaterial(int id) {
        materialRepository.deleteById(id);
    }
}
