import org.junit.Assert;
import org.junit.Test;


public class OperationCompteTest {

    private Compte compte = new Compte(1234, "John", 600.0);
    private IOperationCompte operationCompte = new OperationCompte();

    @Test
    public void shoulReturn500ForRetrait100() throws SoldeInsuffisantException {
        operationCompte.retrait(compte, 100.0);
        Assert.assertEquals(500.0, compte.getMontantActuel(), 0.0);
    }

    @Test
    public void shoulReturn600ForRetrait0() throws SoldeInsuffisantException {
        operationCompte.retrait(compte, 0.0);
        Assert.assertEquals(600.0, compte.getMontantActuel(), 0.0);
    }

    @Test(expected = SoldeInsuffisantException.class)
    public void shoulThrowExceptionForRetrait700() throws SoldeInsuffisantException {
        operationCompte.retrait(compte, 700.0);
    }

    @Test
    public void shoulReturn700ForDepot100() {
        operationCompte.depot(compte, 100.0);
        Assert.assertEquals(700.0, compte.getMontantActuel(), 0.0);
    }

    @Test
    public void shouldReturn2For2Operations() throws SoldeInsuffisantException {
        operationCompte.retrait(compte, 100.0);
        operationCompte.depot(compte, 100.0);
        Assert.assertEquals(2, operationCompte.historiqueCompte().size());
    }

}
