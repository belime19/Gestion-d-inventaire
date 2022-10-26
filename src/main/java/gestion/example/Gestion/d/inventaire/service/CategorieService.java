package gestion.example.Gestion.d.inventaire.service;

import gestion.example.Gestion.d.inventaire.model.Categorie;
import gestion.example.Gestion.d.inventaire.repositorie.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieService {

    @Autowired
    CategorieRepository categorieRepository;

    public void addCategorie(Categorie categorie) {categorieRepository.save(categorie);}
}
