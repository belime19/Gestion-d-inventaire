package gestion.example.Gestion.d.inventaire.repositorie;

import gestion.example.Gestion.d.inventaire.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe,Integer > {
}
