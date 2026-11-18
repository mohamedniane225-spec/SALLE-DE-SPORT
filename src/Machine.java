public class Machine extends Equipements implements Reservable {
    private GroupeMusculaire groupe;
    private EtatMachine etat;
    private boolean disponible=true;
    public Machine(String marque, float poids, GroupeMusculaire groupe, EtatMachine etat) {
        super(marque, poids);
        this.groupe = groupe;
        this.etat = etat;
    }

    public GroupeMusculaire getGroupe() {
        return groupe;
    }

    public void setGroupe(GroupeMusculaire groupe) {
        this.groupe = groupe;
    }

    public EtatMachine getEtat() {
        return etat;
    }

    public void setEtat(EtatMachine etat) {
        this.etat = etat;
    }

    public void RendreDisponible(){
        disponible=true;
    }
    @Override
    public boolean reserver(){
        if(!disponible){
            return false;
        }
        if(etat==EtatMachine.MAINTENANCE){
            disponible=false;
        }
        disponible=false;
        return true;
    }


}
