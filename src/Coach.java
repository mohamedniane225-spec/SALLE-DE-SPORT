public class Coach extends Personnes {
private String spécialité;
public Coach(String nom, String prenom, int age, String spécialité) {
    super(nom, prenom, age);
    this.spécialité=spécialité;
}

    public String getSpécialité() {
        return spécialité;
    }

    public void setSpécialité(String spécialité) {
        this.spécialité = spécialité;
    }
}

