package C04.Prototype.Implementare;

import java.util.ArrayList;

public class ContractParty extends AbstractContract{
    public ContractParty() {
        System.out.println("Incarcare contract party din BD");
        // proces consumator de timp(preluare din BD)
        listaClauze.add("clauza 1 party");
        listaClauze.add("clauza 2 party");
        this.tip = "party";
    }
    @Override
    void printare() {
        System.out.println("Contract de tip " + this.tip);
    }

    @Override
    public AbstractContract clone() {
        AbstractContract clone = super.clone();
        clone.listaClauze = new ArrayList<>();
        for (int i =0 ; i < this.listaClauze.size(); i++) {
            clone.listaClauze
                    .add(new String(this.listaClauze.get(i)));
        }

        return clone;
    }
}
