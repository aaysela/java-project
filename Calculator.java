public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return a / b;
    }

    public static void demo() {
        System.out.println("--- Калькулятор ---");
        System.out.println("Сложение: " + add(6, 4));
        System.out.println("Вычитание: " + subtract(6, 4));
        System.out.println("Умножение: " + multiply(6, 4));
        System.out.println("Деление: " + divide(6, 4));
    }
}
