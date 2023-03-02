package fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibNiave(3));
        System.out.println(fibNiave(5));
        System.out.println(fibEffectiv(40));
    }
    //наивный, медленный, очевидный
    private static long fibNiave(int n) {
        if (n <= 1) return n;

        return fibNiave(n - 1) + fibNiave(n - 2);
    }
    //задействовав доп память, сокращаем время работы
    // O(n) - сложность алгоритма
    private static long fibEffectiv(int n) {
        // O(n)
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        //O(n+n) => O(2n) => O(n) - не рассматриваем константы когда говорим об асимптотической сложности
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}
