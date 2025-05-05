package Modele;
public class PlageHoraire implements Comparable <PlageHoraire> {
    private static final int DUREE_MINIMUM = 15;
    private Horaire chHoraireDebut;
    private Horaire chHoraireFin;

    public PlageHoraire(Horaire parHoraireDebut,Horaire parHoraireFin) throws Exception{
        chHoraireDebut = parHoraireDebut;
        chHoraireFin = parHoraireFin;

        if (!this.estValide()){
            throw new Exception("plage horaire invalide !");
        }
    }

    public boolean estValide() {
        if (chHoraireFin.toMinutes() - chHoraireDebut.toMinutes() > DUREE_MINIMUM) { return true; }
        else { return false; }
    }

    public int duree() {
        return chHoraireFin.toMinutes() - chHoraireDebut.toMinutes();
    }

    public int compareTo (PlageHoraire parPlageHoraire) {
        if (parPlageHoraire.chHoraireFin.toMinutes() < this.chHoraireDebut.toMinutes()) { return 1; }
        else if  (this.chHoraireFin.toMinutes() < parPlageHoraire.chHoraireDebut.toMinutes()) { return -1; }
        return 0;
    }

    public String toString () {
        return chHoraireDebut + " - " + chHoraireFin + ", durée : " + duree()/60 +  "h" + duree()%60 + "mn";
    }
}
