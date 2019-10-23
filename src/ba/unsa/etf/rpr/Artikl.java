package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private String kod;
    private int cijena;
    public Artikl (String n, int c, String k) {
        naziv = n;
        kod = k;
        cijena = c;
    }
    public Artikl () {
        naziv = "";
        kod = "";
        cijena = 0;
    }
    public String getNaziv () {

        return naziv;
    }
    public String getKod () {

        return kod;
    }
    public int getCijena () {

        return cijena;
    }
    public void setNaziv (String n) {
        naziv = n;
    }
    public void setCijena (int c) {
        cijena = c;
    }
    public void setKod (String k) {
        kod = k;
    }


}
