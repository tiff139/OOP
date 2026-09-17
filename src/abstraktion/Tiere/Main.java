package abstraktion.Tiere;

public class Main {

    public static void main(String[] args) {
        Tier[] zoo = {new Hund(), new Katze()};

        for (Tier tier : zoo) {
            tier.gibLaut();
        }
    }
}

