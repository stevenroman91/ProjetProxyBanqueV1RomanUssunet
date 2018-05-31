package domaine;

public class Compte {
	
	//---------- Attributs de la Classe Adresse 
	
	protected int numeroDeCompte;
	protected double solde=0.;
	protected String dateOuvertureCompte;
	
		
	
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
	public String getDateOuvertureCompte() {
		return dateOuvertureCompte;
	}
	public void setDateOuvertureCompte(String dateOuvertureCompte) {
		this.dateOuvertureCompte = dateOuvertureCompte;
	}
	
}
