package newpackage;

public class Stagiaire extends Personne {
    private String niveauEtude;
    public Stagiaire(String nom, String prenom, String niveauEtude) {
        super(nom, prenom);
        this.niveauEtude = niveauEtude;
    }
    @Override
    public void afficher(){
        System.out.println("Nom:"+nom+",Prenom:"+prenom+",Niveau:"+niveauEtude);

    }


}
