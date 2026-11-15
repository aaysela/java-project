import java.util.Random;

public class GuessNumber {

    /** Компьютер загадывает число от 1 до 100. */
    public static int makeSecret(long seed) {
        return new Random(seed).nextInt(100) + 1;
    }

    /** Подсказка игроку: больше, меньше или угадал. */
    public static String hint(int secret, int guess) {
        if (guess < secret) {
            return "больше";
        }
        if (guess > secret) {
            return "меньше";
        }
        return "угадал";
    }

    public static void demo() {
        System.out.println("--- Угадай число ---");
        int secret = makeSecret(42);
        int low = 1;
        int high = 100;
        String answer;
        do {
            int guess = (low + high) / 2;
            answer = hint(secret, guess);
            System.out.println("Попытка " + guess + ": " + answer);
            if (answer.equals("больше")) {
                low = guess + 1;
            } else if (answer.equals("меньше")) {
                high = guess - 1;
            }
        } while (!answer.equals("угадал"));
    }
}
