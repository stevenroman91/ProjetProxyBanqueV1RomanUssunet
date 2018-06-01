package domaine;

public class CompteEpargne extends Compte {

	// ---------- Attributs de la Classe Adresse

	private double taux = 0.03;

	// ---------- Constructeurs de la Classe Adresse
	
	public CompteEpargne(int numeroDeCompte, String dateOuvertureCompte, double taux) {
		super();
		super.numeroDeCompte = numeroDeCompte;
		super.dateOuvertureCompte = dateOuvertureCompte;
		this.taux = taux;
		super.typeDeCompte = true;
	}

	// ---------- Getters & Setters

	public double getTaux() {
		return taux;
	}



	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	// ---------- Methode toString

	@Override
	public String toString() {
		return "CompteEpargne [numeroDeCompte = " + numeroDeCompte + " ; dateOuvertureCompte = "+dateOuvertureCompte + " ; taux=" + taux + "]";
	}
}
