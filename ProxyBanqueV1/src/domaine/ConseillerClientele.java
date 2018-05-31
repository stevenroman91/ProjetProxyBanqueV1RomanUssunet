package domaine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class ConseillerClientele extends Personne {
	
	//---------- Attributs de la Classe ConseillerClientelle 
	
	private int idConseillerClientele;
	private Collection<Client> clients = new ArrayList<Client>();
	
	//---------- Constructeur de la Classe Conseillé Clientelle
	
	public ConseillerClientele(int idConseillerClientele) {
		super();
		this.idConseillerClientele = idConseillerClientele;
	}
	
	public ConseillerClientele(String nom, String prenom, int idConseillerClientele) {
		super.nom = nom;
		super.prenom = prenom;
		this.idConseillerClientele = idConseillerClientele;
	}
	
	//---------- Getters & Setters
	
	public int getIdConseillerClientele() {
		return idConseillerClientele;
	}

	public void setIdConseillerClientele(int idConseillerClientele) {
		this.idConseillerClientele = idConseillerClientele;
	}

	public Collection<Client> getClients() {
		return clients;
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}
	
	//---------- Reecriture de la methode toString
	
	@Override
	public String toString() {
		return "ConseillerClientele [idConseillerClientele=" + idConseillerClientele + ", nom="
				+ nom + ", prenom=" + prenom  + "]";
	}
	
}
	
