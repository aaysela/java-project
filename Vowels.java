public class Vowels {

    private static final String VOWELS = "аеёиоуыэюяaeiou";

    public static int count(String text) {
        int result = 0;
        for (char ch : text.toLowerCase().toCharArray()) {
            if (VOWELS.indexOf(ch) >= 0) {
                result++;
            }
        }
        return result;
    }

    public static void demo() {
        System.out.println("--- Подсчёт гласных ---");
        String text = "Инструментальные средства разработки";
        System.out.println("\"" + text + "\": " + count(text) + " гласных");
    }
}
