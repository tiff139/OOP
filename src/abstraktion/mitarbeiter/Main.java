package abstraktion.mitarbeiter;

import gehaltsAbrechnung.Mitarbeiter;

public class Main {
    public static void main(String[] args) {

        Mitarbeiterliste[] team = {new Festangestellter(), new Freelancer()};

        double summe = 0;

        for(Mitarbeiterliste m : team)
        {
            System.out.println(m.getClass().getSimpleName());
            System.out.println("Gehalt = " + m.berechneGehalt());
            summe += m.berechneGehalt();
        }
        System.out.println("Gesamte Gehälter = " + summe);

    }
}
