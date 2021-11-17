package com.nawres.etudiants;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.nawres.etudiants.entities.Classe;
import com.nawres.etudiants.entities.Etudiant;
import com.nawres.etudiants.reops.EtudiantRepository;
 

@SpringBootTest
class EtudiantsApplicationTests {

	@Autowired
	private EtudiantRepository EtudiantRepository;
	@Test
	public void testCreateProduit() {
	Etudiant etud = new Etudiant("firas","attia",new Date());
	EtudiantRepository.save(etud);
	}
	
	
	@Test
	public void testUpdateEtudiant()
	{
	Etudiant e = EtudiantRepository.findById(4L).get();
	e.setNomEtudiant("ali");
	EtudiantRepository.save(e);
	}
	
	@Test
	public void testFindEtudiant()
	{
	Etudiant e = EtudiantRepository.findById(4L).get();

	System.out.println(e);
	}
	@Test
	public void testDeleteEtudiant()
	{
	EtudiantRepository.deleteById(4L);;
	}
	
	
	
	@Test
	public void testListerTousEtudiants()
	{
	List<Etudiant> etuds = EtudiantRepository.findAll();
	for (Etudiant e : etuds)
	{
	System.out.println(e);
	}
	
	}
	@Test
	public void testFindByNomEtudiant()
	{
	List<Etudiant> etud = EtudiantRepository.findByNomEtudiant("nawres");

	for (Etudiant e : etud){
	{
	System.out.println(e);
	
	}
	}}
	
	@Test
	public void testFindByNomEtudiantContains ()
	{
	List<Etudiant> etud=EtudiantRepository.findByNomEtudiantContains("nawres");

	for (Etudiant e : etud)
	{
	System.out.println(e);
	} }
	
	
	@Test
	public void testfindByNomPrenom()
	{
	List<Etudiant> etud = EtudiantRepository.findByNomPrenom("nawres","attia");
	for (Etudiant e : etud)
	{
	System.out.println(e);
	}
	}
	@Test
	public void testfindByClasse()
	{
	Classe cls = new Classe();
	cls.setIdClasse(1L);
	List<Etudiant> etud = EtudiantRepository.findByClasse(cls);
	for (Etudiant e : etud)
	{
	System.out.println(e);
	}

	}
	@Test
	public void findByClasseIdClasse()
	{
	List<Etudiant> etud = EtudiantRepository.findByClasseIdClasse(1L);
	for (Etudiant e : etud)
	{
	System.out.println(e);
	}

	}
	@Test
	public void testfindByOrderByNomEtudiantAsc()
	{
	List<Etudiant> etud =EtudiantRepository.findByOrderByNomEtudiantAsc();
	for (Etudiant e : etud)
	{
	System.out.println(e);
	}

	}
	@Test
	public void trierEtudiantNomPrenom()
	{
	List<Etudiant> etud = EtudiantRepository.trierEtudiantNomPrenom();
	for (Etudiant e : etud)
	{
	System.out.println(e);
	}

	}	

	
	
	
}

