package service;

import java.util.Map;

import domaine.Agence;
import domaine.CarteBancaire;
import domaine.Client;
import domaine.Compte;
import domaine.ConseillerClientele;
import domaine.Placement;
import domaine.Personne;
import domaine.SimulationCredit;

public interface IService {
	
	//Crud pour l'objet Agence()
	
	public void createAgence(Agence a);
	public void readAgence(Agence a);
	public void updateAgence(Agence a);
	public void deleteAgence(Agence a);
	
	//Crud pour l'objet Personne
	
	public Map<Integer, Personne> createPersonne(Personne p);
	public void readPersonne(Personne p);
	public void updatePersonne(Personne p);
	public void deletePersonne(Personne p);
	

	public void listePersonne(Map<Integer, Personne> personnes);
	public void attribuerCompte(Client cl, Compte c);  
	public void ajouterPlacement(Personne p, Placement gp); 
	public void effectuerVirement(ConseillerClientele cc, Compte c1, Compte c2); 
	
	// Crud pour l'objet Compte
	
	public Map<Integer, Compte> createCompte(Compte c); 
	public void readCompte();
	public void updateCompte(Compte c);
	public void deleteCompte(Compte c);
	
	public void listeCompte(Map<Integer, Compte> comptes); //new
	public void crediterCompte(Compte c, double montant);
	public void debiterCompte(Compte c, double montant);
	public void ajouterCarteBancaire(Compte c, CarteBancaire ca);
	
	
	// Crud pour l'objet CarteBancaire
	
	public Map<Integer, CarteBancaire> CarteBancaire(CarteBancaire carte); 
	public void readCarteBancaire(CarteBancaire carte);
	public void updateCarteBancaire(CarteBancaire carte);
	public void deleteCarteBancaire(CarteBancaire carte);
	
	
	// Crud pour l'objet Simulation Credit
	
	public Map<Integer, SimulationCredit> createSimulationCredit(SimulationCredit sim); 
	public void readSimulationCredit(SimulationCredit sim);
	public void updateSimulationCredit(SimulationCredit sim );
	public void deleteSimulationCredit(SimulationCredit sim );
	
	
	// Crud pour l'object Placement
	
	public Map<Integer, Placement> createPersonne(Placement pl);
	public void readPlacement(Placement pl);
	public void updatePlacement(Placement pl);
	public void deletePlacement(Placement pl);
}
