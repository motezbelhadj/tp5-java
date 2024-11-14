public class ProprieteProfessionnelle extends Propriete {
    private int nbEmployes;
    private boolean estEtatique;

    public ProprieteProfessionnelle(int id, Personne responsable, String adresse, double surface, int nbEmployes, boolean estEtatique) {
        super(id, responsable, adresse, surface);
        this.nbEmployes = nbEmployes;
        this.estEtatique = estEtatique;
    }

    @Override
    public double calculImpot() {
        if (estEtatique) return 0;
        return (100 * (surface / 100)) + (30 * nbEmployes);
    }

    @Override
    public String toString() {
        return super.toString() + ", nbEmployes=" + nbEmployes + ", estEtatique=" + estEtatique;
    }
}
