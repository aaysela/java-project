public class SumToN {

    public static int sumLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void demo() {
        System.out.println("--- Сумма от 1 до N ---");
        System.out.println("Сумма 1..10 (цикл) = " + sumLoop(10));
        System.out.println("Сумма 1..10 (формула) = " + sumFormula(10));
    }
}
