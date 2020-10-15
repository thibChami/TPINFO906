package fr.usmb.m2isc.javaee.comptes.ejb;

import fr.usmb.m2isc.javaee.comptes.EtatColis;
import fr.usmb.m2isc.javaee.comptes.jpa.Colis;
import fr.usmb.m2isc.javaee.comptes.jpa.EtapeColis;

import java.util.List;

public interface EtapeColisOperation {
    List<EtapeColis> findEtapesColis(Colis colis);

    EtapeColis addColisEtapeColis(Colis colis,
                                  String emplacement,
                                  EtatColis etat,
                                  float latitude,
                                  float longitude);


    EtapeColis modifierEtapeColis(long identifiant,String emplacement, EtatColis etat, float latitude, float longitude);


}
