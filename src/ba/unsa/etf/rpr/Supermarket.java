package ba.unsa.etf.rpr;

public class Supermarket {

    Artikl[] a = new Artikl[1000];

    public Supermarket() {
    }

    Artikl[] getArtikli() {
        return a;
    }

    Artikl izbaciArtiklSaKodom (String kod) {
        for (int i = 0;  i < 1000; i++) {
            if (a[i] != null && a[i].getKod() != null && a[i].getKod().equals(kod)) return a[i];
        }
        return null;
    }

    void dodajArtikl (Artikl artikl) {
        for (int i = 0; i < 1000; i++) {
            if (a[i] == null) {
                a[i] = artikl;
                break;
            }
        }
    }


}
