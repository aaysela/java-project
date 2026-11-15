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

    public static void demo() {
        System.out.println("--- Максимум из трёх чисел ---");
        System.out.println("max(3, 9, 5) = " + max(3, 9, 5));
    }
}
