package fahrzeugArray;

public class Main {
    public static void main(String[] args) {

//        Fahrzeug a = new Auto();
//        Fahrzeug m = new Motorrad();
//        Fahrzeug f = new Fahrrad();
//        Fahrzeug[] fahrzeuge = {a, m, f};
        Fahrzeug[] fahrzeuge = { new Auto(), new Motorrad(), new Fahrrad(), new Fahrzeug()};

        for (Fahrzeug x : fahrzeuge) {
            x.fahren();
        }

    }


}
