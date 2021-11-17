package com.nawres.etudiants.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nawres.etudiants.entities.Classe;
import com.nawres.etudiants.entities.Etudiant;
import com.nawres.etudiants.reops.EtudiantRepository;

@Service
public class EtudiantServiceImpl implements EtudiantService {
	@Autowired
	EtudiantRepository etudiantRepository;
	public Etudiant saveEtudiant(Etudiant e) {
	return etudiantRepository.save(e);
}
	public Etudiant updateEtudiant(Etudiant e) {
	return etudiantRepository.save(e);
	}
	public void deleteEtudiant(Etudiant e) {
		etudiantRepository.delete(e);
		}
		public void deleteEtudiantById(Long id) {
			etudiantRepository.deleteById(id);
		}
		public Etudiant getEtudiant(Long id) {
		return etudiantRepository.findById(id).get();
		}
		public List<Etudiant> getAllEtudiants() {
		return etudiantRepository.findAll();
		}
		
		public List<Etudiant> findByNomEtudiant(String nom) {
		return etudiantRepository.findByNomEtudiant(nom);
		}
		public List<Etudiant> findByNomPrenomContains(String nom) {
		return etudiantRepository.findByNomEtudiantContains(nom);
		}
		public List<Etudiant> findByNomPrenom(String nom, String prenom){
			return etudiantRepository.findByNomPrenom(nom, prenom);
		}
		public List<Etudiant> findByClasse(Classe classe) {
		return etudiantRepository.findByClasse(classe);
		}
		public List<Etudiant> findByClasseIdClasse(Long idClasse) {
		return etudiantRepository.findByClasseIdClasse(idClasse);
		}
		public List<Etudiant> findByOrderByNomPrenomAsc() {
		return etudiantRepository.findByOrderByNomEtudiantAsc();
		}
		public List<Etudiant> trierEtudiantNomPrenom() {
		return etudiantRepository.trierEtudiantNomPrenom();
		}
		@Override
		public List<Etudiant> findByNomEtudiantContains(String nom) {
			return etudiantRepository.findByNomEtudiantContains(nom);
		}
		
		}