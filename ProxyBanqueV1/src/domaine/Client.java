package domaine;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 * @author Quentin Ussunet et Steven Roman
 *
 */

public class Client extends Personne {
	
	//---------- Attributs de la Classe Client
	
	private int idClient;
	private int telephone;
	private boolean typeDeClient;
	private ConseillerClientele conseiller;
	private Collection<Compte> comptes = new ArrayList<Compte>();
	private Collection<Placement> placements = new ArrayList<Placement>();
	private static int nbClient=100000;
	
	//---------- Constructeur de la Classe Personne 

	/**
	 * Constructeur de la classe Personne
	 * @param nom nom de la personne
	 * @param prenom prenom de la personne
	 * @param adresse adresse de la personne
	 */
	
	public Client(String nom,String prenom, Adresse adresse) {
		super();
		super.nom = nom;
		super.prenom = prenom;
		super.adresse = adresse;
		this.idClient = nbClient++;

	}
	
	/**
	 * 
	 * @param nom nom de la personne
	 * @param prenom prenom de la personne
	 * @param adresse adresse de la personne
	 * @param typeDeClient particulier ou entreprise
	 */
	public Client(String nom,String prenom, Adresse adresse, boolean typeDeClient) {
		super();
		super.nom = nom;
		super.prenom = prenom;
		super.adresse = adresse;
		this.typeDeClient = typeDeClient;
		this.idClient = nbClient++;

	}

	//---------- Getters & Setters
	
	public int getIdClient() {
		return idClient;
	}
	/**
	 * 
	 * @param idClient permet de reperer le client
	 */
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	
	public int getTelephone() {
		return telephone;
	}
	/**
	 * 
	 * @param telephone telephone du client
	 */
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public boolean isTypeDeClient() {
		return typeDeClient;
	}

	/**
	 * 
	 * @param typeDeClient particulier ou entreprise
	 */
	public void setTypeDeClient(boolean typeDeClient) {
		this.typeDeClient = typeDeClient;
	}
	
	public ConseillerClientele getConseiller() {
		return conseiller;
	}
	/**
	 * 
	 * @param conseiller qui est son conseiller
	 */
	public void setConseiller(ConseillerClientele conseiller) {
		this.conseiller = conseiller;
	}

	public Collection<Compte> getComptes() {
		return comptes;
	}

	/**
	 * 
	 * @param comptes liste de ses comptes
	 */
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	
	public Collection<Placement> getPlacements() {
		return placements;
	}
	/**
	 * 
	 * @param placements liste de ses placements
	 */
	public void setPlacements(Collection<Placement> placements) {
		this.placements = placements;
	}
	
	//---------- Reecriture de la methode toString

	@Override
	public String toString() {
		return "\n Client: idClient = "+ idClient + ",nom = " + super.nom + ",prenom = " + super.prenom +",adresse = " + super.adresse+ ", typeDeClient = " + typeDeClient;
				}

}
