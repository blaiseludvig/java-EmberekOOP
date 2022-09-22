package hu.petrik.emberek_oop;

import java.util.ArrayList;

public class Main {

    static ArrayList<Ember> testData = new ArrayList<Ember>();

    public static void main(String[] args) {
        generateTestData();
        testEmber();
        testGetBirthYear();
        testGetBirthMonth();
        testGetBirthDay();
        testGetAge();
        testEmberek();
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

    static void testGetBirthYear() {
        for (Ember ember : testData) {
            System.out.printf("%s születési éve: %d%n", ember.nev, ember.getBirthYear());
        }
    }

    static void testGetBirthMonth() {
        for (Ember ember : testData) {
            System.out.printf("%s születési hónapja: %d%n", ember.nev, ember.getBirthMonth());
        }
    }

    static void testGetBirthDay() {
        for (Ember ember : testData) {
            System.out.printf("%s születési napja: %d%n", ember.nev, ember.getBirthDay());
        }
    }

    static void testGetAge() {
        for (Ember ember : testData) {
            System.out.printf("%s %d éves%n", ember.nev, ember.getAge());
        }
    }

    static void testEmberek() {
        Emberek emberek = new Emberek();
        System.out.println(emberek.toString());
    }


}