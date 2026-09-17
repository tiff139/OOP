package exceptions.uebung;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputExc {
    public static void main(String[] args) {



        Scanner h = new Scanner(System.in);
        System.out.println("Bitte gib eine ganze Zahl ein: ");
        try {
            int eingabe = h.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Das war leider keine ganze Zahl!");
            System.out.println(e.getClass().getSimpleName());
            System.err.println(e.getMessage());
        }
        System.out.println("Hier läuft das Programm weiter...");
    }
}
