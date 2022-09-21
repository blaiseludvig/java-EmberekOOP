package hu.petrik.emberek_oop;

public class Ember {

    String nev, szulDatum, szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    @Override
    public String toString() {
        return String.format("név: %s | születési dátum: %s | születési hely: %s", nev, szulDatum, szulHely);
    }
}
