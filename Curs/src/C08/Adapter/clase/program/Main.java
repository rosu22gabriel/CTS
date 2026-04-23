package C08.Adapter.clase.program;


import C08.Adapter.clase.implementare.*;

public class Main {
    public static void main(String[] args) {
        // Restaurant A
        System.out.println("Restaurant A");
        IEvaluareClientFirmaA evaluareA = new EvaluareClientFirmaA();
        evaluareA.analizaClientFirmaA(3000);

        // Restaurant B
        System.out.println("Restaurant B");
        IEvaluareClientFirmaB evaluareB = new EvaluareClientFirmaB();
        int[] costuri = new int[]{100, 200, 300, 400, 1000};
        Client client = new Client("Gigel", 5, costuri);
        evaluareB.analizaClientFirmaB(client);

        // UTILIZARE ADAPTER dupa ce restaurant B este cumparat de restaurant A
        System.out.println("Restaurant B folosind ADAPTER");
        IEvaluareClientFirmaB adapter = new Adapter();
        int[] costuri2 = new int[]{100, 200, 300, 400, 1000};
        Client client2 = new Client("Gigel", 5, costuri);
        adapter.analizaClientFirmaB(client2);
    }
}
