package C07.proxy.implementare;

public class PetrecereProxy implements IPetrecere{
    private IPetrecere petrecere;

    public PetrecereProxy(IPetrecere petrecere) {
        super();
        this.petrecere = petrecere;
    }

    @Override
    public void adaugaParticipant(Client c1) {
        if (c1.getVarsta() >= 18)
            petrecere.adaugaParticipant(c1);
        else
            System.out.println("Clientul " + c1.getNume() + " nu are varsta minima de 18 ani");
    }

    @Override
    public void afisareProgram() {
        this.petrecere.afisareProgram();
    }
}
