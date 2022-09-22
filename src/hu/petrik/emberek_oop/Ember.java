package hu.petrik.emberek_oop;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;

public class Ember {

    String nev, szulDatum, szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    public int getAge() {
        LocalDate birthdate = LocalDate.of(getBirthYear(), getBirthMonth(), getBirthDay());
        int age = (int) java.time.temporal.ChronoUnit.YEARS.between(birthdate, LocalDate.now());
        return age;
    }

    public int getBirthYear() {
        return Integer.parseInt(this.szulDatum.split("\\.")[0]);
    }

    public int getBirthMonth() {
        return Integer.parseInt(this.szulDatum.split("\\.")[1]);
    }

    public int getBirthDay() {
        return Integer.parseInt(this.szulDatum.split("\\.")[2]);
    }

    @Override
    public String toString() {
        return String.format("név: %s | születési dátum: %s | születési hely: %s", nev, szulDatum, szulHely);
    }
}
