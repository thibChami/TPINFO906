package fr.usmb.m2isc.javaee.comptes.jpa;

import fr.usmb.m2isc.javaee.comptes.EtatColis;

import javax.persistence.*;
import java.io.Serializable;

@NamedQueries({
        @NamedQuery(name = "findEtapesColis", query = "SELECT p FROM EtapeColis p WHERE p.colis.id = :id ORDER BY p.id ASC"),
        @NamedQuery(name = "findEtapeColis", query = "SELECT p FROM EtapeColis p WHERE p.id = :id  ORDER BY p.id ASC")
})

@Entity
public class EtapeColis implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Colis colis;

    private float latitude;
    private float longitude;
    private String emplacement;
    private EtatColis etatColis;

    public EtapeColis() {

    }

    public EtapeColis(Colis colis, float latitude, float longitude,
                      String emplacement, EtatColis etatColis) {

        this.colis = colis;
        this.latitude = latitude;
        this.longitude = longitude;
        this.emplacement = emplacement;
        this.etatColis = etatColis;
    }

    public long getId() {
        return id;
    }

    public Colis getColis() {
        return colis;
    }

    public void setColis(Colis colis) {
        this.colis = colis;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public EtatColis getEtatColis() {
        return etatColis;
    }

    public void setEtatColis(EtatColis etatColis) {
        this.etatColis = etatColis;
    }
}
