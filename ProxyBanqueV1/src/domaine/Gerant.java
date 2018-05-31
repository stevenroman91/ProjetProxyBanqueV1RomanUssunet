package domaine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;


public class Gerant extends Personne {
	
	//---------- Attributs de la Classe Gerant
	
	private int idGerant;
	private Collection<ConseillerClientele> conseillers = new ArrayList<ConseillerClientele>();

	//---------- Constructeurs de la Classe Gerant
	
	public Gerant(int idGerant) {
		super();
		this.idGerant = idGerant;
	}
	
	public Gerant(String nom, String prenom, int idGerant) {
		super.nom = nom;
		super.prenom = prenom;
		this.idGerant = idGerant;
	}
	
	//---------- Getters & Setters
	
	public int getIdGerant() {
		return idGerant;
	}

	public void setIdGerant(int idGerant) {
		this.idGerant = idGerant;
	}

	public Collection<ConseillerClientele> getConseillers() {
		return conseillers;
	}

	public void setConseillers(Collection<ConseillerClientele> conseillers) {
		this.conseillers = conseillers;
	}
	
	//---------- Reecriture de la methode toString
	
	@Override
	public String toString() {
		return "Gerant [idGerant=" + idGerant + ", conseillers=" + conseillers + "]";
	}
	
	
	
	
}
