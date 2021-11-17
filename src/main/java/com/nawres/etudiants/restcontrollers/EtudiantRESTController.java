package com.nawres.etudiants.restcontrollers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nawres.etudiants.entities.Etudiant;
import com.nawres.etudiants.service.EtudiantService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class EtudiantRESTController {
	
	@Autowired
    EtudiantService etudiantService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Etudiant> getAllEtudiants() {
		return etudiantService.getAllEtudiants();
	}

	
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Etudiant getEtudiantById(@PathVariable("id") Long id) {
		return etudiantService.getEtudiant(id);

	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
		return etudiantService.saveEtudiant(etudiant);
	}
	
	
	
	@RequestMapping(method = RequestMethod.PUT)
		public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
			return etudiantService.updateEtudiant(etudiant);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
		public void deleteEtudiant(@PathVariable("id") Long id)
		{
				etudiantService.deleteEtudiantById(id);
	}
	
	
	
	@RequestMapping(value="/prodscat/{idClasse}",method = RequestMethod.GET)
		public List<Etudiant> getEtudiantsByidClasse(@PathVariable("idClasse") Long idClasse) {
			return etudiantService.findByClasseIdClasse(idClasse);
	}
	
	
	
	
	
	
	
	
}
