package op1a;

import static java.lang.StrictMath.pow;

public class VariablenTypen {
    public static void main(String[] args) {
        // Wertebereich aufsteigend: byte short int long float double
        long l1 = 2343434;
        double d = -234.67F;
        float f = (float) 234.919;  //Gefährliche Richtung, Cast nötig
        // Ü: 2 weitere gefährliche Umwandlungen
        byte b = (byte) 1234;
        int j = (int) 12345.678;
        System.out.println("b = " + b);
        System.out.println("j = " + j);

        //Ü: 1234, b in Binärschreibweise ausgeben und -46

        int dec = 1234;
        int e = -46;

        String bin = Integer.toBinaryString(dec);
        System.out.println("bin = " + bin);
        String bine = Integer.toBinaryString(e);
        System.out.println("e = " + bine);

    }
}

