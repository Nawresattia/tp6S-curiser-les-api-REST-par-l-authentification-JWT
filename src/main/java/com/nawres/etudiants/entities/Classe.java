package com.nawres.etudiants.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClasse;
	private String nomClasse;
	private String descriptionClasse;
	
	
	@OneToMany(mappedBy = "classe")
	private List<Etudiant> etudiants;
	
	public Classe() {}
	
	public Classe(String nomClasse, String descriptionClasse, List<Etudiant> etudiants)
	{

	super();
	this.nomClasse = nomClasse;
	this.descriptionClasse = descriptionClasse;
	this.etudiants = etudiants;
	}

	public Long getIdClasse() {
		return idClasse;
	}

	public void setIdClasse(Long idClasse) {
		this.idClasse = idClasse;
	}

	public String getNomClasse() {
		return nomClasse;
	}

	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}

	public String getDescriptionClasse() {
		return descriptionClasse;
	}

	public void setDescriptionClasse(String descriptionClasse) {
		this.descriptionClasse = descriptionClasse;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	


	
}
