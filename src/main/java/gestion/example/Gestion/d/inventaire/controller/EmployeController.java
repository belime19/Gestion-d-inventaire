package gestion.example.Gestion.d.inventaire.controller;

import gestion.example.Gestion.d.inventaire.model.Employe;
import gestion.example.Gestion.d.inventaire.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/emploies")
@RestController
public class EmployeController {

    @Autowired
    EmployeService employeService;

    @RequestMapping(method = RequestMethod.POST)
    public void addEmploye(@RequestBody Employe employe) {
        employeService.addEmploye(employe);
    }



}
