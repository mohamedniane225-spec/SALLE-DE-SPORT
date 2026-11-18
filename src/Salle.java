import java.util.ArrayList;
import java.util.List;

public class Salle implements Reservable {
    private String nom;
    private int capacité;
    private TypeSalle type;
    List<Equipements> equipements;
    private boolean disponible= true;
    public Salle(String nom, int capacité, TypeSalle type)
    {
        if(nom==null){throw new IllegalArgumentException("Mets un nom !");}
        if(capacité<=0){throw new IllegalArgumentException("Qu'est ce que tu raccontes frere !");}
        this.nom=nom;
        this.capacité=capacité;
        this.type=type;
        this.equipements=new ArrayList<>();
    }
    public void Equippements(Equipements e)
    {
        this.equipements.add(e);
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacité() {
        return capacité;
    }

    public void setCapacité(int capacité) {
        this.capacité = capacité;
    }

    public TypeSalle getType() {
        return type;
    }

    @Override
    public String toString() {
        return
                 nom + '\'' +
                ", capacité=" + capacité +
                ", type=" + type +
                ", equipements=" + equipements ;
    }
    @Override
    public boolean reserver(){
        if(disponible){disponible=false;
        return true;}
        else{System.out.println("la salle est indisponible");
            return false;}
    }
    public void RendreDisponible(){
        disponible=true;
    }
}
