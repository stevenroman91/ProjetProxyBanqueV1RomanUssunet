package domaine;

public class CompteCourant extends Compte {

	// ---------- Attributs de la Classe Adresse

	private double decouvert = 1000;

	// ---------- Constructeurs de la Classe Adresse
	
	public CompteCourant(int numeroDeCompte, String dateOuvertureCompte, double decouvert) {
		super();
		super.numeroDeCompte = numeroDeCompte;
		super.dateOuvertureCompte = dateOuvertureCompte;
		this.decouvert = decouvert;
	}

	// ---------- Getters & Setters

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	// ---------- Methode toString

	@Override
	public String toString() {
		return "CompteCourant [numeroDeCompte = " + numeroDeCompte + " ; dateOuvertureCompte = "+dateOuvertureCompte + " ; decouvert=" + decouvert + "]";
	}
}
