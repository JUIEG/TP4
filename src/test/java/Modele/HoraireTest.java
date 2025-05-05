package Modele;

import static org.junit.jupiter.api.Assertions.*;

class HoraireTest {

    public static void main(String[] args) {
        Horaire horaire1 = new Horaire(8, 30);
        Horaire horaire2 = new Horaire(8, 30);
        System.out.println("Test 1: " + (horaire1.compareTo(horaire2) == 0));

        Horaire horaire3 = new Horaire(8, 0);
        Horaire horaire4 = new Horaire(9, 0);
        System.out.println("Test 2: " + (horaire3.compareTo(horaire4)));

        Horaire horaire5 = new Horaire(12, 0);
        Horaire horaire6 = new Horaire(11, 0);
        System.out.println("Test 3: " + (horaire5.compareTo(horaire6) > 0));

        Horaire horaire7 = new Horaire(15, 30);
        Horaire horaire8 = new Horaire(14, 45);
        System.out.println("Test 4: " + (horaire7.compareTo(horaire8) > 0));
    }
}