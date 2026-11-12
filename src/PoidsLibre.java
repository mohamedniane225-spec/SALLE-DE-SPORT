public class PoidsLibre extends Equipements {
    private TypePoids type;
    public PoidsLibre(String nom, float poids, TypePoids type) {
        super(nom, poids);
        this.type = type;
    }

    public TypePoids getType() {
        return type;
    }

    public void setType(TypePoids type) {
        this.type = type;
    }
}
