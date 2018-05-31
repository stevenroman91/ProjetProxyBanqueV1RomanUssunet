package domaine;

import java.util.ArrayList;
import java.util.Collection;

public class Client extends Personne {
	
	//---------- Attributs de la Classe Client
	
	private int telephone;
	private boolean typeDeClient;
	private boolean statutFortune;
	private Collection<Compte> comptes = new ArrayList<Compte>();

	
	//---------- Constructeur de la Classe Personne 

	public Client(String nom,String prenom, Adresse adresse) {
		super();
		super.nom = nom;
		super.prenom = prenom;
		super.adresse = adresse;
	}
	
	public Client(String nom,String prenom, Adresse adresse, boolean typeDeClient) {
		super();
		super.nom = nom;
		super.prenom = prenom;
		super.adresse = adresse;
		this.typeDeClient = typeDeClient;
	}

	//---------- Getters & Setters
	
	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public boolean isTypeDeClient() {
		return typeDeClient;
	}

	public void setTypeDeClient(boolean typeDeClient) {
		this.typeDeClient = typeDeClient;
	}

	public boolean isStatutFortune() {
		return statutFortune;
	}

	public void setStatutFortune(boolean statutFortune) {
		this.statutFortune = statutFortune;
	}

	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}

	@Override
	public String toString() {
		return "Client: nom " + super.nom + ",prenom " + super.prenom +",adresse " + super.adresse+ ", typeDeClient=" + typeDeClient;
				}
	
	//---------- Reecriture de la methode toString
	
	

}
