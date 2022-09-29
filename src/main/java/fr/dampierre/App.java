package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        System.out.println("Bonjour");  

        // Récupérer le nombre d'heures travaillées
        // int heureTravaillees = 120;
        // Scanner clavier = new Scanner(System.in);
        // System.out.println("Entrer le nombre d'heures travaillées : ");
        // int heureTravaillees = clavier.nextInt();

        // Récupérer le taux horaire 
        // // double tauxHoraire = 10.5;
        // System.out.println("Entrer le taux Horaire : ");
        // double tauxHoraire = clavier.nextDouble();


        // // Multiplier le nombre d'heures par le taux horaire
        // double salaireBrut = tauxHoraire * heureTravaillees;

        // // Afficher le résulltat
        // System.out.println("Le salaire brut est de : " + salaireBrut);


        // COURS 


        // Scanner clavier = new Scanner(System.in);
        // System.out.println("Saisir un nom commun");
        // String mot1 = clavier.nextLine();

        // System.out.println("Saisir un nombre");
        // int nombre = clavier.nextInt();
        // clavier.nextLine();

        // System.out.println("Saisir le deuxieme nom commun");
        // String mot2 = clavier.nextLine();

        // System.out.println("Saisir un adjectif");
        // String adjectif = clavier.nextLine();
        
        // clavier.close();

        // String phrase = "Il était une fois un " + mot1 + " qui avait aussi " + nombre + " " + mot2 + ". Cela le rendait très " + adjectif + ".";

        // System.out.println(phrase);


        // Exercice 1

        int heure = 12;
        int minutes = 34;
        int secondes = 56;
        int resSecondes = heure * 3600 + minutes * 60 + secondes;
        System.out.println("Il s'est écoulé " + resSecondes +" secondes depuis minuit.");

        // Exercice 2

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrer les heures :");
        int heure1 = keyboard.nextInt();

        System.out.println("Entrer les minutes :");
        int minutes1 = keyboard.nextInt();

        System.out.println("Entrer les secondes :");
        int secondes1 = keyboard.nextInt();
        keyboard.close();

        int resSecondes1 = heure1 * 3600 + minutes1 * 60 + secondes1;
        System.out.println("Il s'est écoulé " + resSecondes1 +" secondes depuis minuit.");

        // Exercice 3

        // Scanner keyboard = new Scanner(System.in);
        // System.out.println("Entrer les heures :");
        // int heure = keyboard.nextInt();

        // System.out.println("Entrer les minutes :");
        // int minutes = keyboard.nextInt();

        // System.out.println("Entrer les secondes :");
        // int secondes = keyboard.nextInt();
        // keyboard.close();

        // int resSecondes = 24*3600 - (heure * 3600 + minutes * 60 + secondes);
        // System.out.println("Il y a encore " + resSecondes +" secondes avant minuit.");
        
        // Exercice 4

        // int secondesDebut = 45296;
        // int secondesFin = 15 * 3600 + 24*60 + 12;

        // double pourcentage = (secondesFin - secondesDebut);
        // pourcentage = pourcentage / 86400;

        // System.out.println(pourcentage * 100);

        // Exercice 5
        
        // System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
        // Random random = new Random();
        // int nb = random.nextInt(101);
        
        // Scanner clavier = new Scanner(System.in);

        // System.out.println("Entrez un nombre : ");
        // int NombreUtilisateur = clavier.nextInt();
        // clavier.close();

        // System.out.println("Vous proposez : " + NombreUtilisateur);
        // System.out.println("Le nombre auquel je pensais était : " + nb);

        // if (NombreUtilisateur == nb) {
        //     System.out.println("Vous avez trouvé le bon nombre !");
        // }
        // else {
            
        //     System.out.println("Vous étiez à "+ Math.abs(nb - NombreUtilisateur) + " de la bonne réponse.");
        // }
        
    }
}