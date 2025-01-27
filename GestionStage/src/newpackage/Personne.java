package newpackage;

public class Personne {
    protected String nom;
    protected String prenom;
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public void afficher() {
        System.out.println("Nom: " + nom + " Prenom: " + prenom);
    }
}
