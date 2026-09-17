package tierarztpraxis;

public class Main {
    public static void main(String[] args) {

        Tier t = new Tier();
        t.machGeraeusch();

        Hund h = new Hund();
        h.machGeraeusch();

        Katze k = new Katze();
        k.machGeraeusch();

        Tier l = new Loewe();

        Tier[] tiere = {t,h,k};
        for(Tier x : tiere)
        {
            x.machGeraeusch(); //polymorpher Aufruf
        }
        //Casting
        ((Katze)k).schnurren();


        Tier[] tier2 = {new Hund(), new Loewe()};



    }
}
