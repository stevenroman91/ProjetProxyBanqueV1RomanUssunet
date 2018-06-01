# ProxibanqueV1_Roman-Ussunet

## Introduction

> Cette application permet aux employ�s de banque de g�rer leurs clients / effectuer des virements / simuler des cr�dits / g�rer le partimoine de leurs clients et Auditer en interne leur agence.

## Code Samples

Vous trouverez les documents importants :
- javadoc : dossier /doc/index.html -> open with : web browser
- .jar : dossier /livrable/ProjetProxiBanqueV1RomanUssunet
- diagrammes de classe et de cas d'utilisation : dossier /DocumentsUML



> Exemple d'utilisation :
       - Il est possible d'ajouter un client depuis une instance conseiller clientele.

"Instance conseiller" = 2 dans le premier menu

"Gestion des Clients" = 1 dans le second menu

"Cr�ation client"  = 1 dans le troisi�me menu

    -le programme vous demande alors de saisir les information n�cessaires � la cr�ation d'un client.    

Laissez-vous alors guider en entrant les informations demand�s l'idClient est g�n�r� automatiquement afin d'�viter les doublons

    -il apparait alors dans la liste clients du conseiller ayant fait l'ajout

Le programme vous renvoi alors au troisi�me menu

    - il est alors possible pour le conseiller de modifier les informations des clients contenus dans sa liste comme l'adresse, le nom ou le prenom.
    
"Modification des informations client" = 2 dans le troisi�me menu

    - vous avez le choix de modifier un des param�tre (r�it�rer l'op�ration pour plus de modifications)
    - Les clients peuvent �tre supprim�s de la base de donn�s ce qui entraine l'effacement des compte et la d�sactivation des cartes (ATTENTION le solde du compte est perdu dans ce cas) et le retire de la liste client du conseiller.
   
"Suppression Client" = 3 dans le troisi�me menu
 
- tapez successivement "0" pour sortir de l'application

Des modification peuvent �tre apport�s le back est configur� : de nombreuses exceptions sont cod�es de mani�re a stabiliser au maximum le programme, pour g�rer le cr�dit des int�r�ts sur un compte �pargne par exemple ou encore pour g�rer les probl�mes lors de la saisie de la ville de placement dans le cadre de la gestion du patrimoine des clients fortun�s.

Le Virement compte � compte peut �tre pris en charge, les fonction d�biter et cr�diter de l'argent sont faites l'impl�mentation dans le front peut �tre r�alis�e.





## Installation

> Configuration n�cessaire pour execution :  jre 10.0.1 ;  modification des "Variables d'environnement pour votre compte" : 
- Ajouter variable JAVA_HOME + valeur = path /jre  +  ajouter dans PATH : %JAVA_HOME%\bin
- Se placer dans le fichier contenant le .jar par l'invite de commande
- Taper "java -jar ProjetProxiBanqueUssunetRoman.jar"
- Le Logiciel se lance, bonne utilisation !