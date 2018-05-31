package domaine;

public class CarteBancaire {
	
	//---------- Attributs de la Classe Carte Bancaire
	
	private Compte compte;
	private boolean typeDeCarte;
	private int codeCarte;
	private String dateCreation;
	private String dateExpiration;
	private int cryptogramme;
	private boolean etatCarte;
	
	//---------- Constructeur de la classe carte
	
	public CarteBancaire() {
		super();
	}
	
	public CarteBancaire(Compte compte, boolean typeDeCarte) {
		super();
		this.compte = compte;
		this.typeDeCarte = typeDeCarte;
	}
	
	//---------- Getters & Setters
	
	
	public int getCodeCarte() {
		return codeCarte;
	}
	public void setCodeCarte(int codeCarte) {
		this.codeCarte = codeCarte;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public boolean isTypeDeCarte() {
		return typeDeCarte;
	}
	public void setTypeDeCarte(boolean typeDeCarte) {
		this.typeDeCarte = typeDeCarte;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	public int getCryptogramme() {
		return cryptogramme;
	}
	public void setCryptogramme(int cryptogramme) {
		this.cryptogramme = cryptogramme;
	}
	
	public boolean isEtatCarte() {
		return etatCarte;
	}

	public void setEtatCarte(boolean etatCarte) {
		this.etatCarte = etatCarte;
	}
	
	//---------- Reecriture de la methode toString
	
	@Override
	public String toString() {
		return "CarteBancaire [compte=" + compte + ", typeDeCarte=" + typeDeCarte + ", dateExpiration=" + dateExpiration
				+ "]";
	}
	
}
