package op1a.nachmittagsaufgaben;

/*
Aufgabe 3

In einer Schleife eine Variable stunde mit Zufallswerten von 0-23 belegen.
Dann jeweils in Abhängigkeit des Wertes einen Gruß ausgeben:
0-6: Gute Nacht
7-11: Guten Morgen
12-17: Guten Tag
18-23: Guten Abend

a) Zunächst nur mit if-else arbeiten
b) Dann Lösung mit switch-Statement (dazu recherchieren)*/

public class SchleifenGruß
{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int stunde = (int) (Math.random() * 24);
            System.out.println("stunde = " + stunde + ": ");
        greetingIfElse(stunde);
        greetingSwitch(stunde);
        }
    }

    private static void greetingSwitch(int stunde) {
        //switch-Statement
        switch (stunde)  //switch mit ganzzahligen Typen, Strings, Enums
        {
            case 0, 1, 2, 3, 4, 5, 6:
                System.out.println("Gute Nacht");
                break;
            case 7, 8, 9, 10, 11:
                System.out.println("Guten Morgen");
                break;
            case 12, 13, 14, 15, 16:
                System.out.println("Guten Tag");
                break;
            default:
                System.out.println("Sollte nicht vorkommen");
        }
    }

    private static void greetingIfElse(int stunde) {
        if (stunde >= 0 && stunde <=6)
        {
            System.out.println("Gute Nacht");
        }
        else if (stunde >= 7 && stunde <=11)
        {
            System.out.println("Guten Morgen");
        }
        else if (stunde >= 12 && stunde <=17)
        {
            System.out.println("Guten Tag");
        }
        else if (stunde >= 18 && stunde <=23)
        {
            System.out.println("Guten Abend");
        }
    }
}
