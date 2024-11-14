public abstract class Propriete {
    protected int id;
    protected Personne responsable;
    protected String adresse;
    protected double surface;

    public Propriete(int id, Personne responsable, String adresse, double surface) {
        this.id = id;
        this.responsable = responsable;
        this.adresse = adresse;
        this.surface = surface;
    }

    public abstract double calculImpot();

    @Override
    public String toString() {
        return "Propriete[id=" + id + ", responsable=" + responsable + ", adresse=" + adresse + ", surface=" + surface + "]";
    }
}

