package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {


    @Test
    void getArtikli() {
        Artikl a = new Artikl ("bajk", 200, "1");
        assertAll("naziv", () -> assertEquals ("bajk", a.getNaziv()), () -> assertEquals(200, a.getCijena()));
    }

    @Test
    void izbaciArtiklSaKodom() {


    }

}