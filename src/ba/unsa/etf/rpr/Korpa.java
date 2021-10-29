package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl [] korpa;
    private  int brojArtikala;
    private final int MAX_BR_ARTIKALA = 50;
    Korpa () {
        korpa = new Artikl [MAX_BR_ARTIKALA];
        brojArtikala = 0;
    }
    public Artikl[] getArtikli () {
        return korpa;
    }
    public boolean dodajArtikl (Artikl a) {
        if (brojArtikala >= MAX_BR_ARTIKALA) return false;
        korpa[brojArtikala] = a;
        brojArtikala = brojArtikala + 1;
        return true;
    }
    public Artikl izbaciArtiklSaKodom (String kod){
        Artikl izbaceniArtikl = new Artikl();
        for(int i = 0; i < brojArtikala; i++){
            if(korpa[i].getKod().equals(kod)){
                izbaceniArtikl = korpa[i];
                for(int j = i; j < brojArtikala - 1; j++){
                    korpa[j] = korpa[j+1];
                }
                brojArtikala = brojArtikala - 1;
            }
        }
        return izbaceniArtikl;

    }

    public int dajUkupnuCijenuArtikala(){
        int ukupnaCijena = 0;
        for(int i = 0; i < brojArtikala; i++){
            ukupnaCijena = ukupnaCijena + korpa[i].getCijena();
        }
        return ukupnaCijena;
    }

    public Artikl[] getKorpa() {
        return korpa;
    }

    public int getBrojArtikala() {
        return brojArtikala;
    }
}
