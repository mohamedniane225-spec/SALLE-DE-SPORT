public abstract class Equipements  {
    private String marque;
    private float poids;
    public Equipements(String marque, float poids) {
        if(poids <= 0 ) {
            throw new IllegalArgumentException("L'age doit etre strictement positif !");
        }
        if(marque==null){
            throw new IllegalArgumentException("Le nom est vide !");
        }
        this.marque=marque;
        this.poids = poids;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public String getNom() {
        return marque;
    }

    public void setNom(String nom) {
        this.marque = nom;
    }

    @Override
    public String toString() {
        return "Equipements{" +
                "marque='" + marque + '\'' +
                ", poids=" + poids +
                '}';
    }
}

