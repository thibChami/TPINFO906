package fr.usmb.m2isc.javaee.comptes.jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NamedQueries({
        @NamedQuery(name = "tousColis", query = "SELECT c FROM Colis c"),
        @NamedQuery(name = "findWithId", query = "SELECT c FROM Colis c WHERE c.id = :id ORDER BY c.id ASC")
})
@Entity
public class Colis implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private float poids;
    private float prix;
    private String origine;
    private String destination;

    @OneToMany(mappedBy = "colis", fetch = FetchType.EAGER)
    private List<EtapeColis> etapeColisList;

    public Colis() {
        // empty constructor
    }

    public Colis(float poids, float prix, String origine, String destination) {
        this.poids = poids;
        this.prix = prix;
        this.origine = origine;
        this.destination = destination;
    }

    public long getId() {
        return id;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public List<EtapeColis> getetapeColisList() {
        return etapeColisList;
    }

    public void setEtapeColis(List<EtapeColis> etapeColisList) {
        this.etapeColisList = etapeColisList;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
