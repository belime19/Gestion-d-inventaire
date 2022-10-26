package gestion.example.Gestion.d.inventaire.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;

@Entity
public class Inventaire {

    @Column(name = "ID")
    private int inventaireId;
    @JsonIgnore
    @OneToMany
    private Material materialId;
    @JsonIgnore
    @ManyToOne
    private Magasin magasinId;
    @Column(name = "APDATE")
    private LocalDate apdateAt;

    public Inventaire() {
    }

    public Inventaire(LocalDate apdateAt) {
        this.apdateAt = apdateAt;
    }

    public int getInventaireId() {
        return inventaireId;
    }

    public void setInventaireId(int inventaireId) {
        this.inventaireId = inventaireId;
    }

    public Material getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Material materialId) {
        this.materialId = materialId;
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
