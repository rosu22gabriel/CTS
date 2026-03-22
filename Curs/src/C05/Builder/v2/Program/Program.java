package C05.Builder.v2.Program;

import C05.Builder.v2.Implementare.PetrecereBuilder;
import C05.Builder.v2.Implementare.Petrecere;

public class Program {
    public static void main(String[] args) {
        PetrecereBuilder builder = new PetrecereBuilder();
        Petrecere petrecere = builder.setAreArtificii(true).setNrPersoane(200).build();
        // de aici nu se mai poate modifica petrecere
        System.out.println(petrecere);
    }
}
