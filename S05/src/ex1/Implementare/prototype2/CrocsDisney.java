package ex1.Implementare.prototype2;

import java.util.ArrayList;

public class CrocsDisney extends AbstractCrocs {
    CrocsDisney() {
        super(37, "Alb");
        this.accesorii = new ArrayList<String>();
        accesorii.add("Mickey Mouse");
        accesorii.add("Minnie");
        accesorii.add("Donkey Mouse");
    }
}
