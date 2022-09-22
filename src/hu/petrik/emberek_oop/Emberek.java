package hu.petrik.emberek_oop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;;

public class Emberek {

    private ArrayList<Ember> emberek = new ArrayList<Ember>();

    public Emberek() {
        emberek.add(new Ember("Pista", "2000.01.01", "Budapest"));
        emberek.add(new Ember("Micimackó", "1989.06.04", "天安门"));
        emberek.add(new Ember("Among Ernő", "420.06.09", "Amimir"));
        emberek.add(new Ember("Pista Julis", "1950.03.04", "Debrecen"));
        emberek.add(new Ember("Béla Béla", "1999. 12. 31", "Miskolc"));
    }

    public Emberek(Ember[] emberTomb) {
        this.emberek.addAll(Arrays.asList(emberTomb));
    }

    public Emberek(String file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            for (; ; ) {
                String data = br.readLine();
                if (data == null || data.equals("")) {
                    break;
                } else {
                    this.emberek.add(new Ember(data.split(";")));
                }
            }
        }
    }

    @Override
    public String toString() {
        String str = "";

        for (Ember ember : emberek) {
            str += String.format("név: %-25s | születési dátum: %-10s (%3d év) | születési hely: %s\n",
                    ember.nev,
                    ember.szulDatum,
                    ember.getAge(),
                    ember.szulHely);
        }

        return str;
    }
}
