package ba.unsa.etf.rpr;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;


class KorpaTest {
    static private Supermarket supermarket;
    static private Korpa korpa;

    @BeforeAll
    static void Popunjavanje (){
        korpa = new Korpa();
        supermarket =  new Supermarket();
    }
    @Test
    void dodajArtiklTest (){
        for (int i=0; i < 50; i++){
            korpa.dodajArtikl(new Artikl("kola", 3, String.valueOf(i)));
        }
        assertFalse(korpa.dodajArtikl(new Artikl("kola", 3, "51")));
    }
}