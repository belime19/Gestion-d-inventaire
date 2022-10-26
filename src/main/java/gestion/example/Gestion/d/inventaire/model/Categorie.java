package gestion.example.Gestion.d.inventaire.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Categorie {

    @Column(name = "ID")
    private int catogorieId;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "APDATE")
    private LocalDate apdateAt;

    public Categorie() {
    }

    public Categorie(String nom, LocalDate apdateAt) {
        this.nom = nom;
        this.apdateAt = apdateAt;
    }

    public int getCatogorieId() {
        return catogorieId;
    }

    public void setCatogorieId(int catogorieId) {
        this.catogorieId = catogorieId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getApdateAt() {
        return apdateAt;
    }

    public void setApdateAt(LocalDate apdateAt) {
        this.apdateAt = apdateAt;
    }
}
