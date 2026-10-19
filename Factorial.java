public class Factorial {

    public static long recursive(int n) {
        return n <= 1 ? 1 : n * recursive(n - 1);
    }

    public static long iterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void demo() {
        System.out.println("--- Факториал ---");
        System.out.println("5! (рекурсия) = " + recursive(5));
        System.out.println("5! (цикл) = " + iterative(5));
    }
}
