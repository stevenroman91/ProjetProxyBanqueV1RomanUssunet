package domaine;

public class Adresse {
	
	//---------- Attributs de la Classe Adresse 
	
	protected String adresse;
	protected int codePostal;
	protected String ville;
	
	//---------- Constructeurs de la Classe Adresse
	
	public Adresse() {
		super();
	}
	
	public Adresse(String adresse, int codePostal, String ville) {
		super();
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	//---------- Getters & Setters
	
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	//---------- Methode toString
	
	@Override
	public String toString() {
		return "Adresse:" + adresse + "," + codePostal + "," + ville;
	}
	

}
