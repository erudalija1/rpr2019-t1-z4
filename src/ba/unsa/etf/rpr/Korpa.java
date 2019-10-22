package ba.unsa.etf.rpr;

public class Korpa {

    Artikl[] a = new Artikl [50];

    Artikl[] getArtikli () {
        return a;
    }

    int dajUkupnuCijenuArtikala () {

        private int suma = 0;
        for (int i = 0; i < 50; i++) {
            suma += a[i].getCijena();
        }
        return suma;
    }

    Artikl izbaciArtiklSaKodom (String kod) {

        for (int i = 0; i < 50; i++) {
            if (a[i].getKod().equals(kod)) return a[i];
        }
        return null;
    }

    boolean dodajArtikl (Artikl a) {

        for (int i = 0; i < 50; i++) {
            if (a[i] == null) {
                a[i] = a;
                return true;
            }
        }
         return false;
    }


}
