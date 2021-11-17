package com.nawres.etudiants.reops;

 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nawres.etudiants.entities.Classe;
import com.nawres.etudiants.entities.Etudiant;

@RepositoryRestResource(path = "rest")
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

	
List <Etudiant> findByNomEtudiant(String nom);
List <Etudiant> findByNomEtudiantContains(String nom);

	


//@Query("select e from Etudiant e where e.nomEtudiant like %?1 and e.prenomEtudiant like %?2")
//List<Etudiant> findByNomPrenom (String nom, String prenom);


@Query("select e from Etudiant e where e.nomEtudiant like %:nom and e.prenomEtudiant > :prenom")
List<Etudiant> findByNomPrenom (@Param("nom") String nom,@Param("prenom") String prenom);

@Query("select e from Etudiant e where e.classe = ?1")
List<Etudiant> findByClasse (Classe classe);

List<Etudiant> findByClasseIdClasse(Long idClasse);

List<Etudiant> findByOrderByNomEtudiantAsc();

@Query("select e from Etudiant e order by e.nomEtudiant ASC, e.prenomEtudiant DESC")
List<Etudiant> trierEtudiantNomPrenom ();
}



