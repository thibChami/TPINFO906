package fr.usmb.m2isc.javaee.comptes.ejb;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import fr.usmb.m2isc.javaee.comptes.jpa.Colis;

@Stateless
@Remote
public class OperationBean implements Operation {

    @PersistenceContext
    private EntityManager em;

    public OperationBean() {

    }

    @Override
    public List<Colis> findAllColis() {
        final Query query = em.createNamedQuery("tousColis");
        return query.getResultList();
    }

    @Override
    public Colis findColisById(long id) {
        final Query query = em.createNamedQuery("findWithId");
        query.setParameter("id", id);
        if (query.getResultList().size() > 0) {
            return (Colis) query.getResultList().get(0);
        }
        else {
            return null;
        }
    }

    @Override
    public Colis createColis(final String origine, final String destination, final float poids, final float prix) {
        Colis colis = new Colis(poids, prix, origine, destination);
        em.persist(colis);
        return colis;
    }

}
