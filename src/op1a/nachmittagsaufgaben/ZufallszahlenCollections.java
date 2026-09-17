
/*Aufgabe 1

Eine Liste mit 10 Zufallszahlen im Bereich 1.0 und 100.0 erzeugen.
Folgende Informationen zur Liste berechnen: Minimum, Maximum, Durchschnittswert, zunächst ohne Hilfe von
Bibliotheksklassen.
Dann mit Hilfe der Klasse Collections.*/
package op1a.nachmittagsaufgaben;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ZufallszahlenCollections {

    public static final ArrayList<Double> zahlen = new ArrayList<>();

    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i<10 ; i++) {
             double d = rand.nextDouble(1.0, 100.0);
             zahlen.add(d);
         }
         double min = 100.0;
         double max = 1.0;
         double sum = 0.0;

        for (double d : zahlen)
        {
            sum += d;
            if ( d <min)
            {
                min = d;
            }
            if (d>max)
            {
                max = d;
            }
        }
        double durchschnitt = sum / zahlen.size();
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("durchschnitt = " + durchschnitt);

        System.out.println(Collections.min(zahlen));
        System.out.println(Collections.max(zahlen));



    }
}
