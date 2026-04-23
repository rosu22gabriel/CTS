package C08.Adapter.clase.implementare;

// arat precum firma B dar mostenesc comportamentul firmei A
public class Adapter extends EvaluareClientFirmaA implements IEvaluareClientFirmaB {

    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("Pare ca evaluarea este facuta de firma B, dar se realiza de....");
        this.analizaClientFirmaA(costTotalEvenimente(client));
    }

    // existenta unei metode de transformare a inputului din Firma B in Firma A
    private int costTotalEvenimente(Client client) {
        System.out.println("Transformare input din B in A");
        int total=0;
        for(int i = 0; i < client.getNrEvenimente(); i++) {
            total += client.getCostEvenimente()[i];
        }
        return total;
    }
}
