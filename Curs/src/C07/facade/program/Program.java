package C07.facade.program;

import C07.facade.implementare.Facade;

public class Program {
    public static void main(String[] args) {
        System.out.println(
                Facade.verificaDisponibilitateBucatari(10, "12/12/2022")
        );
    }
}
