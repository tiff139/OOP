package tierarztpraxis;

public class Katze extends Tier{
    //attribute
    String spitzname;

    //eigene Methoden
    void schnurren()
    {
        System.out.println("PURRR");
    }
    @Override
    void machGeraeusch()
    {
        System.out.println("Das Tier miaut");
    }
}
