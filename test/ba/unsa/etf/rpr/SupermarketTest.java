package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    private Supermarket supermarket;
    private Artikl artikal;

    @BeforeAll
    void setUp () {

        supermarket =  new Supermarket ();
        artikal = new Artikl ("Set magneta", 2, "3258");
    }

    @Test
    void izbaciArtiklSaKodomTest () {

        supermarket.dodajArtikl(artikal);

        Artikl a0 = supermarket.izbaciArtiklSaKodom("150");
        assertNull(a0.getKod());

        Artikl a = supermarket.izbaciArtiklSaKodom("3258");
        assertEquals (3258, artikal.getKod());
    }

    @Test
    void dodajArtiklTest () {


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