package domaine;

public class SimulationCredit {
	
	//---------- Attributs de la Classe SimulationCredit
	
	private double montant;
	private double taux;
	private int duree;
	private boolean typedeCredit;

	//---------- Constructeur de la Classe SimulationCredit
	
	public SimulationCredit(double montant, double taux, int duree, boolean typedeCredit) {
		super();
		this.montant = montant;
		this.taux = taux;
		this.duree = duree;
		this.typedeCredit = typedeCredit;
	}
	
	//---------- Getters & Setters
	
	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public boolean isTypedeCredit() {
		return typedeCredit;
	}

	public void setTypedeCredit(boolean typedeCredit) {
		this.typedeCredit = typedeCredit;
	}
	
	//---------- Reecriture de la methode toString
	
	@Override
	public String toString() {
		return "SimulationCredit [montant=" + montant + ", taux=" + taux + ", duree=" + duree + ", typedeCredit="
				+ typedeCredit + "]";
	}


}
