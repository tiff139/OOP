package op1a.extra;

public class FibonacciIterative {
    public static long fib(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
public static void main(String[] args) {
    for (int i = 0; i <= 10; i++) {
        System.out.println("fib(" + i + ") = " + fib(i));
    }
    System.out.println("fib(50) = " + fib(50));
}
}