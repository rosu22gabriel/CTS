package C05.Factory.SimpleFactory.Implementare;

public class PizzaVegetariana implements IPizza{
    @Override
    public void afisareDescriere() {
        System.out.println("Pizza vegetariana contine blat, sos rosii, vinete");
    }
}
