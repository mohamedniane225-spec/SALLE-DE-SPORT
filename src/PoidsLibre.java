public class PoidsLibre extends Equipements {
    private TypePoids type;
    public PoidsLibre(String marque, float poids, TypePoids type) {
        super(marque, poids);
        this.type = type;
    }

    public TypePoids getType() {
        return type;
    }

    public void setType(TypePoids type) {
        this.type = type;
    }
}
