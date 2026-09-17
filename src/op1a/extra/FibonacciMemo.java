package op1a.extra;
import java.util.HashMap;
import java.util.Map;

public class FibonacciMemo {
    private static Map<Integer, Long> cache = new HashMap<>();

    public static long fib(int n) {
        if (n <= 1) return n;
        if (cache.containsKey(n)) {
            return cache.get(n);       // schon berechnet -> direkt zurückgeben
        }
        long result = fib(n - 1) + fib(n - 2);
        cache.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(50));   // jetzt sofort berechenbar
    }
}