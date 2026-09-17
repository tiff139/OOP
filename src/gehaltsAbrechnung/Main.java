package gehaltsAbrechnung;

public class Main {
    public static void main(String[] args) {

        Mitarbeiter[] truppe = new Mitarbeiter[3];

        Mitarbeiter manager = new Manager();
        Mitarbeiter programmierer = new Programmierer();
        Mitarbeiter praktikant = new Praktikant();

        truppe[0] = manager;
        truppe[1] = programmierer;
        truppe[2] = praktikant;

        //Alternativ
        //Mitarbeiter[] gruppe = {new Manager(), new Praktikant(), new Programmierer()};
        double summe = 0;
        for (Mitarbeiter x: truppe)
        {
            System.out.println(x.getClass().getSimpleName());
            System.out.println("Das Gehalt = " + x.berechneGehalt());
            summe += x.berechneGehalt();  //polymorpher Aufruf

        }
        System.out.printf("Gesamtgehalt = %.2f" , summe);
    }
}
