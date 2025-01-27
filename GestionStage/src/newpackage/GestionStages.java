package newpackage;
import java.util.ArrayList;
import java.util.Scanner;
public class GestionStages implements Gestion {
    private ArrayList<Stage> stages;
    private Scanner scanner;
    public GestionStages(Scanner scanner) {
        this.stages = new ArrayList<>();
        this.scanner = scanner;
    }
    @Override
    public void ajouter(){
        scanner.nextLine();
        System.out.println("titre du stage: ");
        String titre = scanner.nextLine();
        System.out.println("Duree en jours: ");
        int duree = scanner.nextInt();
        stages.add(new Stage(titre, duree));
        System.out.println("stage ajoute");
    }
    @Override
    public void supprimer(){
        scanner.nextLine();
        System.out.println("titre du stage a supprimer : ");
        String titre = scanner.nextLine();
        stages.removeIf(stage -> stage.titre.equalsIgnoreCase(titre));
        System.out.println("Stage supprime ");
    }
    @Override
    public void afficher(){
        if (stages.isEmpty()) {
            System.out.println("Aucun stage enregistre");
        }else{
            System.out.println("Liste des stages:");
            for (Stage stage : stages) {
                stage.afficher();
            }
        }
    }
}
