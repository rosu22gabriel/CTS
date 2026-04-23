package C07.proxy.implementare;

import java.util.ArrayList;
import java.util.List;

public class Petrecere implements IPetrecere{
    private String data;
    private List<String> listaInvitati;
    private List<Client> listaParticipanti;

    public Petrecere(String data, List<String> listaInvitati) {
        super();
        this.data = data;
        this.listaInvitati = listaInvitati;
        this.listaParticipanti = new ArrayList<>();
    }

    @Override
    public void adaugaParticipant(Client c1) {
        this.listaParticipanti.add(c1);
        System.out.println("Clientul " + c1 + "a fost adaugat la petrecere");
    }

    @Override
    public void afisareProgram() {
        // TODO Auto-generated method stub
    }

}
