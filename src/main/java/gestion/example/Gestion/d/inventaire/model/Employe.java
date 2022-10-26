package gestion.example.Gestion.d.inventaire.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Employe {

    @Column(name = "ID")
    private int employeId;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "PRENOM")
    private String prenom;
    @Column(name = "IMAGE",nullable = true)
    private String imageUrl;
    @Column(name = "EMAIL",nullable = true)
    private String email;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "MOT_DE_PASS")
    private String motDePass;
    @Column(name = "ACTIF")
    private boolean actif;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ID_MAGASIN",referencedColumnName = "ID")
    private Magasin magasinId;
    @Column(name = "APDATE")
    private LocalDate apdateAt;

    public Employe() {
    }

    public Employe(String nom, String prenom, String imageUrl, String email, String login, String motDePass, boolean actif, LocalDate apdateAt) {
        this.nom = nom;
        this.prenom = prenom;
        this.imageUrl = imageUrl;
        this.email = email;
        this.login = login;
        this.motDePass = motDePass;
        this.actif = actif;
        this.apdateAt = apdateAt;
    }

    public int getEmployeId() {
        return employeId;
    }

    public void setEmployeId(int employeId) {
        this.employeId = employeId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePass() {
        return motDePass;
    }

    public void setMotDePass(String motDePass) {
        this.motDePass = motDePass;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public Magasin getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(Magasin magasinId) {
        this.magasinId = magasinId;
    }

    public LocalDate getApdateAt() {
        return apdateAt;
    }

    public void setApdateAt(LocalDate apdateAt) {
        this.apdateAt = apdateAt;
    }
}
