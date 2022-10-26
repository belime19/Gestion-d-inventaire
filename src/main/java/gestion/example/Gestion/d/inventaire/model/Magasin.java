package gestion.example.Gestion.d.inventaire.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;

@Entity
public class Magasin {

    @Column(name = "ID")
    private int magasinId;
    @Column(name = "VILLE")
    private String ville;
    @JsonIgnore
    @OneToMany
    private Employe directeurPersonalId;
    @Column(name = "APDATE")
    private LocalDate apdateAt;

    public Magasin() {
    }

    public Magasin(String ville, LocalDate apdateAt) {
        this.ville = ville;
        this.apdateAt = apdateAt;
    }

    public int getMagasinId() {
        return magasinId;
    }

    public void setMagasinId(int magasinId) {
        this.magasinId = magasinId;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Employe getDirecteurPersonalId() {
        return directeurPersonalId;
    }

    public void setDirecteurPersonalId(Employe directeurPersonalId) {
        this.directeurPersonalId = directeurPersonalId;
    }

    public LocalDate getApdateAt() {
        return apdateAt;
    }

    public void setApdateAt(LocalDate apdateAt) {
        this.apdateAt = apdateAt;
    }
}
