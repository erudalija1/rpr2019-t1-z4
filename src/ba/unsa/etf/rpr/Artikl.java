package ba.unsa.etf.rpr;

public class Artikl {

    private String naziv, kod;
    private int cijena;

    Artikl(String naziv, int cijena, String kod) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }

    String getNaziv() {
        return naziv;
    }
    String getKod() {
        return kod;
    }
    int getCijena() {
        return cijena;
    }
}
