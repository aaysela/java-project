public class Factorial {

    public static long recursive(int n) {
        return n <= 1 ? 1 : n * recursive(n - 1);
    }

    public static void demo() {
        System.out.println("--- Факториал ---");
        System.out.println("5! (рекурсия) = " + recursive(5));
    }
}
