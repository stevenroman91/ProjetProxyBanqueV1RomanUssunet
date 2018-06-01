package domaine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 * 
 * @author Quentin Ussunet et Steven Roman
 *
 */

public class ConseillerClientele extends Personne {
	
	//---------- Attributs de la Classe ConseillerClientelle 
	
	private int idConseillerClientele;
	private Gerant gerant;
	private Collection<Client> clients = new ArrayList<Client>();
	
	//---------- Constructeur de la Classe Conseillé Clientelle
	/**
	 * Normalement il nous suffit d'avoir un identifiant pour creer un Conseiller clientele
	 * @param idConseillerClientele identifiant du conseille clientele
	 */
	public ConseillerClientele(int idConseillerClientele) {
		super();
		this.idConseillerClientele = idConseillerClientele;
	}
	
	/**
	 * 
	 * @param nom nom du conseiller
	 * @param prenom prenom du conseiller
	 * @param idConseillerClientele identifiant du conseiller
	 */
	
	public ConseillerClientele(String nom, String prenom, int idConseillerClientele) {
		super.nom = nom;
		super.prenom = prenom;
		this.idConseillerClientele = idConseillerClientele;
	}
	
	//---------- Getters & Setters
	
	public int getIdConseillerClientele() {
		return idConseillerClientele;
	}
	/**
	 * 
	 * @param idConseillerClientele identifiant du conseillé
	 */
	public void setIdConseillerClientele(int idConseillerClientele) {
		this.idConseillerClientele = idConseillerClientele;
	}

	public Collection<Client> getClients() {
		return clients;
	}
	/**
	 * 
	 * @param clients liste des clients du conseiller
	 */
	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}
	public Gerant getGerant() {
		return gerant;
	}
	/**
	 * 
	 * @param gerant gerant du conseillé
	 */
	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}
	
	//---------- Reecriture de la methode toString

	@Override
	public String toString() {
		return "ConseillerClientele [idConseillerClientele=" + idConseillerClientele + ", nom="
				+ nom + ", prenom=" + prenom  + "]";
	}
	
}
	
