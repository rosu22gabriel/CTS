package Builder.v2.Program;

import Builder.v2.Implementare.Petrecere;
import Builder.v2.Implementare.PetrecereBuilder;

public class Program {
    public static void main(String[] args) {
        PetrecereBuilder builder = new PetrecereBuilder();
        Petrecere petrecere = builder.setAreArtificii(true).setNrPersoane(200).build();
        // de aici nu se mai poate modifica petrecere
        System.out.println(petrecere);
    }
}
