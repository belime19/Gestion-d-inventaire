package gestion.example.Gestion.d.inventaire.service;

import gestion.example.Gestion.d.inventaire.model.Employe;
import gestion.example.Gestion.d.inventaire.repositorie.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeService {

    @Autowired
    EmployeRepository employeRepository;

    public void addEmploye(Employe employe) { employeRepository.save(employe);}
}
