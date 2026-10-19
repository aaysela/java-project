public class EvenOdd {

    public static String check(int n) {
        if (n % 2 != 0) {
            return "нечётное";
        }
        return "чётное";
    }

    public static void demo() {
        System.out.println("--- Чётность числа ---");
        for (int n : new int[]{4, 7, 0, -3}) {
            System.out.println("DEBUG: проверка числа " + n);
            System.out.println(n + " — " + check(n));
        }
    }
}
