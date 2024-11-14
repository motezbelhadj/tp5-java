public class Villa extends ProprietePrivee {
    private boolean avecPiscine;

    public Villa(int id, Personne responsable, String adresse, double surface, int nbPieces, boolean avecPiscine) {
        super(id, responsable, adresse, surface, nbPieces);
        this.avecPiscine = avecPiscine;
    }

    @Override
    public double calculImpot() {
        double impot = super.calculImpot();
        return avecPiscine ? impot + 200 : impot;
    }

    @Override
    public String toString() {
        return super.toString() + ", avecPiscine=" + avecPiscine;
    }
}