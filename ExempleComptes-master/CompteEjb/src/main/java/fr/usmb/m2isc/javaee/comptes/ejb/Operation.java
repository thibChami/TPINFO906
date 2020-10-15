package fr.usmb.m2isc.javaee.comptes.ejb;

import java.util.List;

import fr.usmb.m2isc.javaee.comptes.jpa.Colis;

public interface Operation {
	List<Colis> findAllColis();
	Colis findColisById(long id);
	Colis createColis(String origine, String destination, float poids, float prix);
}