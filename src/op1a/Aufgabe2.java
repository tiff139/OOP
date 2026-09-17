package op1a;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.sort;

public class Aufgabe2
{
    public static void main(String[] args) {
        int[] nummern = {123, 838, 98989, 76778 }; // Kurschreibweise bei Initlialisierung
        // neue Nummer 17273
        // wie in Array?
        nummern = new int[]{123, 838, 98989, 76778, 17273}; //ausführliche Syntax

        // Besser geeignet: Liste ist in der Länge variabel
        ArrayList<Integer> liste = new ArrayList<>();
        System.out.println("liste = " + liste);
        liste.add(123);
        liste.add(838);
        liste.add(98989);
        liste.add(76778);
        liste.add(17273);
        System.out.println("liste = " + liste);
        // Utilityklasse Collections
        Collections.sort(liste);
        System.out.println("liste = " + liste);
    }
}
