package Modele;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Horaire {
    private int chHeure;
    private int chQuartHeure;

    public Horaire (int parHeure, int parQuartHeure) {
        chHeure = parHeure;
        chQuartHeure = parQuartHeure;
    }

    public int toMinutes () {
        return chHeure * 60 + chQuartHeure;
    }

    public int getHeure () {
        return chHeure;
    }

    public int getQuartHeure () {
        return chQuartHeure;
    }

    public void setHeure (int parHeure) {
        chHeure = parHeure;
    }

    public void setQuartHeure (int parQuartHeure) {
        chQuartHeure = parQuartHeure;
    }

    public String toString () {
        return chHeure + "h" + chQuartHeure;
    }

    public int compareTo(Horaire parHoraire) {
        return this.toMinutes() - parHoraire.toMinutes();
    }

    @Test
    void testCompareTo() {
        // Test 1: Horaire identique
        Horaire horaire1 = new Horaire(8, 0);
        Horaire horaire2 = new Horaire(8, 0);
        assertEquals(0, horaire1.compareTo(horaire2), "Les horaires sont égaux");

        // Test 2: Horaire de `horaire1` plus tôt que `horaire2`
        Horaire horaire3 = new Horaire(7, 30);
        Horaire horaire4 = new Horaire(8, 0);
        assertTrue(horaire3.compareTo(horaire4) < 0, "Le premier horaire est plus tôt");

        // Test 3: Horaire de `horaire1` plus tard que `horaire2`
        Horaire horaire5 = new Horaire(9, 0);
        Horaire horaire6 = new Horaire(8, 0);
        assertTrue(horaire5.compareTo(horaire6) > 0, "Le premier horaire est plus tard");

        // Test 4: Horaire avec des minutes égales mais heures différentes
        Horaire horaire7 = new Horaire(10, 15);
        Horaire horaire8 = new Horaire(9, 15);
        assertTrue(horaire7.compareTo(horaire8) > 0, "Le premier horaire est plus tard");

         // Test 5: Comparaison avec des horaires différents dans la même journée
        Horaire horaire9 = new Horaire(5, 45);  // 05:45
        Horaire horaire10 = new Horaire(6, 30); // 06:30
        assertTrue(horaire9.compareTo(horaire10) < 0, "Le premier horaire est plus tôt");
        }


}