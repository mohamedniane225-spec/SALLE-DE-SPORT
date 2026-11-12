public abstract class Equipements  {
    private String nom;
    private float poids;
    public Equipements(String nom, float poids) {
        if(poids <= 0 ) {
            throw new IllegalArgumentException("L'age doit etre strictement positif !");
        }
        if(nom==null){
            throw new IllegalArgumentException("Le nom est vide !");
        }
        this.nom = nom;
        this.poids = poids;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}

