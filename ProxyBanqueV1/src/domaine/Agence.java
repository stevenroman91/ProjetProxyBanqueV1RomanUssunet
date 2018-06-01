package domaine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Agence {
	
	//---------- Attributs de la Classe Agence
	
	private String idAgence;
	private String dateDeCreation;
	private Gerant gerant;
	private Adresse adresse;
	
	//---------- Constructeur de la Classe Agence
	
	public Agence() {
		super();
	}
	
	public Agence(String idAgence, String dateF) {
		super();
		this.idAgence = idAgence;
		this.dateDeCreation = dateF;
;
	}

	//---------- Getters & Setters

	public String getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(String idAgence) {
		this.idAgence = idAgence;
	}

	public String getDateDeCreation() {
		return dateDeCreation;
	}

	public void setDateDeCreation(String dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	//---------- Reecriture de la methode toString pour la classe Agence
	
	@Override
	public String toString() {
		return "Agence [idAgence=" + idAgence + ", dateDeCreation=" + dateDeCreation + ", gerant=" + gerant
				+ ", adresse=" + adresse + "]";
	}
	
}
