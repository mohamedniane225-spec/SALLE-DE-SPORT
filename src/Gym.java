import java.util.ArrayList;
import java.util.List;

public class Gym {
    private int capacité;
    private String nom;
    private List<Salle> salles;
    private List<Coach> coachs;
    private List<Adherents> adherents;
    public Gym(int capacité, String nom, List<Salle> sallesInitiales)
    {
        if(capacité<0 || nom==null){
            throw new IllegalArgumentException("Impossible mgl");
        }
        this.capacité=capacité;
        this.nom=nom;
        if (sallesInitiales == null || sallesInitiales.isEmpty()) {
            throw new IllegalArgumentException("Un Gym doit comporter au moins une salle."); }
            this.salles = new ArrayList<>(sallesInitiales);
        this.coachs = new ArrayList<>();
        this.adherents = new ArrayList<>();
    }
    public void ajouterCoach(Coach nouveauCoach) {
        this.coachs.add(nouveauCoach);}
    public void ajouterAdherent(Adherents nouvelAdherent) {
        if (nouvelAdherent != null) {
            this.adherents.add(nouvelAdherent);}
    }

    public int getCapacité() {
        return capacité;
    }

    public void setCapacité(int capacité) {
        this.capacité = capacité;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Salle> getSalles() {
        return salles;
    }

    public List<Adherents> getAdherents() {
        return adherents;
    }

    public List<Coach> getCoachs() {
        return coachs;
    }
}
