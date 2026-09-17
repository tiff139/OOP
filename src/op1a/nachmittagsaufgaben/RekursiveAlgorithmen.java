package op1a.nachmittagsaufgaben;

public class RekursiveAlgorithmen {
    public static void main(String[] args) 
    {
        long res = factorial(5);
        System.out.println("res = " + res);
        // Ü: größere ganze zahlen als lobg: BigInteger beliebig groß
    }

    private static long factorial(int n)
    {
        // Abbruchbedingung
        if (n == 1)
        {
            return 1;
        }
        else
        {
            return factorial(n - 1) * n;
        }
    }
}
