public abstract class Personnes {
    private String nom;
    private String prenom;
    private int age;

    public Personnes(String nom, String prenom, int age)
    {
        if(nom==null || prenom==null ){
            throw new IllegalArgumentException("Veuiller entrer ET un nom svp !");
        }
        if(age<0){ throw new IllegalArgumentException("Veuiller entrer un age positif !");}
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
