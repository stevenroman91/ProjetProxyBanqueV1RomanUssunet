package domaine;
/**
 * 
 * @author Quentin Ussunet & Steven Roman
 *
 */
public class Personne {
	
	//---------- Attributs de la Classe Personne
	
	protected String nom;
	protected String prenom;
	protected Adresse adresse;
	private int idPersonne;
	
	//---------- Getters & Setters
	
	public String getNom() {
		return nom;
	}
	/**
	 * 
	 * @param nom nom de la personne
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	/**
	 * 
	 * @param prenom prenom de la personne
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * 
	 * @param adresse de la personne
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public int getIdPersonne() {
		return idPersonne;
	}
	/**
	 * 
	 * @param idPersonne identifiant de la personne
	 */
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	
	//---------- Reecriture de la methode toString

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}
	

}
