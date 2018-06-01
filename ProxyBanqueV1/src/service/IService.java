package service;

import java.util.Map;

import domaine.Adresse;
import domaine.Agence;
import domaine.CarteBancaire;
import domaine.Client;
import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;
import domaine.ConseillerClientele;
import domaine.Personne;
import domaine.Placement;
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
	
	public Map<Integer, Compte> createCompte(Compte c); //Questions à poser a Eddy
	public void readCompte(Compte c); //fait
	public void updateCompte(CompteEpargne c, String date);
	public void deleteCompte(Compte c, Client cl);//Fait mais supprime seulement le compte de la liste des compte du client
	
	public void crediterCompte(Compte c, double montant);//Problème de variable, instanciation compte pour getSolde ??
	public void debiterCompteCourant(CompteCourant cc, double montant);//Problème de variable, instanciation compte pour getSolde ??
	public void debiterCompteEpargne(CompteEpargne ce, double montant);
	public void ajouterCarteBancaire(Compte c, CarteBancaire ca);//fait
	
	
	// Crud pour l'objet CarteBancaire
	
	public void createCarteBancaire(CarteBancaire carte);//creation = instanciation ??
	public void readCarteBancaire(CarteBancaire carte);//fait
	public void updateCarteBancaire(CarteBancaire carte);
	public void deleteCarteBancaire(CarteBancaire carte);//fait
	
	
	// Crud pour l'objet Simulation Credit
	
	public void createSimulationCredit(SimulationCredit sim);//Implémentation mensualites (résultat du calcul de la simu) ??
	public void readSimulationCredit(SimulationCredit sim);//fait
	public void updateSimulationCredit(SimulationCredit sim );//useless
	public void deleteSimulationCredit(SimulationCredit sim );//useless
	
	
	// Crud pour l'object Placement
	
	public Map<Integer, Placement> createPersonne(Placement pl);
	public void readPlacement(Placement pl);
	public void updatePlacement(Placement pl);
	public void deletePlacement(Placement pl);
}
