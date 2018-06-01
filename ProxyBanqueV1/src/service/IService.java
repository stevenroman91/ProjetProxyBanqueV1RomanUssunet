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
import domaine.Gerant;
import domaine.Personne;
import domaine.Placement;
import domaine.SimulationCredit;

/**
 * 
 * @author Quentin Ussunet & Steven Roman
 * Interface
 *
 */

public interface IService {
	
	//Crud pour l'objet Agence()
	
	public Map<String, Agence> createAgence(Agence a); //fait
	public void readAgence(Agence a);
	public void updateAgence(Agence a, String idAgence, String dateDeCreation);
	public void deleteAgence(Agence a);
	public void attribuerGerant(Agence a,Gerant ge);
	
	//Crud pour l'objet Personne
	
	public void createPersonne(Client cl, ConseillerClientele cc); //fait
	public void readPersonne(Personne p); //fait
	public void updatePersonne(Client cl, String nom, String prenom, Adresse adresse, int telephone, boolean typeDeClient); //fait
	public void deletePersonne(Client cl); //fait
	public void attribuerCompte(Client cl, Compte c);  //fait
	public void ajouterPlacement(Client cl, Placement gp); //fait
	public void attribuerConseillerClientele(ConseillerClientele cc, Gerant ge);
	
	/*public void effectuerVirement(Compte c1, Compte c2, double mt);
	 * On va passer par les methodes crediteCompte et debiterCompte direct sur l'interface
	 */
	
	// Crud pour l'objet Compte
	
	public Map<Integer, Compte> createCompte(Compte c); //Questions à poser a Eddy
	public void readCompte(Compte c); //fait
	public void updateCompteEpargne(CompteEpargne ce, double taux) throws MontantNegatifException,TauxTropGrand;
	public void updateCompteCourant(CompteCourant cc, double decouvert) throws MontantNegatifException;
	public void deleteCompte(Compte c, Client cl);//Fait mais supprime seulement le compte de la liste des compte du client
	
	public void crediterInteretCompteEpargne(CompteEpargne ce, String date) throws TropTotPourCrediterInteret; //fait
	public void crediterCompte(Compte c, double montant) throws MontantNegatifException;//Problème de variable, instanciation compte pour getSolde ??
	public void debiterCompteCourant(CompteCourant cc, double montant) throws MontantNegatifException, SoldeInsuffisantException;//Problème de variable, instanciation compte pour getSolde ??
	public void debiterCompteEpargne(CompteEpargne ce, double montant) throws MontantNegatifException, SoldeInsuffisantException; //fait
	public void ajouterCarteBancaire(Compte c, CarteBancaire ca);//fait
	
	
	// Crud pour l'objet CarteBancaire
	
	public void createCarteBancaire(CarteBancaire carte);//creation = instanciation ??
	public void readCarteBancaire(CarteBancaire carte);//fait
	public void updateCarteBancaire(Compte cp,int codeCarte, String dateExpiration) throws CodeErreurException; //fait
	public void deleteCarteBancaire(CarteBancaire carte);//fait
	
	
	// Crud pour l'objet Simulation Credit
	
	public void createSimulationCredit(SimulationCredit sim);//fait
	public void readSimulationCredit(SimulationCredit sim);//fait
	public void updateSimulationCredit(SimulationCredit sim );//useless
	public void deleteSimulationCredit(SimulationCredit sim );//useless
	
	
	// Crud pour l'object Placement
	
	public void createPlacement(Placement pl); //
	public void readPlacement(Placement pl);
	public void updatePlacement(Placement pl, Client cl, double montant,String villeDePlacement) throws SoldeInsuffisantException, VilleNonValideException ;
	public void deletePlacement(Placement pl, Client cl);
}
