package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void getArtikli() {
        Artikl a = new Artikl("bajk", 200, "1");
        assertAll("naziv", ()-> assertEquals("bajk", a.getNaziv()), () -> assertEquals(200, a.getCijena()));
    }

    @Test
    void getBrojArtikala() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("biciklo", 1000, "1");
        s.dodajArtikl(a);
        Artikl a1 = new Artikl("biciklo", 2000, "2");
        s.dodajArtikl(a1);
        assertTrue(s.getBrojArtikala()==2);
    }

   /* @Test
    void izbaciArtiklSaKodom() {
        Supermarket s = new Supermarket();
        s.dodajArtikl("biciklo", 2000, "1");
        s.dodajArtikl("biciklo", 4000, "2");
        s.izbaciArtiklSaKodom("1");
        assertEquals(1, s.getBrojArtikala());
    }*/

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket s = new Supermarket();
        s.dodajArtikl(new Artikl("biciklo", 2000, "1"));
        s.dodajArtikl(new Artikl("biciklo", 4000, "2"));
        s.izbaciArtiklSaKodom("1");
        assertEquals(1, s.getBrojArtikala());
    }

    @Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        s.dodajArtikl(new Artikl("BICIKLO", 2000, "1"));
        s.dodajArtikl(new Artikl("bajk", 5000, "3"));
        assertEquals(2, s.getBrojArtikala());
    }

}