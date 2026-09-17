package op1a;

import java.util.Arrays;

public class Aufgabe1 {
    public static void main(String[] args) {
        double[] dArr = {
                Math.random(),
                Math.random(),
                Math.random(),
                Math.random(),
                Math.random()

        };

        printArray(dArr);

        Arrays.sort(dArr);

        printArray(dArr);
    }

    private static void printArray(double[] dArr) {
        for (int i = 0; i < dArr.length; i++) {
            System.out.printf("%d, %f, %n", i + 1, dArr[i]);


        }
    }
}

