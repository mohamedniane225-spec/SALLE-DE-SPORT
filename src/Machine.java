public class Machine extends Equipements {
    private GroupeMusculaire groupe;
    private EtatMachine etat;
    public Machine(String nom, float poids, GroupeMusculaire groupe, EtatMachine etat) {
        super(nom, poids);
        this.groupe = groupe;
        this.etat = etat;
    }

    public GroupeMusculaire getGroupe() {
        return groupe;
    }

    public void setGroupe(GroupeMusculaire groupe) {
        this.groupe = groupe;
    }
}
