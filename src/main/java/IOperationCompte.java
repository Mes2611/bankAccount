import java.util.List;

public interface IOperationCompte {

    void depot(Compte compte, double montantDepot);

    void retrait(Compte compte, double montantRetrait) throws SoldeInsuffisantException;

    List<HistoriqueCompte> historiqueCompte();
}
