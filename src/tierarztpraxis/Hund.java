package tierarztpraxis;

public class Hund extends Tier {

    //eigene Attribute
    String rasse;

    //eigene Methoden
    void spielen()
    {
        System.out.println("Der Hund spielt");
    }
    @Override
    void machGeraeusch()
    {
        System.out.println("Das Tier bellt");
    }
}
