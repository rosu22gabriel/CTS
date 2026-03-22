package C04.Prototype.Implementare;

import java.util.ArrayList;

public class ContractCorporate  extends AbstractContract{
    ContractCorporate() {
        System.out.println("Incarcare contract corporate din BD");
        //  preluare date din baza de date (proces consumator)
        listaClauze = new ArrayList<>();
        listaClauze.add("clauza1 corporate");
        listaClauze.add("clauza2 corporate");
        this.tip = "corporate";
    }

    @Override
    void printare() {
        System.out.println("Contract de tip " + this.tip);
    }
}
