
package exceptions;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte eine Zahl a eingeben:");
        int a = sc.nextInt();

        System.out.println("Bitte eine Zahl b eingeben");
        int b = sc.nextInt();

        //try-catch-Block: Ein sicherer Bereich zur Ausführung des Codeabschnitts, wo mögliche Fehler entstehen könnten
        try {
            double ergebnis = (double) a / b;

            System.out.println("a/b = " + ergebnis);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally //optional
        {
            sc.close();
            System.out.println("So und so ist hier passiert");
        }

        System.out.println("Hier geht das Programm weiter...");
    }
}
