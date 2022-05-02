public class HistoriqueCompte {

    String dateOperation;
    String typeTransaction;
    double montantTransaction;
    double montantCompteApresTransaction;

    public HistoriqueCompte(String dateOperation, String typeTransaction, double montantTransaction, double montantCompteApresTransaction) {
        this.dateOperation = dateOperation;
        this.typeTransaction = typeTransaction;
        this.montantTransaction = montantTransaction;
        this.montantCompteApresTransaction = montantCompteApresTransaction;
    }

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public String getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public double getMontantTransaction() {
        return montantTransaction;
    }

    public void setMontantTransaction(double montantTransaction) {
        this.montantTransaction = montantTransaction;
    }

    public double getMontantCompteApresTransaction() {
        return montantCompteApresTransaction;
    }

    public void setMontantCompteApresTransaction(double montantCompteApresTransaction) {
        this.montantCompteApresTransaction = montantCompteApresTransaction;
    }

    @Override
    public String toString() {
        return "HistoriqueCompte{" +
                "date de l' Operation=' " + dateOperation + '\'' +
                ", type de Transaction=' " + typeTransaction + '\'' +
                ", montant de la Transaction= " + montantTransaction +
                ", montant du Compte apres Transaction= " + montantCompteApresTransaction +
                '}';
    }
}
