package gestion.example.Gestion.d.inventaire.repositorie;

import gestion.example.Gestion.d.inventaire.model.Magasin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MagasinRepository extends JpaRepository<Magasin,Integer > {
}
