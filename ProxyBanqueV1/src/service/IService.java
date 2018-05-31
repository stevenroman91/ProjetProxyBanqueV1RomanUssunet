package service;

import java.util.Map;

import domaine.Adresse;
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
	
	public Map<String, Agence> createAgence(Agence a); //fait
	public void readAgence(Agence a);
	public void updateAgence(Agence a);
	public void deleteAgence(Agence a);
	
	//Crud pour l'objet Personne
	
	public void createPersonne(Client cl, ConseillerClientele cc); //fait
	public void readPersonne(Personne p); //fait
	public void updatePersonne(Client cl, String nom, String prenom, Adresse adresse, int telephone, boolean typeDeClient); //fait
	public void deletePersonne(Client cl); //fait
	
	public void attribuerCompte(Client cl, Compte c);  //fait
	public void ajouterPlacement(Client cl, Placement gp); //fait
	/*public void effectuerVirement(Compte c1, Compte c2, double mt);
	 * On va passer par les methodes crediteCompte et debiterCompte direct sur l'interface
	 */
	
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
