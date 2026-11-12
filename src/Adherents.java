public class Adherents extends Personnes{
    private Abonnements abonnement;
    public Adherents(String nom, String prenom, int age, Abonnements abonnements) {
        super(nom, prenom, age);
        this.abonnement=abonnements;
    }

    public Abonnements getAbonnement() {
        return abonnement;
    }

    public void setAbonnement(Abonnements abonnement) {
        this.abonnement = abonnement;
    }
}
