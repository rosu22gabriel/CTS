package C05.Builder.v1.Program;

import C05.Builder.v1.Implementare.Petrecere;
import C05.Builder.v1.Implementare.PetrecereBuilder;

public class Program {
    public static void main(String[] args) {
        // Petrecere petrecere = new Petrecere();
        PetrecereBuilder builder = new PetrecereBuilder();
        Petrecere petrecereTest = builder.build();
        builder = builder.setAreBaloane(true);
        System.out.println(petrecereTest);
        Petrecere petrecere = builder.setAreArtificii(true)
                .setNrPersoane(20)
                .setAreTort(true).build();
        System.out.println(petrecere);
    }
}
