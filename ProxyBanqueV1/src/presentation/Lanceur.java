package presentation;

import java.text.DateFormat; 
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import domaine.Adresse;
import domaine.Agence;
import domaine.Client;
import domaine.ConseillerClientele;
import domaine.Gerant;
import service.IService;
import service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale loc = new Locale("fr");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy", loc);
		Calendar date = Calendar.getInstance();

		String dateF = df.format(date.getTime());

		// MENU

		IService service = new ServiceImpl();
		Scanner sc = new Scanner(System.in);

		// Instanciation Agence
		Agence agence = new Agence("A7OPT", dateF);

		// Instanciation Gérant
		Gerant ge = new Gerant("LAMBERT", "Gérard", 101);

		// Instanciation Conseiller Clientele
		ConseillerClientele cc = new ConseillerClientele("JEAN", "Jean", 201);
		ConseillerClientele cc1 = new ConseillerClientele("DIDIER", "Franck", 202);

		// Instanciation Adresses
		Adresse adresse2 = new Adresse("2 rue deux", 75001, "paris");
		Adresse adresse3 = new Adresse("3 rue trois", 75001, "paris");
		Adresse adresse4 = new Adresse("4 rue quatre", 75001, "paris");

		// Instanciation Clients déjà présents
		// Client cl1 = new Client("FRANCE", "Pierre", adresse2);
		// cl1.getConseiller(cc);
		// Client cl2 = new Client("fydhj", "sdgsdh", adresse4);

		System.out.println("------ Bonjour, Identifiez-vous : ------");
		System.out.println("Taper 1 si vous êtes un Gérant");
		System.out.println("Taper 2 si vous êtes un Conseiller Clientèle");
		System.out.println("Taper 0 pour Sortir");
		int choix = sc.nextInt();

		while (choix != 0) {

			if (choix == 1) {

				System.out.println("------------ Bienvenu au Menu Gerant ! -------------");
				System.out.println("Que voulez-vous aujourd'hui ?");
				System.out.println("Taper 1 pour Réaliser un Audit interne");
				System.out.println("Taper 2 pour Parcourir la liste des Conseillés de l'Agence");
				System.out.println("Taper 0 pour Sortir");
				int choix1 = sc.nextInt();

				while (choix1 != 0) {

					if (choix1 == 1) {
						System.out.println("---------- Audit Interne ----------");
						// service.réaliserAudit();

					} else if (choix1 == 2) {
						System.out.println("----------Liste des Conseillers de l'Agence ----------");
						System.out.println(ge.getConseillers());
					} else {
						System.out.println("MAUVAIS CHOIX, MERCI DE RESAISSIR");
					}
					System.out.println("------------ Bienvenu au Menu Gerant ! -------------");
					System.out.println("Que voulez-vous aujourd'hui ?");
					System.out.println("Taper 1 pour Réaliser un Audit interne");
					System.out.println("Taper 2 pour Parcourir la liste des Conseillés de l'Agence");
					System.out.println("Taper 0 pour Sortir");
					choix1 = sc.nextInt();

				}

			} else if (choix == 2) {

				System.out.println("Bienvenu noble Conseiller Clientele !");
				System.out.println("Que souhaitez-vous faire aujourd'hui ?");
				System.out.println("Taper 1 pour Gérer un Client");
				System.out.println("Taper 2 pour Effectuer un Virement");
				System.out.println("Taper 3 pour Simuler un Crédit");
				System.out.println("Taper 4 pour Gérer un Patrimoine");
				System.out.println("Taper 0 pour Sortir");
				int choix2 = sc.nextInt();

				while (choix2 != 0) {

					if (choix2 == 1) {
						System.out.println("------------ GESTION CLIENT -----------");
						System.out.println("Taper 1 pour Créer un Client");
						System.out.println("Taper 2 pour Modifier un Client");
						System.out.println("Taper 3 pour Supprimer un Client");
						System.out.println("Taper 4 pour Lire les Information d'un Client");
						System.out.println("Taper 0 pour Revenir au Menu précédent");
						int choix3 = sc.nextInt();

						while (choix3 != 0) {

							if (choix3 == 1) {
								System.out.println("------- CREATION NOUVEAU CLIENT -------");
								System.out.println("Saisie des Informations du nouveau Client"); // Choix du type de
																									// client ??
								// demande idClient
								System.out.println("idClient :");
								int idClient = sc.nextInt();
								// demande du nom
								System.out.println("Nom :");
								String nom = sc.next();
								// cl.setNom(nom);
								// System.out.println(cl.getNom());
								// demande du prenom
								System.out.println("prenom :");
								String prenom = sc.next();
								// cl.setPrenom(prenom);
								// System.out.println(cl.getPrenom());
								System.out.println("Coordonnées :");
								System.out.println("adresse :");
								System.out.println("Merci de remplacer les espaces par des '-' ");
								String adresse = sc.next();
								// adresse1.setAdresse(adresse);
								// System.out.println(adresse1.getAdresse());
								System.out.println("code postal :");
								int codePostal = sc.nextInt();
								// adresse1.setCodePostal(codePostal);
								System.out.println("ville :");
								System.out.println("Merci de remplacer les espaces par des '-' ");
								String ville = sc.next();
								// adresse1.setVille(ville);

								Adresse adresse1 = new Adresse(adresse, codePostal, ville);
								Client cl = new Client(nom, prenom, adresse1, idClient);

								cl.setConseiller(cc);
								cc.getClients().add(cl);

								System.out.println("Client bien enregistré et attribué à son conseillé");
								System.out.println(cc.getClients().toString());

							} else if (choix3 == 2) {
								System.out.println("---------- MODIFICATION CLIENT ----------");
								System.out.println(cc.getClients().toString());
								System.out.println("Veuillez saisir l'idClient d'un client à modifier");
								int idClient = sc.nextInt();
								System.out.println("que désirez vous modifier ?");
								System.out.println("taper 1 pour modifier l'adresse");
								System.out.println("taper 2 pour modifier le nom");
								System.out.println("taper 3 pour modifier prenom");
								int choix5 = sc.nextInt();
								switch (choix5) {

								case 1:

									System.out.println("saisissez la nouvelle adresse");
									System.out.println("Coordonnées :");
									System.out.println("adresse :");
									System.out.println("Merci de remplacer les espaces par des '-' ");
									String adresse = sc.next();
									// adresse1.setAdresse(adresse);
									// System.out.println(adresse1.getAdresse());
									System.out.println("code postal :");
									int codePostal = sc.nextInt();
									// adresse1.setCodePostal(codePostal);
									System.out.println("ville :");
									System.out.println("Merci de remplacer les espaces par des '-' ");
									String ville = sc.next();

									Adresse adresse5 = new Adresse(adresse, codePostal, ville);
									for (Client client : cc.getClients()) {
										if (client.getIdClient() == idClient) {
											client.setAdresse(adresse5);
										}

									}
									break;
								case 2:

									System.out.println("Nom :");
									String nom = sc.next();
									for (Client client : cc.getClients()) {
										if (client.getIdClient() == idClient) {
											client.setNom(nom);
										}

									}
								break;
								case 3:
								
									System.out.println("prenom :");
									String prenom = sc.next();	
									for (Client client : cc.getClients()) {
										if (client.getIdClient() == idClient) {
											client.setPrenom(prenom);										}

									}
								break;
								}
							} else if (choix3 == 3) {
								System.out.println("---------- SUPPRESSION CLIENT -----------");
								System.out.println(cc.getClients());
								System.out.println("Veuillez saisir l'idClient d'un client à modifier");
								int idClient = sc.nextInt();
								for (Client client : cc.getClients()) {
									if (client.getIdClient() == idClient) {
										service.deletePersonne(client);
									}

								}
								

							} else if (choix3 == 4) {
								System.out.println("------- LIRE INFOS CLIENT --------");
								System.out.println(cc.getClients());
								System.out.println("Veuillez saisir l'idClient d'un client à modifier");
								int idClient = sc.nextInt();
								for (Client client : cc.getClients()) {
									if (client.getIdClient() == idClient) {
										service.readPersonne(client);
									}

								}
							} else {
								System.out.println("MAUVAIS CHOIX, MERCI DE RESAISSIR");
							}
							System.out.println("------------ GESTION CLIENT -----------");
							System.out.println("Taper 1 pour Créer un Client");
							System.out.println("Taper 2 pour Modifier un Client");
							System.out.println("Taper 3 pour Supprimer un Client");
							System.out.println("Taper 4 pour Lire les Information d'un Client");
							System.out.println("Taper 0 pour Revenir au Menu précédent");
							choix3 = sc.nextInt();

						}

					} else {
						System.out.println("MAUVAIS CHOIX, MERCI DE RESAISSIR");
					}
					System.out.println("Bienvenu noble Conseiller Clientele !");
					System.out.println("Que souhaitez-vous faire aujourd'hui ?");
					System.out.println("Taper 1 pour Gérer un Client");
					System.out.println("Taper 2 pour Effectuer un Virement");
					System.out.println("Taper 3 pour Simuler un Crédit");
					System.out.println("Taper 4 pour Gérer un Patrimoine");
					System.out.println("Taper 0 pour Sortir");
					choix2 = sc.nextInt();

				}
			} else {
				System.out.println("MAUVAIS CHOIX, MERCI DE RESAISSIR");
			}
			System.out.println("------  ReIdentifiez-vous : ------");
			System.out.println("Taper 1 si vous êtes un Gérant");
			System.out.println("Taper 2 si vous êtes un Conseiller Clientèle");
			System.out.println("Taper 0 pour Sortir");
			choix = sc.nextInt();
		}
	}

}
