package op1a;

public class Aufgabe4
{
    private static void main(String[] args) {
        for (int zeile = 1; zeile <=4 ; zeile++)
        {
            for (int spalte = 1; spalte <= 4 ; spalte++)
            {
                System.out.printf("%2d", zeile * spalte);
            }
            System.out.println();

        }

    }
}
