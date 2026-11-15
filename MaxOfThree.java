public class MaxOfThree {

    public static int max(int a, int b, int c) {
        int result = a;
        if (b > result) {
            result = b;
        }
        if (c > result) {
            result = c;
        }
        return result;
    }

    public static String describe(int a, int b, int c) {
        if (a == b && b == c) {
            return "все числа равны: " + a;
        }
        return "максимум = " + max(a, b, c);
    }

    public static void demo() {
        System.out.println("--- Максимум из трёх чисел ---");
        System.out.println("3, 9, 5 -> " + describe(3, 9, 5));
        System.out.println("7, 7, 7 -> " + describe(7, 7, 7));
    }
}
