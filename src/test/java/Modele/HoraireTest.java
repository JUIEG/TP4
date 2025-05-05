package Modele;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HoraireTest {
    @Test
    void compareTo() {

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


    @Test
    void toMinutes() {

        // Test 1: Horaire 8:30
        Horaire horaire1 = new Horaire(8, 30);
        System.out.println("Test 1: " + (horaire1.toMinutes() == 510));

        // Test 2: Horaire 0:00 (minuit)
        Horaire horaire2 = new Horaire(0, 0);
        System.out.println("Test 2: " + (horaire2.toMinutes() == 0));

        // Test 3: Horaire 12:00
        Horaire horaire3 = new Horaire(12, 0);
        System.out.println("Test 3: " + (horaire3.toMinutes() == 720));

        // Test 4: Horaire 23:59
        Horaire horaire4 = new Horaire(23, 59);
        System.out.println("Test 4: " + (horaire4.toMinutes() == 1439));

        // Test 5: Horaire 6:45
        Horaire horaire5 = new Horaire(6, 45);
        System.out.println("Test 5: " + (horaire5.toMinutes() == 405));
    }
}

