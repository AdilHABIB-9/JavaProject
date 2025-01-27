package newpackage;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionStagiaires gestionStagiaires =new GestionStagiaires(scanner);
        GestionStages gestionStages=new GestionStages(scanner);
        int choix;
        do{
            System.out.println("\n Menu ");
            System.out.println("1. ajouter un stagiaire:");
            System.out.println("2. Afficher les stagiaires:");
            System.out.println("3. supprimer un stagiaire:");
            System.out.println("4. Ajouter un stage:");
            System.out.println("5. Afficher un stage:");
            System.out.println("6. Supprimer un stage:");
            System.out.println("7. Quitter.");
            System.out.println("choix: ");
            choix = scanner.nextInt();
            switch(choix){
                case 1 -> gestionStagiaires.ajouter();
                case 2 -> gestionStagiaires.afficher();
                case 3 -> gestionStagiaires.supprimer();
                case 4 -> gestionStages.ajouter();
                case 5 -> gestionStages.afficher();
                case 6 -> gestionStages.supprimer();
                case 7 -> System.out.println("Au revoir");
                default -> System.out.println("Choix invalide");
            }
        }while(choix!= 7);
        scanner.close();
    }
}

