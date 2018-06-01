package service;

import java.util.Hashtable;
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

public class ServiceImpl implements IService {

	private Map<String, Agence> agences = new Hashtable<String, Agence>();
	private Map<Integer, Personne> personnes = new Hashtable<Integer, Personne>();
	private Map<Integer, Client> clients = new Hashtable<Integer, Client>();
	private Map<Integer, ConseillerClientele> conseillers = new Hashtable<Integer, ConseillerClientele>();
	private Map<Integer, Gerant> gerants = new Hashtable<Integer, Gerant>();
	private Map<Integer, Compte> comptes = new Hashtable<Integer, Compte>();
	private Map<Integer, CarteBancaire> cartes = new Hashtable<Integer, CarteBancaire>();
	private Map<Integer, SimulationCredit> simulations = new Hashtable<Integer, SimulationCredit>();
	private Map<Integer, Placement> placements = new Hashtable<Integer, Placement>();

	@Override
	public Map<String, Agence> createAgence(Agence a) {

		agences.put(a.getIdAgence(), a);
		return agences;
	}

	@Override
	public void readAgence(Agence a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAgence(Agence a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAgence(Agence a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createPersonne(Client cl, ConseillerClientele cc) {

		cc.getClients().add(cl);

	}

	@Override
	public void readPersonne(Personne p) {
		// TODO Auto-generated method stub

		System.out.println(p.toString());

	}

	@Override
	public void updatePersonne(Client cl, String nom, String prenom, Adresse adresse, int telephone,
			boolean typeDeClient) {
		// TODO Auto-generated method stub

		cl.setNom(nom);
		cl.setPrenom(prenom);
		cl.setAdresse(adresse);
		cl.setTelephone(telephone);
		cl.setTypeDeClient(typeDeClient);

	}

	@Override
	public void deletePersonne(Client cl) {

		for (Compte compte : cl.getComptes()) {

			if (compte.getCarte() != null) {

				compte.getCarte().setEtatCarte(false);
			}

			cl.getComptes().remove(compte);

		}

		personnes.remove(cl);

	}

	@Override
	public void attribuerCompte(Client c, Compte c2) {
		// TODO Auto-generated method stub

		c.getComptes().add(c2);
		c2.setTitulaireduCompte(c);

	}

	@Override
	public Map<Integer, Compte> createCompte(Compte c) {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public void readCompte(Compte c) {
		// TODO Auto-generated method stub
		System.out.println(c.toString());

	}

	@Override
	public void updateCompte(CompteEpargne c, String date) {
		// TODO Auto-generated method stub

		int strdateCreation[] = new int[date.length()];
		int dateAujourdhui[] = new int[date.length()];

		for (int i = 0; i < date.length(); i++) {
			strdateCreation[i] = c.getDateOuvertureCompte().toCharArray()[i];
			dateAujourdhui[i] = date.toCharArray()[i];
		}
		
		

	}

	@Override
	public void deleteCompte(Compte c, Client cl) {
		// TODO Auto-generated method stub
		cl.getComptes().remove(c);

	}

	@Override
	public void crediterCompte(Compte c, double montant) {
		// TODO Auto-generated method stub
		// gerer en interface le problème du mt négatif ou String
		double solde = c.getSolde() + montant;
		c.setSolde(solde);
	}

	@Override
	public void debiterCompteCourant(CompteCourant cc, double montant) {
		// TODO Auto-generated method stub

		if (cc.getSolde() - montant > -cc.getDecouvert()) {
			double solde = cc.getSolde() - montant;
			cc.setSolde(solde);
		}

	}

	@Override
	public void debiterCompteEpargne(CompteEpargne ce, double montant) {
		// TODO Auto-generated method stub

		if (ce.getSolde() - montant > 0) {
			double solde = ce.getSolde() - montant;
			ce.setSolde(solde);
		}

	}

	@Override
	public void ajouterCarteBancaire(Compte c, CarteBancaire ca) {
		// TODO Auto-generated method stub
		c.setCarte(ca);
		ca.setCompte(c);

	}

	@Override
	public void createSimulationCredit(SimulationCredit sim) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readSimulationCredit(SimulationCredit sim) {
		// TODO Auto-generated method stub
		System.out.println(sim.toString());

	}

	@Override
	public void updateSimulationCredit(SimulationCredit sim) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteSimulationCredit(SimulationCredit sim) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<Integer, Placement> createPersonne(Placement gp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createCarteBancaire(CarteBancaire carte) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readCarteBancaire(CarteBancaire carte) {
		// TODO Auto-generated method stub
		System.out.println(carte.toString());

	}

	@Override
	public void updateCarteBancaire(CarteBancaire carte) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCarteBancaire(CarteBancaire carte) {
		// TODO Auto-generated method stub
		carte.setEtatCarte(false);

	}

	@Override
	public void readPlacement(Placement pl) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePlacement(Placement pl) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePlacement(Placement pl) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajouterPlacement(Client cl, Placement gp) {

		cl.getPlacements().add(gp);
		gp.setClient(cl);

	}

}
