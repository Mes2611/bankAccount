public class SoldeInsuffisantException extends Exception {

    @Override
    public String toString() {
        return "votre solde est insuffisant pour ce retrait";
    }
}
