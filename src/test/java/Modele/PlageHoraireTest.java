package Modele;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class PlageHoraireTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void duree() {
        PlageHoraire horaire1 = new  PlageHoraire(new Horaire(8,30), new Horaire(12,0));;
        assertEquals(120, horaire1.duree());

        // Cas 2 : horaire de fin avant l'horaire de début, donc durée négative
        PlageHoraire horaire2 = new  PlageHoraire(new Horaire(8,00), new Horaire(10,0));
        assertEquals(-120, horaire2.duree());

        // Cas 3 : durée devrait être 0
        PlageHoraire horaire3 = new  PlageHoraire(new Horaire(8,00), new Horaire(8,00));
        assertEquals(0, horaire3.duree());

        // Cas 4 : plage horaire entre 14h30 et 17h45 (195 minutes)
        _v1.PlageHoraire horaire4 = new PlageHoraire(new Horaire(14,30), new Horaire(17,45));
        assertEquals(195, horaire4.duree());
    }

    @Test
    void compareTo() {
    }
}