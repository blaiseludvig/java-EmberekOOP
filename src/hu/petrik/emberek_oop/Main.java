package hu.petrik.emberek_oop;

import java.util.ArrayList;

public class Main {

    static ArrayList<Ember> testData = new ArrayList<Ember>();

    public static void main(String[] args) {
        testEmber();
    }

    static void generateTestData() {
        testData.add(new Ember("Pista", "2000.01.01", "Budapest"));
        testData.add(new Ember("Micimackó", "1989.06.04", "天安门"));
        testData.add(new Ember("Among Ernő", "420.06.09", "Amimir"));
    }

    static void testEmber() {
        for (Ember ember : testData) {
            System.out.println(ember);
        }
    }

}