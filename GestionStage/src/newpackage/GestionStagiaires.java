package newpackage;
import java.util.ArrayList;
import java.util.Scanner;
public class GestionStagiaires implements Gestion {
    private ArrayList<Stagiaire> stagiaires;
    private Scanner scanner;
    public GestionStagiaires(Scanner scanner) {
        this.stagiaires = new ArrayList<>();
        this.scanner = scanner;
    }
    @Override
    public void ajouter(){
        scanner.nextLine();
        System.out.println("Entrer le nom: ");
        String nom = scanner.nextLine();
        System.out.println("Entrer le prenom: ");
        String prenom = scanner.nextLine();
        System.out.println("Entrer le niveau d'etude: ");
        String niveau = scanner.nextLine();
        stagiaires.add(new Stagiaire(nom, prenom, niveau));
        System.out.println("Stagiaire ajoute");
    }
    @Override
    public void supprimer(){
        scanner.nextLine();
        System.out.println("nom du stagiaire a supprimer: ");
        String nom = scanner.nextLine();
        stagiaires.removeIf(stagiaire -> stagiaire.nom.equalsIgnoreCase(nom));
        System.out.println("Stagiaire supprime");

    }
    @Override
    public void afficher(){
        if (stagiaires.isEmpty()){
            System.out.println("Aucun stagiaire enregistre");

        }else{
            System.out.println("Liste des stagiaires: ");
            for (Stagiaire stagiaire : stagiaires){
                stagiaire.afficher();
            }
        }
    }

}
