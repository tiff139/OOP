package fahrzeugfabrik;

public class Main {
    public static void main(String[] args) {

        Auto a1 = new Auto();
        System.out.println("Die aktuelle Geschwindigkeit = " + a1.geschwindigkeit);
        a1.beschleunigen(10);
        a1.anzahlTueren = 5;

        System.out.println("Die aktuelle Geschwindigkeit = " + a1.geschwindigkeit);
        System.out.println("Anzahl der Türen = " + a1.anzahlTueren);

        a1.hupen();
    }
}
