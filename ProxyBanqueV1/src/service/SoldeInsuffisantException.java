package service;
/**
 * 
 * @author Quentin Ussunet et Steven Roman
 *
 */
public class SoldeInsuffisantException extends Exception {
	/**
	 * constructeur
	 * @param message prends message en parametre
	 */
	public SoldeInsuffisantException(String message) {

		super(message);

	}
}
