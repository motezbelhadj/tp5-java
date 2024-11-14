public class Fiscalite {
    public static void main(String[] args) {
        Personne p1 = new Personne(12345, "Ali", "Ben Ali");
        Personne p2 = new Personne(54321, "Ahmed", "Ben Ahmed");
        Personne p3 = new Personne(98765, "Fatma", "Ben Fatma");

        Lotissement lotissement = new Lotissement(10);

        lotissement.ajouter(new ProprietePrivee(1, p1, "Corniche", 350, 4));
        lotissement.ajouter(new Villa(2, p2, "Dar Chaabane", 400, 6, true));
        lotissement.ajouter(new Appartement(3, p2, "Hammamet", 1200, 8, 3));
        lotissement.ajouter(new ProprieteProfessionnelle(4, p3, "Korba", 1000, 50, true));
        lotissement.ajouter(new ProprieteProfessionnelle(5, p1, "Bir Bouragba", 2500, 400, false));

        System.out.println("Liste des propriétés:");
        lotissement.afficherProprietes();

        System.out.println("\nNombre total de pièces: " + lotissement.getNbPieces());

        // Find the private property with the lowest tax
        ProprietePrivee lowestTaxProperty = null;
        double lowestTax = Double.MAX_VALUE;
        for (int i = 0; i < lotissement.nombre; i++) {
            Propriete p = lotissement.getProprieteByIndice(i);
            if (p instanceof ProprietePrivee) {
                double tax = p.calculImpot();
                if (tax < lowestTax) {
                    lowestTax = tax;
                    lowestTaxProperty = (ProprietePrivee) p;
                }
            }
        }

        if (lowestTaxProperty != null) {
            System.out.println("\nPropriété privée avec le moins d'impôts:");
            System.out.println(lowestTaxProperty.responsable + " avec impôts: " + lowestTax);
        }

        // Remove an apartment and re-display properties
        lotissement.supprimer(new Appartement(3, p2, "Hammamet", 1200, 8, 3));
        System.out.println("\nListe des propriétés après suppression:");
        lotissement.afficherProprietes();
    }
}
