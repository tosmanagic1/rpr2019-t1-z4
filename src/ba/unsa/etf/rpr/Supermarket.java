package ba.unsa.etf.rpr;

public class Supermarket {

    private final int MAX_BR_ARTIKALA = 1000;
    private Artikl[] supermarket;
    private int brojArtikala;

    public Supermarket(){
        supermarket = new Artikl[MAX_BR_ARTIKALA];
        brojArtikala = 0;
    }

    public Artikl[] getArtikli() {
        return supermarket;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbaceniAritkl = new Artikl();
        for(int i = 0; i < brojArtikala;i++){
            if(supermarket[i].getKod().equals(kod)){
                izbaceniAritkl = supermarket[i];
                for(int j = i ; j < brojArtikala; j++){
                    supermarket[j] = supermarket[j+1];
                }
                brojArtikala = brojArtikala - 1;
            }
        }

        return  izbaceniAritkl;
    }


    public void dodajArtikl(Artikl a) {
        if(brojArtikala <= MAX_BR_ARTIKALA) return;
        supermarket[brojArtikala] = a;
        brojArtikala = brojArtikala - 1;
    }

}
