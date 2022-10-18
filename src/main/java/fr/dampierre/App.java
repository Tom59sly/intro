package fr.dampierre;

import java.time.YearMonth;
import java.util.Random;
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
        couleur = couleur.trim(); // Enlève espace avant et après
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

    public static int nbJoursDuMois(int nbMois) {
        if (nbMois == 1 || nbMois == 3 || nbMois == 5 || nbMois == 7 || nbMois == 8 || nbMois == 10 || nbMois == 12 ) {
            return 31;
        }
        else if (nbMois == 2) {
            return 28;
        }
        else if (nbMois == 4 || nbMois == 6 || nbMois == 9 || nbMois == 11){
            return 30;
        }
        else{
            return 0;
        }
    }
    public static boolean estBissextile(int annee) {
        if (annee % 400 == 0){
            return true;
        }
        else if (annee % 4 == 0 && annee % 100 != 0){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static int nbJoursDuMois2(int mois, int annee) {
        boolean anneeBisextile = estBissextile(annee);

        if (anneeBisextile && mois == 2){
            return 29;
        }
        else{
            return nbJoursDuMois(mois);
        }
    }

    public static int nbJoursDuMois3(int mois, int annee) {
        YearMonth date = YearMonth.of(annee, mois);
        return date.lengthOfMonth();
    }

    public static void sommePairsEtMax(Scanner clavier) {
        System.out.println("Combien d'entiers ? ");
        int nbEntiers = clavier.nextInt();
        int additionEntiersPairs = 0;
        int plusGrandEntier = 0;

        for (int i = 0; i < nbEntiers; i++) {
            System.out.println("Entrez un entier :");
            int entier = clavier.nextInt();
            if (entier % 2 == 0) {
                additionEntiersPairs += entier;                
            } 
            if (plusGrandEntier < entier || i == 0){
                plusGrandEntier = entier;
            }
        }
        System.out.println("Somme des nombres pairs = "+ additionEntiersPairs +" , plus grand nombre = " + plusGrandEntier +".");
    }
    // TP3 - BOUCLES
    public static void suite2() {
        int nombre0 = 0;
        int nombre1 = 1;
        int resultat;
        System.out.println(nombre0 + " " + nombre1);          
        for (int i = 1; i < 20; i++) {
            resultat = nombre0 + nombre1;
            System.out.println(resultat);
            nombre0 = nombre1;
            nombre1 = resultat;
        }
    }
    public static void suite3() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * i);
        }
    }
    public static void suite4() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(Math.round(Math.pow(i, 2)) + " ");
        }
    }

    public static void motif1() {
        for (int j = 1; j <= 40; j++) {
            System.out.print('-');
        }
        System.out.println();
        for (int j = 0; j < 10; j++) {
            System.out.print("_-^-");
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(j+""+j);         
            }
            System.out.print("00");
        }
        System.out.println();
        for (int j = 1; j <= 40; j++) {
            System.out.print('-');
        }
    }

    public static void motif2() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void motif3() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void motif4() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j<=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void motif5() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.println();
        }
    }

    public static void motif6() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
            System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void motif7() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(j);
                }
            }  
            System.out.println();          
        }
        
    }

    public static void motif8() {
        for (int i = 0; i < 5; i++) {
            for (int j = 9; j >= 0; j--) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(j);
                }
            }  
            System.out.println();          
        }
    }

    public static void motif9() {
        for (int i = 0; i < 4; i++) {
            for (int j = 9; j > 0; j--) {
                for (int j2 = 0; j2 < j; j2++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void motif10() {
        for (int i = 1; i <= 9; i+=2) {
            for (int j = 0; j < (11 - i) / 2; j++) {
                System.out.print("-");
            }

            for (int j = 0; j <i; j++) {
                System.out.print(i);
            }
            for (int j = 0; j < (11 - i) / 2; j++) {
                System.out.print("-");
            }

            System.out.println();
        }
    }

    public static void motif11() {
        for (int i = 0; i <= 5; i+=1) {
            for (int j = 0; j < i*2; j++) {
                System.out.print("\\");
            }
            for (int j = 0; j <= 22 - i*4 -1 ; j++) {
                System.out.print("!");
            }
            for (int j = 0; j < i*2; j++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }

    public static void motif11Bis(int hauteur) {
        // Valeur début 
        for (int i = 0; i < hauteur; i+=1) {
            for (int j = 0; j < i*2; j++) {
                System.out.print("\\");
            }   
            for (int j = 0; j <= (hauteur * 4 - i*4) - 3; j++) {
                System.out.print("!");
            }
            for (int j = 0; j < i*2; j++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }

    // TP4 - Jeu a deviner

    public static void main(String[] args) {
        // demanderEntierEtAfficherParite(); // 1
        // LettreCouleurAssociee(); // 4
        // System.out.println(estCapitalise("Bonjour")); // 5
        // System.out.println(estCapitalise("bonjour")); // 5
        // System.out.println(nbLettres("AZERTY")); // 6
        // System.out.println(nbJoursDuMois(6));
        // System.out.println(estBissextile(2100));
        // System.out.println(nbJoursDuMois2(2, 2000));
        // System.out.println(nbJoursDuMois3(12, 2003));
        // sommePairsEtMax(new Scanner(System.in));
        // CafeCreme();
        // JeuDe();
        // suite2();
        // suite3();
        // suite4();
        // motif1();
        // motif2();
        // motif3();
        // motif4();
        // motif5();
        // motif6();
        // motif7();
        // motif8();
        // motif9();
        // motif10();
        // motif11();
        // motif11Bis(8);
    }   


    // Cours Boucles
    public static void JeuDe() {
        int nbCases = 20;
        int casesParcourues = 0;
        int nbLancer = 5;
        int nbEssai = 0;
        boolean estGagne = false;
        Random generator = new Random();
        while (!estGagne) {
            nbEssai += 1;
            casesParcourues = 0;
            for (int i = 0; i < nbLancer && casesParcourues != 20; i++) {
                int lancer = generator.nextInt(6) + 1;
                casesParcourues += lancer;
            System.out.println("Vous avez obtenu le nombre : " + lancer + ", " + casesParcourues + " cases parcourues");
            }

            if (casesParcourues == nbCases) {
                System.out.println("Gagné en : " + nbEssai + " coups.");
                estGagne = true;
            } 
            
            else {
                System.out.println("Perdu vous avez parcouru " + casesParcourues);
            }
        }
    }


    // COURS OPERATEURS LOGIQUES
    // && -> ET
    // || -> OU
    // ! ->  non
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
