package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    static private Supermarket supermarket;
    static private Artikl artikal;

    @BeforeAll
    static void setUp () {

        supermarket =  new Supermarket ();
        artikal = new Artikl ("Set magneta", 2, "3258");
    }

    @Test
    void izbaciArtiklSaKodomTest () {

        supermarket.dodajArtikl(artikal);

        Artikl a0 = supermarket.izbaciArtiklSaKodom("150");
        assertNull(a0);

        Artikl a = supermarket.izbaciArtiklSaKodom("3258");
        assertEquals ("3258", artikal.getKod());
    }

























//    @org.junit.jupiter.api.Test
//    void getArtikli() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void izbaciArtiklSaKodom() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void dodajArtikl() {
//    }
}