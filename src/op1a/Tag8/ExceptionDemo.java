package op1a.Tag8;

public class ExceptionDemo
{
    public static void main(String[] args) {
        //tryCatchDemo();
        finallyDemo();
    }

    private static void finallyDemo() {
        try {
            int n = 0;
            if (Math.random() < 0.5) n = 2;

            int erg = 5 / n;
            System.out.println("erg = " + erg);
        } catch (Exception e)
        {
            System.out.println("Exception");
            return; // finally wird noch ausgeführt
        }
        finally {
            System.out.println("Text im finally Block");
        }
    }

    private static void tryCatchDemo() {
        System.out.println("Division mit 0");
        try {
            int n = 4 / 0;
            System.out.printf("in try-Block: Nach Division mit 0");
        }
        catch (ArithmeticException e)
        {
           // e.printStackTrace(); Reihenfolge der Methodenaufruf an dieser Stelle
            System.out.println("Problem: " + e.getMessage());
        }
        System.out.println("Nach catch-Block");
    }
}
