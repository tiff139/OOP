package hrms;

public class Mitarbeiter {

    String name;
    int alter;
    String adresse;
    double stundenlohn;
    int wochenstunden;

    //Methode
    public double berechneGehalt() {
        return stundenlohn * wochenstunden * 4;
    }
}
