package gestion.example.Gestion.d.inventaire.service;

import gestion.example.Gestion.d.inventaire.model.Magasin;
import gestion.example.Gestion.d.inventaire.repositorie.MagasinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MagasinService {

    @Autowired
    MagasinRepository magasinRepository;


    public void addMagasin(Magasin magasin) {magasinRepository.save(magasin);}

}
