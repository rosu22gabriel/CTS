package ex1.Program;

import ex1.Implementare.API.APIDimensiuni;
import ex1.Implementare.prototype1.Crocs;
import ex1.Implementare.prototype2.AbstractCrocs;
import ex1.Implementare.prototype2.CrocsPrototypeFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        APIDimensiuni apiDimensiuni = APIDimensiuni.getInstance();
        apiDimensiuni.init();

        //utilizare API pepntru a prelua dimensiuni standard in functie de marimea dorita
        List<Integer> dimensiuni = apiDimensiuni.getDimensiuni(40);
        System.out.println(dimensiuni);

        //testare prototype 1
        Crocs crocs1 = new Crocs(40);
        // do not
        // Crocs crocs2 = new Crocs(40);
        Crocs crocs2 = (Crocs) crocs1.getCopie(); // fac copie pentru ca doresc doar marimea 40
        Crocs crocs3 = new Crocs(38); // Contructor pentru ca - alta marime

        System.out.println(crocs1);
        System.out.println(crocs2);

        crocs2.setCuloare("verde");
        crocs2.setAccesorii("accesoriu");
        crocs2.modificareDimensiune(0, 24);

        System.out.println(crocs1);
        System.out.println(crocs2);

        // testare prototype2

        AbstractCrocs crocs11 = CrocsPrototypeFactory.getPrototip("Disney");
        AbstractCrocs crocs12 = CrocsPrototypeFactory.getPrototip("Disney");
        AbstractCrocs crocs13 = CrocsPrototypeFactory.getPrototip("Disney");
        AbstractCrocs crocs14 = CrocsPrototypeFactory.getPrototip("Fotbal");
        AbstractCrocs crocs15 = CrocsPrototypeFactory.getPrototip("Fotbal");


        System.out.println(crocs11);
        System.out.println(crocs12);
        System.out.println(crocs13);
        System.out.println(crocs14);
        System.out.println(crocs15);



        // de demonstract ca este deepcopy
        crocs11.setCuloare("roz");
        System.out.println(crocs11);
        System.out.println(crocs13);

        //de afisat statistici in cadrul PrototypeFactory
        //Disney - ? constructor ? clone
        //Fotbal - ? constructor ? clone
        //LaMare - ? constructor ? clone
    }
}
