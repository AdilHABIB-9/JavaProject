package newpackage;
import java.util.ArrayList;
public class Stage {
    protected String titre;
    private int duree;
    private ArrayList<Stagiaire>stagiaires;
    public Stage(String titre, int duree) {
        this.titre = titre;
        this.duree = duree;
        this.stagiaires = new ArrayList<>();
    }
    public void ajouterStagiare(Stagiaire stagiaire) {
        stagiaires.add(stagiaire);

    }
    public void afficher() {
        System.out.println("Stage: " + titre+", duree: "+duree+"jours");
        if(stagiaires.isEmpty()) {
            System.out.println("aucun stagiaire est associe");
        }else{
            System.out.println("Stagiares:");
            for (Stagiaire stagiaire : stagiaires) {
                System.out.println(stagiaire.nom+" "+stagiaire.prenom);
            }

        }
    }
}
