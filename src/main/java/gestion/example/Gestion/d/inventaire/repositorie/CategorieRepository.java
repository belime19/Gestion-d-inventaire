package gestion.example.Gestion.d.inventaire.repositorie;

import gestion.example.Gestion.d.inventaire.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie,Integer > {
}
