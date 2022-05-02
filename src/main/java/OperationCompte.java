import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class OperationCompte implements IOperationCompte {

    List<HistoriqueCompte> listeHisto = new ArrayList<>();


    @Override
    public void depot(Compte compte, double montantDepot) {
        compte.setMontantActuel(compte.getMontantActuel() + montantDepot);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        listeHisto.add(new HistoriqueCompte(formatter.format(System.currentTimeMillis()), "dépot", montantDepot, compte.getMontantActuel()));
    }

    @Override
    public void retrait(Compte compte, double montantRetrait) throws SoldeInsuffisantException {
        if (compte.getMontantActuel() >= montantRetrait) {
            compte.setMontantActuel(compte.getMontantActuel() - montantRetrait);
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            listeHisto.add(new HistoriqueCompte(formatter.format(System.currentTimeMillis()), "retrait", montantRetrait, compte.getMontantActuel()));
        } else {
            throw new SoldeInsuffisantException();
        }
    }

    @Override
    public List<HistoriqueCompte> historiqueCompte() {
        return listeHisto;
    }
}
