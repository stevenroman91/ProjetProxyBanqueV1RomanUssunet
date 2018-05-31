package domaine;

public class Placement {
	
	//---------- Attributs de la Classe Placement
	
	private Client client;
	private String villeDePlacement;

	//---------- Constructeur de la Classe Placement
	
	public Placement(Client client) {
		super();
		this.client = client;
	}
	
	//---------- Getters & Setters
	
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
