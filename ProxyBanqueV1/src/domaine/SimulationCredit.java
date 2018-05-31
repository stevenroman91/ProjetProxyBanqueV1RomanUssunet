package domaine;

public class SimulationCredit {
	
	//---------- Attributs de la Classe SimulationCredit
	
	protected double montant;
	protected double taux;
	protected int duree;
	
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
	
	//---------- Reecriture de la methode toString
	
	@Override
	public String toString() {
		return "SimulationCredit [montant=" + montant + ", taux=" + taux + ", duree=" + duree + "]";
	}

}
