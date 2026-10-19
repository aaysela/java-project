public class Temperature {

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static void demo() {
        System.out.println("--- Конвертер температур ---");
        System.out.println("36.6 C = " + celsiusToFahrenheit(36.6) + " F");
    }
}
