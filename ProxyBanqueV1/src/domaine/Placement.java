package domaine;

public class Placement {
	
	//---------- Attributs de la Classe Placement
	
	private double montant;
	private String villeDePlacement;
	private Client client;
	
	//---------- Constructeur de la Classe Placement
	
	public Placement(double montant, String villeDePlacement) {
		super();
		this.montant=montant;
		this.villeDePlacement=villeDePlacement;
	}
	
	//---------- Getters & Setters
	
	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getVilleDePlacement() {
		return villeDePlacement;
	}

	public void setVilleDePlacement(String villeDePlacement) {
		this.villeDePlacement = villeDePlacement;
	}
	
	//---------- Reecriture de la methode toString
	
	@Override
	public String toString() {
		return "Placement [client=" + client + ", villeDePlacement=" + villeDePlacement + "]";
	}
	

}
