package gestion.example.Gestion.d.inventaire.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.w3c.dom.Text;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Material {

    @Column(name = "ID")
    private int materialId;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "DESCRIPTION")
    private Text description;
    @Column(name = "MARQUE")
    private String marque;
    @Column(name = "IMAGE")
    private String imageUrl;

    private enum taille{};
    @Column(name = "DUREE_LOCATION")
    private int dureeLocation;
    @Column(name = "COUT_LOCATION")
    private float coutLocation;
    @JsonIgnore
    @ManyToOne
    private Categorie categorieId;
    @Column(name = "APDATE")
    private LocalDate apdateAt;

    public Material() {
    }

    public Material(String nom, Text description, String marque, String imageUrl, int dureeLocation, float coutLocation, LocalDate apdateAt) {
        this.nom = nom;
        this.description = description;
        this.marque = marque;
        this.imageUrl = imageUrl;
        this.dureeLocation = dureeLocation;
        this.coutLocation = coutLocation;
        this.apdateAt = apdateAt;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Text getDescription() {
        return description;
    }

    public void setDescription(Text description) {
        this.description = description;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getDureeLocation() {
        return dureeLocation;
    }

    public void setDureeLocation(int dureeLocation) {
        this.dureeLocation = dureeLocation;
    }

    public float getCoutLocation() {
        return coutLocation;
    }

    public void setCoutLocation(float coutLocation) {
        this.coutLocation = coutLocation;
    }

    public Categorie getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(Categorie categorieId) {
        this.categorieId = categorieId;
    }

    public LocalDate getApdateAt() {
        return apdateAt;
    }

    public void setApdateAt(LocalDate apdateAt) {
        this.apdateAt = apdateAt;
    }
}
