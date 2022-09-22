package hu.petrik.emberek_oop;

import java.util.ArrayList;;

public class Emberek {

    private ArrayList<Ember> emberek = new ArrayList<Ember>();

    public Emberek() {
        emberek.add(new Ember("Pista", "2000.01.01", "Budapest"));
        emberek.add(new Ember("Micimackó", "1989.06.04", "天安门"));
        emberek.add(new Ember("Among Ernő", "420.06.09", "Amimir"));
        emberek.add(new Ember("Pista Julis", "1950.03.04", "Debrecen"));
        emberek.add(new Ember("Béla Béla", "1999. 12. 31", "Miskolc"));
    }

    @Override
    public String toString() {
        String str = "";

        for (Ember ember : emberek) {
            str += ember.toString() + '\n';
        }

        return str;
    }
}
