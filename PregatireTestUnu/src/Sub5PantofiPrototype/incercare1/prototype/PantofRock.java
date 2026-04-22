package Sub5PantofiPrototype.incercare1.prototype;

import java.util.List;

public class PantofRock extends CererePantof {
    public PantofRock(int marime, List<String> mesaje) throws Exception {
        super("Rock", marime, mesaje);
        System.out.println("-> Incarcare lenta measje specifica stilului ROCK din DB...");
    }
    @Override
    public double calculeazaPret() {
        return 0;
    }
}

public class PantofPop extends CererePantof {
    public PantofPop(int marime, List<String> mesaje) throws Exception {
        super("Pop", marime, mesaje);
        System.out.println("-> Incarcare lenta mesaje specifice stilului POP din DB...");
    }

    @Override
    public double calculeazaPret() { return 200.0; }
}
