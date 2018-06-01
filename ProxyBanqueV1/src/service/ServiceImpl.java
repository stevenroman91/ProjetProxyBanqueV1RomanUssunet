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

/**
 * 
 * @author Quentin Ussunet & Steven Roman
 *
 */

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
	public void updateAgence(Agence a, String idAgence, String dateDeCreation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAgence(Agence a) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void attribuerGerant(Agence a,Gerant ge) {
		// TODO Auto-generated method stub
		
		a.setGerant(ge);
		ge.setAgence(a);
		
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
	public void ajouterPlacement(Client cl, Placement gp) {

		cl.getPlacements().add(gp);
		gp.setClient(cl);

	}
	
	@Override
	public void attribuerConseillerClientele(ConseillerClientele cc, Gerant ge) {
		// TODO Auto-generated method stub
		
		ge.getConseillers().add(cc);
		cc.setGerant(ge);
		
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
	public void updateCompteEpargne(CompteEpargne ce, double taux) throws MontantNegatifException,TauxTropGrand {
		// TODO Auto-generated method stub
		if(taux<0) throw new MontantNegatifException("Le taux que vous avez rentré est negatif");
		if(taux>100) throw new TauxTropGrand("Le taux que vous avez rentré est supérieur a 100");
		
		ce.setTaux(taux);
	}

	@Override
	public void updateCompteCourant(CompteCourant cc, double decouvert) throws MontantNegatifException {
		// TODO Auto-generated method stub

		if(decouvert<0) throw new MontantNegatifException("Le découvert que vous avez rentré est négatif");
		if (cc.getSolde() < -decouvert)
			throw new MontantNegatifException("Vouz ne pouvez pas changer votre decouvert car votre solde est inferieur au decouvert que vous voulez rentrer");
		cc.setDecouvert(decouvert);

	}

	/**
	 * @param ce Compte Epargne
	 * @param date on ne fait pas d'exception par rapport à la date, il faut lui donner un date au bon format
	 */
	@Override
	public void crediterInteretCompteEpargne(CompteEpargne ce, String date) throws TropTotPourCrediterInteret {
		// TODO Auto-generated method stub

		int anneCreation[] = new int[4];
		int anneDemande[] = new int[4];

		int moisCreation[] = new int[2];
		int moisDemande[] = new int[2];

		int jourCreation[] = new int[2];
		int jourDemande[] = new int[2];

		for (int i = 0; i < 2; i++) {
			jourCreation[i] = ce.getDateOuvertureCompte().toCharArray()[i];
			jourDemande[i] = date.toCharArray()[i];
		}

		int anneCrea = 1000 * anneCreation[0] + 100 * anneCreation[1] + 10 * anneCreation[2] + anneCreation[3];
		int anneDem = 1000 * anneDemande[0] + 100 * anneDemande[1] + 10 * anneDemande[2] + anneDemande[3];

		for (int i = 3; i < 5; i++) {
			moisCreation[i - 3] = ce.getDateOuvertureCompte().toCharArray()[i];
			moisDemande[i - 3] = date.toCharArray()[i];
		}

		int moisCrea = 10 * moisCreation[0] + moisCreation[1];
		int moisDem = 10 * moisDemande[0] + moisDemande[1];

		for (int i = 5; i < date.length(); i++) {
			moisCreation[i - 5] = ce.getDateOuvertureCompte().toCharArray()[i];
			moisDemande[i - 5] = date.toCharArray()[i];
		}

		int jourCrea = 10 * jourCreation[0] + jourCreation[1];
		int jourDem = 10 * jourDemande[0] + jourDemande[1];

		if (anneDem - anneCrea < 1)
			throw new TropTotPourCrediterInteret(
					"Pour le moment vous ne pouvez pas toucher les interets de votre compte epargne");

		ce.setSolde(ce.getSolde() * Math.pow((1 + (ce.getTaux()/100)), anneDem - anneCrea));

	}

	@Override
	public void deleteCompte(Compte c, Client cl) {
		// TODO Auto-generated method stub
		cl.getComptes().remove(c);

	}

	@Override
	public void crediterCompte(Compte c, double montant) throws MontantNegatifException {
		// TODO Auto-generated method stub
		// gerer en interface le problème du mt négatif ou String
		if(montant<0) throw new MontantNegatifException("Le montant à crediter est négatif");
		double solde = c.getSolde() + montant;
		c.setSolde(solde);
	}

	@Override
	public void debiterCompteCourant(CompteCourant cc, double montant) throws MontantNegatifException, SoldeInsuffisantException {
		// TODO Auto-generated method stub
		if(montant<0) throw new MontantNegatifException("Le montant à crediter est négatif");
		if(cc.getSolde() - montant < -cc.getDecouvert()) throw new SoldeInsuffisantException("votre solde de vous permet pas de retirer " + montant + "euros.");
		if (cc.getSolde() - montant >= -cc.getDecouvert()) {
			double solde = cc.getSolde() - montant;
			cc.setSolde(solde);
		}

	}

	@Override
	public void debiterCompteEpargne(CompteEpargne ce, double montant) throws MontantNegatifException, SoldeInsuffisantException {
		// TODO Auto-generated method stub
		if(montant<0) throw new MontantNegatifException("Le montant à crediter est négatif");
		if(ce.getSolde() - montant < 0) throw new SoldeInsuffisantException("votre solde de vous permet pas de retirer " + montant + "euros.");
		if (ce.getSolde() - montant >= 0) {
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

		sim.setMensualite(sim.getMontant() * (1 + sim.getTaux()) / sim.getDuree());

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
	public void createCarteBancaire(CarteBancaire carte) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readCarteBancaire(CarteBancaire carte) {
		// TODO Auto-generated method stub
		System.out.println(carte.toString());

	}

	@Override
	public void updateCarteBancaire(Compte c, int codeCarte, String dateExpiration) throws CodeErreurException {
		// TODO Auto-generated method stub
		
		if(codeCarte>9999) throw new CodeErreurException("un code de carte bancaire doit etre composé d'au maximum 4 chifres");
		c.getCarte().setCodeCarte(codeCarte);
		c.getCarte().setDateExpiration(dateExpiration);

	}

	@Override
	public void deleteCarteBancaire(CarteBancaire carte) {
		// TODO Auto-generated method stub
		carte.setEtatCarte(false);

	}

	@Override
	public void createPlacement(Placement pl) {
		//
	}

	@Override
	public void readPlacement(Placement pl) {
		// TODO Auto-generated method stub
		System.out.println(pl.toString());
	}

	@Override
	public void updatePlacement(Placement pl, Client cl, double montant,String villeDePlacement) throws SoldeInsuffisantException, VilleNonValideException {
		// TODO Auto-generated method stub
		if(villeDePlacement.toLowerCase()!="paris"&&villeDePlacement.toLowerCase()!="new-york"&&villeDePlacement.toLowerCase()!="new york"&&villeDePlacement.toLowerCase()!="tokyo") throw new VilleNonValideException("La ville que vous avez rentré est non valide");
		//if(montant<0) throw new MontantNegatifException("Le montant que vous avez rentré est négatif");
		if(pl.getMontant()+montant<0) throw new SoldeInsuffisantException("vous ne pouvez pas retirer de l'argent de se placement, solde inssufisant"); 
		cl.getPlacements().remove(pl);
		pl.setMontant(pl.getMontant() + montant);
		pl.setVilleDePlacement(villeDePlacement);
		cl.getPlacements().add(pl);
		pl.setClient(cl);

	}

	@Override
	public void deletePlacement(Placement pl, Client cl) {
		// TODO Auto-generated method stub
		cl.getPlacements().remove(pl);
		
	}

	

}
