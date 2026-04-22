package Prototype;

import java.util.ArrayList;

public class ContractParty extends AbstractContract{
    @Override
    void printare() {
        System.out.println("Incarcare contract party din BD");
        // proces consumator de timp (preluare din BD)
        listaClauze = new ArrayList<>();
        listaClauze.add("clauza 1 party");
        listaClauze.add("clauza 2 party");
        this.tip = "party";
    }

    @Override
    public AbstractContract clone() {
        AbstractContract clone = super.clone();
        clone.listaClauze = new ArrayList<>();
        for(int i = 0; i < this.listaClauze.size(); i++) {
            clone.listaClauze
                    .add(new String(this.listaClauze.get(i)));
        }

        return clone;
    }
}
