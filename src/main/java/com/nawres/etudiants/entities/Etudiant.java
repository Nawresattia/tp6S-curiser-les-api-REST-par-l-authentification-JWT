package com.nawres.etudiants.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
 

@Entity
public class Etudiant {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long idEtudiant;
private String nomEtudiant;
private String prenomEtudiant;
private Date dateInscription;

@ManyToOne
 private Classe classe;
	
public Etudiant() {
		super();
	}
	
	public Etudiant(String nomEtudiant,String prenomEtudiant , Date dateInscription) {
		
		super();
		this.nomEtudiant=nomEtudiant;
		this.prenomEtudiant=prenomEtudiant;
		this.dateInscription=dateInscription;
		
	}

	public long getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public String getNomEtudiant() {
		return nomEtudiant;
	}

	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}

	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}

	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nomEtudiant=" + nomEtudiant + ", prenomEtudiant="
				+ prenomEtudiant + ", dateInscription=" + dateInscription + "]";
	}
	
	
	}

