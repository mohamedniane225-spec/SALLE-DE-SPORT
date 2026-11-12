import java.util.ArrayList;
import java.util.List;

public class Salle {
    private String nom;
    private int capacité;
    private TypeSalle type;
    List<Equipements> equipements;
    public Salle(String nom, int capacité, TypeSalle type)
    {
        if(nom==null){throw new IllegalArgumentException("Mets un nom !");}
        if(capacité<=0){throw new IllegalArgumentException("Qu'est ce que tu raccontes frere !");}
        this.nom=nom;
        this.capacité=capacité;
        this.type=type;
        this.equipements=new ArrayList<>();
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

    public void setType(TypeSalle type) {
        this.type = type;
    }
}
