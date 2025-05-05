package Modele;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class _v1 {

    private LocalTime chHoraireDebut;
    private LocalTime chHoraireFin;

    static class PlageHoraire {
        private LocalTime chHoraireDebut;
        private LocalTime chHoraireFin;

        public PlageHoraire(LocalTime debut, LocalTime fin) {
            this.chHoraireDebut = debut;
            this.chHoraireFin = fin;
        }

        public int duree() {
            return chHoraireFin.toMinutes() - chHoraireDebut.toMinutes();
        }

    }

    @BeforeEach
    void setUp() {
        chHoraireDebut = LocalTime.of(8, 0);
        chHoraireFin = LocalTime.of(10, 0);
    }

    @Test
    void testDuree() {
        // Cas 1 : durée entre 8h00 et 10h00 => 120 minutes
        PlageHoraire horaire1 = new PlageHoraire(chHoraireDebut, chHoraireFin);
        assertEquals(120, horaire1.duree());

        // Cas 2 : horaire de fin avant l'horaire de début, donc durée négative
        PlageHoraire horaire2 = new PlageHoraire(LocalTime.of(10, 0), LocalTime.of(8, 0));
        assertEquals(-120, horaire2.duree());

        // Cas 3 : durée devrait être 0
        PlageHoraire horaire3 = new PlageHoraire(LocalTime.of(8, 0), LocalTime.of(8, 0));
        assertEquals(0, horaire3.duree());

        // Cas 4 : plage horaire entre 14h30 et 17h45 (195 minutes)
        PlageHoraire horaire4 = new PlageHoraire(LocalTime.of(14, 30), LocalTime.of(17, 45));
        assertEquals(195, horaire4.duree());
    }
}
