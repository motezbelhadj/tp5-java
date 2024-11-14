public class ProprietePrivee extends Propriete {
    protected int nbPieces;

    public ProprietePrivee(int id, Personne responsable, String adresse, double surface, int nbPieces) {
        super(id, responsable, adresse, surface);
        this.nbPieces = nbPieces;
    }

    @Override
    public double calculImpot() {
        return (50 * (surface / 100)) + (10 * nbPieces);
    }

    @Override
    public String toString() {
        return super.toString() + ", nbPieces=" + nbPieces;
    }
}
