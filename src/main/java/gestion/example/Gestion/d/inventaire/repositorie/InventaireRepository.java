package gestion.example.Gestion.d.inventaire.repositorie;

import gestion.example.Gestion.d.inventaire.model.Inventaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventaireRepository extends JpaRepository<Inventaire,Integer > {
}
