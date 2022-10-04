package fr.dampierre;

import java.util.Scanner;
// import java.util.Random;

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
        clavier.close();
        if (couleur.equals("R") || couleur.equals("r")) {
            System.out.println("Vous avez choisi le rouge.");            
        }
        else if (couleur.equals("V") || couleur.equals("v")) {
            System.out.println("Vous avez choisi le vert.");
        }
        else if (couleur.equals("B") || couleur.equals("b")) {
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
    
    public static void main(String[] args) {
        // demanderEntierEtAfficherParite(); // 1
        // LettreCouleurAssociee(); // 4
        // System.out.println(estCapitalise("Bonjour")); // 5
        // System.out.println(estCapitalise("bonjour")); // 5
        // System.out.println(nbLettres("AZERTY")); // 6
        CafeCreme();    
    }   

    // COURS OPERATEURS LOGIQUES
    // && -> ET
    // || -> OU
    // ! -> 
    // COURS IF/ELSE
    public static void CafeCreme() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Pièces de 1 cents ? ");
        int piece1 = clavier.nextInt();
        System.out.println("Pièces de 2 cents ? ");
        int piece2 = clavier.nextInt();
        System.out.println("Pièces de 5 cents ? ");
        int piece5 = clavier.nextInt();
        System.out.println("Pièces de 10 cents ? ");
        int piece10 = clavier.nextInt();
        System.out.println("Pièces de 20 cents ? ");
        int piece20 = clavier.nextInt();
        System.out.println("Pièces de 50 cents ? ");
        int piece50 = clavier.nextInt();
        clavier.close();

        int totalPiece = piece1 + piece2 * 2 + piece5 * 5 + piece10 * 10 + piece20 * 20 + piece50 * 50; // EN CENTIMES
        // double totalPiece = piece1 * 0.01 + piece2 * 0.02 + piece5 * 0.05+ piece10 * 0.1 + piece20 * 0.2 + piece50 *0.5; // EN EURO
        // Remplacer 100 par 1 EN EURO
        if (totalPiece < 100) {
            int pieceManquante = 100 - totalPiece;
            System.out.println("Il vous manque " + pieceManquante + " pour prendre un café." );            
        }
        else if (totalPiece > 100) {
            int pieceSupplementaire = totalPiece - 100;
            System.out.println("Il vous restera " + pieceSupplementaire + " après avoir pris un café.");
        }
        else {
            System.out.println("Vous avez exactement de quoi payer le café !");
        }
    }
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
    
}
