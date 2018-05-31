package domaine;

import java.util.ArrayList;
import java.util.Collection;

public class Compte {
	
	//---------- Attributs de la Classe Adresse 
	
	protected int numeroDeCompte;
	protected double solde=0.;
	protected Client titulaireduCompte;
	protected String dateOuvertureCompte;
	protected CarteBancaire carte;
	
		
	
	//---------- Getters & Setters

	public int getNumeroDeCompte() {
		return numeroDeCompte;
	}
	public void setNumeroDeCompte(int numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getTitulaireduCompte() {
		return titulaireduCompte;
	}
	public void setTitulaireduCompte(Client titulaireduCompte) {
		this.titulaireduCompte = titulaireduCompte;
	}
	public String getDateOuvertureCompte() {
		return dateOuvertureCompte;
	}
	public void setDateOuvertureCompte(String dateOuvertureCompte) {
		this.dateOuvertureCompte = dateOuvertureCompte;
	}
	public CarteBancaire getCarte() {
		return carte;
	}
	public void setCarte(CarteBancaire carte) {
		this.carte = carte;
	}
	
	// ---------- Reecriture de la methode toString
	
	@Override
	public String toString() {
		return "Compte [numeroDeCompte=" + numeroDeCompte + ", solde=" + solde + ", dateOuvertureCompte="
				+ dateOuvertureCompte + "]";
	}
	
}
