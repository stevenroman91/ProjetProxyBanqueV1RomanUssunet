package domaine;

import java.util.ArrayList;
import java.util.Collection;

public class Client extends Personne {
	
	//---------- Attributs de la Classe Client
	
	private int idClient;
	private int telephone;
	private boolean typeDeClient;
	private ConseillerClientele conseiller;
	private Collection<Compte> comptes = new ArrayList<Compte>();
	private Collection<Placement> placements = new ArrayList<Placement>();
	
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
	
	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	
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
	
	public ConseillerClientele getConseiller() {
		return conseiller;
	}

	public void setConseiller(ConseillerClientele conseiller) {
		this.conseiller = conseiller;
	}

	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	
	public Collection<Placement> getPlacements() {
		return placements;
	}

	public void setPlacements(Collection<Placement> placements) {
		this.placements = placements;
	}
	
	//---------- Reecriture de la methode toString

	@Override
	public String toString() {
		return "Client: nom " + super.nom + ",prenom " + super.prenom +",adresse " + super.adresse+ ", typeDeClient=" + typeDeClient;
				}

}
