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

public class ServiceImpl implements IService{

	@Override
	public void createAgence(Agence a) {
		// TODO Auto-generated method stub
		
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
	public Map<Integer, Personne> createPersonne(Personne p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void readPersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listePersonne(Map<Integer, Personne> personnes) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void attribuerCompte(Client c, Compte c2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterPlacement(Personne p, Placement gp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void effectuerVirement(ConseillerClientele cc, Compte c1, Compte c2) {
		// TODO Auto-generated method stub
		
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


}
