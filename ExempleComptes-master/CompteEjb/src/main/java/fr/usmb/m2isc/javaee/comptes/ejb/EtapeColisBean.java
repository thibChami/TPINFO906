package fr.usmb.m2isc.javaee.comptes.ejb;

import fr.usmb.m2isc.javaee.comptes.EtatColis;
import fr.usmb.m2isc.javaee.comptes.jpa.Colis;
import fr.usmb.m2isc.javaee.comptes.jpa.EtapeColis;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Stateless
@Remote
public class EtapeColisBean implements EtapeColisOperation {

    @PersistenceContext
    private EntityManager em;

    public EtapeColisBean() {

    }

    @Override
    public List<EtapeColis> findEtapesColis(Colis colis) {
        Query query = em.createNamedQuery("findEtapesColis");
            query.setParameter("id", colis.getId());
            return query.getResultList();
        }

    @Override
    public EtapeColis addColisEtapeColis(Colis colis, String emplacement, EtatColis etat, float latitude, float longitude) {
        final EtapeColis etapeColis = new EtapeColis(colis, latitude, longitude, emplacement, etat);
        em.persist(etapeColis);
        return etapeColis;
    }


    @Override
    public EtapeColis modifierEtapeColis(long identifiant,String emplacement, EtatColis etat, float latitude, float longitude) {
        EtapeColis etapeColis;
        final Query query = em.createNamedQuery("findEtapeColis");
        query.setParameter("id", identifiant);
        if (query.getResultList().size() > 0) {
             etapeColis = (EtapeColis) query.getResultList().get(0);
        }
        else {
            return null;
        }
        etapeColis.setEtatColis(etat);
        etapeColis.setEmplacement(emplacement);
        etapeColis.setLatitude(latitude);
        etapeColis.setLongitude(longitude);
        return etapeColis;
    }
    
}
