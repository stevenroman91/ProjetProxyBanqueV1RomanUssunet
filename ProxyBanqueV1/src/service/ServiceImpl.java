package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

import domaine.Adresse;
import domaine.Agence;
import domaine.CarteBancaire;
import domaine.Client;
import domaine.Compte;
import domaine.ConseillerClientele;
import domaine.Gerant;
import domaine.Placement;
import domaine.Personne;
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
	public void readCompte() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCompte(Compte c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCompte(Compte c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void listeCompte(Map<Integer, Compte> comptes) {
		// TODO Auto-generated method stub

	}

	@Override
	public void crediterCompte(Compte c, double montant) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debiterCompte(Compte c, double montant) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajouterCarteBancaire(Compte c, CarteBancaire ca) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<Integer, SimulationCredit> createSimulationCredit(SimulationCredit sim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void readSimulationCredit(SimulationCredit sim) {
		// TODO Auto-generated method stub

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
	public Map<Integer, domaine.CarteBancaire> CarteBancaire(domaine.CarteBancaire carte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void readCarteBancaire(domaine.CarteBancaire carte) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCarteBancaire(domaine.CarteBancaire carte) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCarteBancaire(domaine.CarteBancaire carte) {
		// TODO Auto-generated method stub

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
