package com.nawres.etudiants.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomEtudiant", types = { Etudiant.class })
public interface EtudiantProjection {
	public String getNomEtudiant();
}
