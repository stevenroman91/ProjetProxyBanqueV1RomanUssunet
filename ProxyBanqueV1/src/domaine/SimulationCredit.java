package domaine;

public class SimulationCredit {
	
	//---------- Attributs de la Classe SimulationCredit
	
	private double montant;
	private double taux;
	private int duree;
	private boolean typeDeCredit;
	//private double mensualite;

	//---------- Constructeur de la Classe SimulationCredit
	
	public SimulationCredit(double montant, double taux, int duree, boolean typeDeCredit) {//, double mensualite
		super();
		this.montant = montant;
		this.taux = taux;
		this.duree = duree;
		this.typeDeCredit = typeDeCredit;
		//this.mensualite = mensualite;
	}
	
	//---------- Getters & Setters
	
	/*public double getMensualite() {
		return mensualite;
	}

	public void setMensualite(double mensualite) {
		this.mensualite = mensualite;
	}*/
	
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

	public boolean isTypeDeCredit() {
		return typeDeCredit;
	}

	public void setTypeDeCredit(boolean typedeCredit) {
		this.typeDeCredit = typedeCredit;
	}
	
	//---------- Reecriture de la methode toString
	
	@Override
	public String toString() {
		return "SimulationCredit [montant=" + montant + ", taux=" + taux + ", duree=" + duree + ", typedeCredit="
				+ typeDeCredit + "]";
	}


}
