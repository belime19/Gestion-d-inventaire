package gestion.example.Gestion.d.inventaire.service;

import gestion.example.Gestion.d.inventaire.model.Inventaire;
import gestion.example.Gestion.d.inventaire.repositorie.InventaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventaireService {

    @Autowired
    InventaireRepository inventaireRepository;

    public void addInventaire(Inventaire inventaire) {
        inventaireRepository.save(inventaire);
    }

    public Inventaire getInventaire(int id) {
        return inventaireRepository.findById(id).get();
    }

    public void apdateInventaire(int id, Inventaire inventaire) {
    }

    public void deleteInventaire(int id) {
        inventaireRepository.deleteById(id);
    }
}
