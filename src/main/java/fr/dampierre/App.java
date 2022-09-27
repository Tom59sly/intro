package fr.dampierre;

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

        Scanner clavier = new Scanner(System.in);
        System.out.println("Saisir un nom commun");
        String nomCommun1 = clavier.next();

        System.out.println("Saisir un nombre");
        double nombre = clavier.nextDouble();

        System.out.println("Saisir le deuxieme nom commun");
        String nomCommun2 = clavier.next();

        System.out.println("Saisir un adjectif");
        String adjectif = clavier.next();
        
        clavier.close();

        System.out.println("Il était une fois un " + nomCommun1 + " qui avait aussi " + nombre + " " + nomCommun2 + ". Cela le rendait très " + adjectif+".");

        }
    }
