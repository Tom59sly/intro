package fr.dampierre;

import java.util.Scanner;
// import java.util.Random;

import javax.annotation.processing.SupportedSourceVersion;

public class App {
    // TP2
    public static void demanderEntierEtAfficherParite() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre :");
        int nombre = clavier.nextInt();
        clavier.close();

        if (nombre % 2 == 0){
            System.out.println(nombre + " est pair.");
        }
        else{
            System.out.println(nombre + " est impair");
        }
    }
    
    public static void LettreCouleurAssociee() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Quelle couleur souhaitez vous ?");
        String couleur = clavier.nextLine();
        couleur.toUpperCase();
        clavier.close();
        if (couleur.equals("R")) {
            System.out.println("Vous avez choisi le rouge.");            
        }
        else if (couleur.equals("V")) {
            System.out.println("Vous avez choisi le vert.");
        }
        else if (couleur.equals("B")) {
            System.out.println("Vous avez choisi le bleu.");
        }
        else {
            System.out.println("Connais pas.");
        }
    }

    public static boolean estCapitalise(String mot) {
        if (Character.isUpperCase(mot.charAt(0)) == true) {
            return true;
        }
        else {
            return false;
        }        
    }

    public static int nbLettres(String phrase) {
        return phrase.length();        
    }
    
    // COURS IF/ELSE

    // public static void main(String[] args) {

    //     int salaire = 400;
    //     int prime = 250;
    //     int quota = 10;
    //     Scanner clavier = new Scanner(System.in);
        
    //     System.out.println("Entrez nombre de ventes : ");
    //     int nbVentes = clavier.nextInt();
    //     clavier.close();

    //     if (nbVentes >= quota){
    //         salaire += prime;
    //         System.out.println("Félicitations ! Vous avez rempli le quota.");
    //     }
    //     else{
    //         int nbVentesManquantes = quota - nbVentes;
    //         System.out.println("Il vous manque " + nbVentesManquantes + " ventes pour atteindre le quota");
    //     }
    //     System.out.println("Votre salaire est de :" + salaire);
    // }

    // public static void main(String[] args) {

    //     int salaire = 400;
    //     int prime = 250;
    //     int quota = 10;
    //     Scanner clavier = new Scanner(System.in);
        
    //     System.out.println("Entrez nombre de ventes : ");
    //     int nbVentes = clavier.nextInt();
    //     clavier.close();

    //     if (nbVentes >= quota){
    //         salaire += prime;
    //     }

    //     System.out.println(salaire);
    // }

    // public static void main(String[] args) {
    //     Scanner clavier = new Scanner(System.in);
        
    //     System.out.println("Entrez les heures : ");
    //     int heures = clavier.nextInt();
    //     System.out.println("Entrez les minutes : ");
    //     int minutes = clavier.nextInt();
    //     System.out.println("Entrez les secondes : ");
    //     int secondes = clavier.nextInt();
    //     clavier.close();

    //     int secondesDepuisMinuit = heures * 60 * 60 + minutes * 60 + secondes;

    //     System.out.println("Il s'est écoulé " + secondesDepuisMinuit + " secondes depuis minuit");
    // }
    
    // public static void main(String[] args) {
    //     int heures = 12;
    //     int minutes = 34;
    //     int secondes = 56;

    //     int secondesDepuisMinuit = heures * 60 * 60 + minutes * 60 + secondes;

    //     System.out.println("Il s'est écoulé " + secondesDepuisMinuit + " secondes depuis minuit");
    // }
    
    // public static void main(String[] args) {

        // Récupérer le nombre d'heures travaillées
        // int heureTravaillees = 120;
        // Scanner clavier = new Scanner(System.in);
        // System.out.println("Entrer le nombre d'heures travaillées : ");
        // int heureTravaillees = clavier.nextInt();

        // Récupérer le taux horaire 
        // double tauxHoraire = 10.5;
        // System.out.println("Entrer le taux Horaire : ");
        // double tauxHoraire = clavier.nextDouble();


        // Multiplier le nombre d'heures par le taux horaire
        // double salaireBrut = tauxHoraire * heureTravaillees;

        // Afficher le résulltat
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

        // String phrase = "Il était une fois un " + mot1 + " qui avait aussi " + nombre + " " + mot2 + ". Cela le rendait très" + "adjectif "+ ".";

        // System.out.println(phrase);


        //Exercice 1

        // int heure = 12;
        // int minutes = 34;
        // int secondes = 56;
        // int resSecondes = heure * 3600 + minutes * 60 + secondes;
        // System.out.println("Il s'est écoulé " + resSecondes +" secondes depuis minuit.");

        // Exercice 2

        // Scanner keyboard = new Scanner(System.in);
        // System.out.println("Entrer les heures :");
        // int heure1 = keyboard.nextInt();

        // System.out.println("Entrer les minutes :");
        // int minutes1 = keyboard.nextInt();

        // System.out.println("Entrer les secondes :");
        // int secondes1 = keyboard.nextInt();
        // keyboard.close();

        // int resSecondes1 = heure1 * 3600 + minutes1 * 60 + secondes1;
        // System.out.println("Il s'est écoulé " + resSecondes1 +" secondes depuis minuit.");

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
    public static void main(String[] args) {
        // demanderEntierEtAfficherParite(); // 1
        // LettreCouleurAssociee(); // 4
        System.out.println(estCapitalise("Bonjour")); // 5
        System.out.println(estCapitalise("bonjour")); // 5
        System.out.println(nbLettres("AZERTY"));
    }
}
