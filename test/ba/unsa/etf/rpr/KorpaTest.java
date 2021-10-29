package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void getArtikli() {
    }

    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("bajk", 4000, "2");
        k.dodajArtikl(a);
        assertTrue(k.getBrojArtikala()==1);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("bajs", 500, "1");
        Artikl b = new Artikl("bajs", 569, "2");
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        k.izbaciArtiklSaKodom("1");
        assertNotEquals(2, k.getBrojArtikala());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("", 576, "1");
        Artikl b = new Artikl("", 1345, "2");
        Artikl c = new Artikl("", 3456, "3");
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        k.dodajArtikl(c);
        assertTrue(k.dajUkupnuCijenuArtikala()>5200);
    }

    @Test
    void getKorpa() {
    }
}