# ProxibanqueV1_Roman-Ussunet

## Introduction

> Cette application permet aux employés de banque de gérer leurs clients / effectuer des virements / simuler des crédits / gérer le partimoine de leurs clients et Auditer en interne leur agence.

## Code Samples

Vous trouverez les documents importants :
- javadoc : dossier /doc/index.html -> open with : web browser
- .jar : dossier /livrable/ProjetProxiBanqueV1RomanUssunet
- diagrammes de classe et de cas d'utilisation : dossier /DocumentsUML



> Exemple d'utilisation :
       - Il est possible d'ajouter un client depuis une instance conseiller clientele.

"Instance conseiller" = 2 dans le premier menu

"Gestion des Clients" = 1 dans le second menu

"Création client"  = 1 dans le troisième menu

    -le programme vous demande alors de saisir les information nécessaires à la création d'un client.    

Laissez-vous alors guider en entrant les informations demandés l'idClient est généré automatiquement afin d'éviter les doublons

    -il apparait alors dans la liste clients du conseiller ayant fait l'ajout

Le programme vous renvoi alors au troisième menu

    - il est alors possible pour le conseiller de modifier les informations des clients contenus dans sa liste comme l'adresse, le nom ou le prenom.
    
"Modification des informations client" = 2 dans le troisième menu

    - vous avez le choix de modifier un des paramètre (réitérer l'opération pour plus de modifications)
    - Les clients peuvent être supprimés de la base de donnés ce qui entraine l'effacement des compte et la désactivation des cartes (ATTENTION le solde du compte est perdu dans ce cas) et le retire de la liste client du conseiller.
   
"Suppression Client" = 3 dans le troisième menu
 
- tapez successivement "0" pour sortir de l'application

Des modification peuvent être apportés le back est configuré : de nombreuses exceptions sont codées de manière a stabiliser au maximum le programme, pour gérer le crédit des intérêts sur un compte épargne par exemple ou encore pour gérer les problèmes lors de la saisie de la ville de placement dans le cadre de la gestion du patrimoine des clients fortunés.

Le Virement compte à compte peut être pris en charge, les fonction débiter et créditer de l'argent sont faites l'implémentation dans le front peut être réalisée.





## Installation

> Configuration nécessaire pour execution :  jre 10.0.1 ;  modification des "Variables d'environnement pour votre compte" : 
- Ajouter variable JAVA_HOME + valeur = path /jre  +  ajouter dans PATH : %JAVA_HOME%\bin
- Se placer dans le fichier contenant le .jar par l'invite de commande
- Taper "java -jar ProjetProxiBanqueUssunetRoman.jar"
- Le Logiciel se lance, bonne utilisation !