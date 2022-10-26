package gestion.example.Gestion.d.inventaire.repositorie;

import gestion.example.Gestion.d.inventaire.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material,Integer > {
}
