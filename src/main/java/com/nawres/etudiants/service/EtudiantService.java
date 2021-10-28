package com.nawres.etudiants.service;

import java.util.List;

import com.nawres.etudiants.entities.Classe;
import com.nawres.etudiants.entities.Etudiant;

public interface EtudiantService {

	Etudiant saveEtudiant(Etudiant e);
	Etudiant updateEtudiant(Etudiant e);
	void deleteEtudiant(Etudiant e);
	void deleteEtudiantById(Long id);
	Etudiant getEtudiant(Long id);
	List<Etudiant> getAllEtudiants();
	
	List<Etudiant> findByNomEtudiant(String nom);
	List<Etudiant> findByNomEtudiantContains(String nom);
	List<Etudiant> findByNomPrenom (String nom, String prenom);
	List<Etudiant> findByClasse (Classe  classe );
	List<Etudiant> findByClasseIdClasse (Long idClasse );
	List<Etudiant> findByOrderByNomPrenomAsc();
	List<Etudiant> trierEtudiantNomPrenom();
	
	
}
