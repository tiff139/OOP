package op1a.nachmittagsaufgaben;
/*
Aufgabe 4

Neuere Java-Versionen unterstützen auch switch-Expressions. Dazu ein Beispiel von einem KI-Tool geben lassen
und ein anderes selbst implementieren.*/

public class switchExpression {
    public static void main(String[] args) {
        //switch-Expression
        int nr = (int) (Math.random() * 7 + 1); // 1 bis 7
        String wochentag = switch (nr)
        {
            case 1 -> "Montag";
            case 2 -> "Dienstag";
            case 3 -> "Mittwoch";
            case 4 -> "Donnerstag";
            case 5 -> "Freitag";
            case 6 -> "Samstag";
            case 7 -> "Sonntag";
            default -> "Unbekannt";
        };
        System.out.printf("Tag %d: %s", nr, wochentag);
    }
}
