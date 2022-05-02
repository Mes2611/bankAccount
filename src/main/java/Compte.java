public class Compte {

    private int numeroCompte;
    private String nomClient;
    private double montantActuel;


    public Compte(int numeroCompte, String nomClient, double montantActuel) {
        this.numeroCompte = numeroCompte;
        this.nomClient = nomClient;
        this.montantActuel = montantActuel;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public double getMontantActuel() {
        return montantActuel;
    }

    public void setMontantActuel(double montantActuel) {
        this.montantActuel = montantActuel;
    }
}
